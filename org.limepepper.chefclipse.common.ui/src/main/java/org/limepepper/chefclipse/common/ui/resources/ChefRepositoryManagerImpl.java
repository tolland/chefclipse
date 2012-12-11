package org.limepepper.chefclipse.common.ui.resources;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.codehaus.jackson.JsonParseException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.File;
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.Template;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;
import org.limepepper.chefclipse.model.ChefFile;
import org.limepepper.chefclipse.model.ModelFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class ChefRepositoryManagerImpl implements ChefRepositoryManager,
        IKnifeManager {

    Logger                                   logger         = LoggerFactory
                                                                    .getLogger(ChefRepositoryManagerImpl.class);

    /**
     * so this is a back and forth mapping of the model to resources,
     * its used in various places for easy access to the respective object
     *
     * @todo I am pretty sure there is a better way!
     *
     *
     */
    private Map<IResource, EObject>          elements       = new HashMap<IResource, EObject>();
    private Map<EObject, IResource>          resources      = new HashMap<EObject, IResource>();

    /**
     * @todo no idea!
     *
     */
    private ResourceSet                      resourceSet    = new ResourceSetImpl();
    private Resource                         masterResource = null;

    Map<String, EObject>                     cache          = new HashMap<String, EObject>();

    private static ChefRepositoryManagerImpl instance       = null;

    static ChefRepositoryManagerImpl instance() {
        if (instance == null) {
            instance = new ChefRepositoryManagerImpl();
        }

        return instance;
    }

    protected ChefRepositoryManagerImpl() {

    }

    private void delete(IResource resource) {

        EObject eObject = getElement(resource);
        if (eObject != null) {

            elements.remove(eObject);
            resources.remove(eObject);
            try {
                if (eObject instanceof CookbookFile) {
                    ((CookbookFile) eObject).getCookbook().eContents()
                            .remove(eObject);
                } else if (eObject instanceof CookbookVersion) {
                    // ((CookbookVersion)eObject).get
                    // Cookbook().eContents().remove(eObject);

                    getRepository(resource.getProject()).getCookbooks().remove(
                            ((CookbookVersion) eObject));

                }
            } catch (Exception e) {
                // e.printStackTrace();
                logger.debug("Not able to completely delete without NPE");
            }
        }

/*
 * if (cookbookResource != null && deleteResource) {
 * cookbookResource.getParent().delete(true, null);
 * }
 */

    }

    public EObject create(IResource resource) {
        logger.debug("create for element " + resource + " "
                + resource.getType());

        EObject eObject = null;
        try {
            switch (resource.getType()) {
            case IResource.ROOT:

            // can't create root objects
            /*
             * if (ChefTester.instance().test(resource, "isWorkspace")) {
             * return instance().createChefWorkspace((IProject) resource);
             * }
             */
            break;
            case IResource.PROJECT:
                if ((resource instanceof IProject)
                        && ((IProject) resource)
                                .isNatureEnabled(ChefProjectNature.NATURE_ID)) {
                    logger.debug("opening project and repository: {}",
                            ((IProject) resource).getName());
                    eObject = createRepository((IProject) resource);
                    // ChefProject new ChefProject();
                    // @todo return ChefProject
                }
            break;
            case IResource.FOLDER:

                if (((IFolder) resource).getParent().getName()
                        .equals("cookbooks")
                        && (((IFolder) resource).getFile("metadata.rb")
                                .exists())
                        && (((IFolder) resource).getFile("metadata.json")
                                .exists())) {

                    eObject = createCookbook((IFolder) resource);

                }

                if (((IFolder) resource).getParent().getName()
                        .equals("configuration")) {
                    logger.debug("not implemented");
                    // return instance().createCookbook((IFolder) resource);
                }
            break;
            case IResource.FILE:
                // @todo this is not used, because recipes cannot be created
                // from eclipse atm
                if (((IFile) resource).getParent().getName().equals("recipes")) {
                    eObject = createRecipe((IFile) resource);
                }
                // if a file appears in a dir, called metadata.rb, then this
                // should trigger
                // check on making the parent a cookbook folder
                if (((IFile) resource).equals("metadata.rb")) {
                    eObject = createCookbook((IFolder) resource.getParent());
                }

                if (((IFile) resource).getParent().getName().equals(".chef")) {
                    logger.debug("not implemented");
                    // return instance().createDefinition((IFile) resource);
                }
            break;
            default:
            break;
            }
        } catch (CoreException e) {

            e.printStackTrace();
        } finally {
            persistRepo((IResource) resource);
        }

        if ((eObject != null) && (eObject instanceof NamedObject)) {

            ((NamedObject) eObject).setID(eObject.eClass() + "-"
                    + ((NamedObject) eObject).getName() + "-");

        }

        return eObject;
    }

    void initResource(IProject project) {

        String path = project.getName() + "/.workstation";
        logger.debug("repo basepath was :" + path);
        URI fileURI = URI.createPlatformResourceURI(path, true);
        masterResource = resourceSet.createResource(fileURI);
        // masterResource = resourceSet.getResource(fileURI, true);
        // ((Object) masterResource).setIntrinsicIDToEObjectMap(cache);

    }

    public Repository getRepository(IProject project) {
        return (Repository) getElement(project);
    }

    public EObject getElement(IResource resource) {
        if (!elements.containsKey(resource)
                && !elements.containsKey(resource.getProject())) {
            create(resource.getProject());
        }

        return elements.get(resource);
    }

    public IResource getResource(EObject element) {
        return resources.get(element);
    }

    public void add(IResource resource) {
        // logger.debug("adding resource " + resource.toString());
        create(resource);
    }

    public void resetRepository(IResource resource) {
        delete(resource.getProject());
        add(resource.getProject());

    }

    /**
     *
     * allows some gui component to ask for the derved list of matching
     * cookbooks
     * to be updated
     *
     * @param cookbook
     */
    public void updateDependsLists(CookbookVersion cookbook) {

        for (Entry<String, String> entry : cookbook.getMetadata()
                .getDependencies().entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = "
                    + entry.getValue());
            System.out.println("searching for key in :" + entry.getKey());
            if (cache.containsKey(entry.getKey())) {
                System.out.println("adding to depends in :" + entry.getKey());
                cookbook.getDepends().add(
                        (CookbookVersion) cache.get(entry.getKey()));

            }
        }

    }

    public Metadata createCookbookMetadata(IFolder resource) {
        try {
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
                    "json", new JsResourceFactoryImpl());

            Map<String, Object> options = new HashMap<String, Object>();
            options.put(EMFJs.OPTION_ROOT_ELEMENT,
                    CookbookPackage.eINSTANCE.getMetadata());

            URI fileURI = URI.createPlatformResourceURI(resource.getFullPath()
                    + "/metadata.json", true);

            Resource metadata = resourceSet.createResource(fileURI);

            assertNotNull(metadata);

            metadata.load(options);

            assertNotNull(metadata);
            Metadata eObject = (Metadata) metadata.getContents().get(0);

            System.out.println("cookbook name from metadata is:"
                    + eObject.getName());

            Metadata eObject2 = EcoreUtil.copy(eObject);

            eObject.setID(eObject.eClass().getInstanceTypeName().toLowerCase()
                    + "-" + ((NamedObject) eObject).getName() + "-");
            eObject2.setID(Long.toString(UUID.randomUUID()
                    .getMostSignificantBits()));
            return eObject2;

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
    }

    public CookbookVersion createCookbook(IFolder resource)
            throws CoreException {

        CookbookVersion eObject = CookbookFactory.eINSTANCE
                .createCookbookVersion();
        eObject.setName(resource.getName());
        eObject.setMetadata(CookbookFactory.eINSTANCE.createMetadata());

        eObject.setID(eObject.eClass().getInstanceTypeName().toLowerCase()
                + "-" + ((NamedObject) eObject).getName() + "-");
        eObject.getAttributes();
        Repository repo = (Repository) getElement(resource.getProject());

        repo.getCookbooks().add(eObject);

        Metadata updateMetadata = createCookbookMetadata(resource);
        if (updateMetadata != null)
            eObject.setMetadata(updateMetadata);

        logger.debug("creating cookbook:" + resource.getName());
        addMapping(resource, eObject);

        synchronizeCookbookContents(eObject, (IFolder) resource);

        System.err.println("cookbook :" + eObject.getName() + "  has "
                + eObject.getMetadata().getDependencies().toString());

        cache.put(eObject.getName() + "-" + eObject.getMetadata().getVersion(),
                eObject);
        // @todo just a hack until i have implementented some version checker
        cache.put(eObject.getName(), eObject);

        updateDependsLists(eObject);

        String path = resource.getFullPath().append("/.cookbook").toString();
        // logger.debug("cookbook path is :" + path);
        URI fileURI = URI.createPlatformResourceURI(path, true);
        Resource cookbookResource = resourceSet.createResource(fileURI);
        cookbookResource.getContents().add(eObject);

        return eObject;
    }

    public Repository createRepository(IProject resource) throws CoreException {
        initResource(resource);
        Repository eObject = WorkstationFactory.eINSTANCE.createRepository();
        masterResource.getContents().add(eObject);
        eObject.setName(resource.getName());
        eObject.setID(eObject.eClass().getInstanceTypeName().toLowerCase()
                + "-" + ((NamedObject) eObject).getName() + "-");
        logger.debug("creating repo:" + resource.getName());

        addMapping(resource, eObject);

        synchronizeRepository((IContainer) resource);
        readInKnifeConfigs(resource);

        for (CookbookVersion cookbook : eObject.getCookbooks()) {
            updateDependsLists(cookbook);
        }

        return eObject;
    }

    public void deleteCookbook(CookbookVersion cookbook, boolean deleteResource)
            throws CoreException {
        for (Recipe recipe : cookbook.getRecipes()) {
            IResource recipeResource = resources.get(recipe);
            elements.remove(recipeResource);
            resources.remove(recipe);
        }

        IFolder cookbookResource = (IFolder) resources.get(cookbook);
        elements.remove(cookbookResource);
        resources.remove(cookbook);

        if (cookbookResource != null && deleteResource) {
            cookbookResource.getParent().delete(true, null);
        }

        // cookbook.get().getCookbooks().remove(CookbookVersion);
    }

    public ChefFile createRecipe(IFile resource) throws CoreException {

        Recipe eObject = CookbookFactory.eINSTANCE.createRecipe();
        addCheckSum(resource, (ChecksumFile) eObject);
        eObject.setName(resource.getName().substring(0,
                resource.getName().lastIndexOf('.')));
        addMapping(resource, eObject);

        try {
            CookbookVersion cookbookVersion = (CookbookVersion) getElement(getCookbookForResource(resource));
            cookbookVersion.getRecipes().add(eObject);
            eObject.setCookbook(cookbookVersion);

        } catch (Exception e) {
            logger.debug("cookbook not existing1:"
                    + getCookbookForResource(resource));
            create(getCookbookForResource(resource));
        }

        eObject.setID(eObject.eClass().getInstanceTypeName().toLowerCase()
                + "-" + ((NamedObject) eObject).getName() + "-"
                + eObject.getCookbook().getID());

        ChefFile chefFile = ModelFactory.eINSTANCE.createChefFile();
        chefFile.setResource(resource);

        return chefFile;
    }

    /**
     * hack function @todo remove this
     *
     * @param resource
     * @param checksumFile
     */
    void addCheckSum(IFile file, ChecksumFile checksumFile) {
        byte[] checksum = null;
        try {
            checksum = sha256sum(slurp(file.getContents()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CoreException e) {
            e.printStackTrace();
        }
        /*
         * try {
         * checksumFile.setChecksum(new String(checksum,"UTF-8"));
         *
         * } catch (UnsupportedEncodingException e) {
         * e.printStackTrace();
         * }
         */
        checksumFile.setChecksum("123");
        checksumFile.setPath(pathRelativeToCookbook(file));
        checksumFile.setSpecificity(getSpecificity(file));
    }

    /**
     * so this is a hack function to return the path relative to the cookbook
     * not sure how the most appropriate way to populate this field should be
     *
     * @todo so the main hack is that it wouldn;t support other cookbook dir
     *       names
     *       which the knife.rb clearly does by using an array for specifying
     *
     * @return
     */
    private String pathRelativeToCookbook(IFile file) {
        String str = file.getFullPath().toString();
        int beginCookbooks = str.indexOf("cookbooks/");
        return str.substring(str.indexOf("cookbooks/") + 10);
    }

    private String getSpecificity(IFile file) {
        String str = file.getFullPath().toString();
        int beginCookbooks = str.indexOf("cookbooks/");
        int beginCookbooksNext = str.indexOf("cookbooks/") + 10;
        int endCookbooksNext = str.indexOf("/", beginCookbooksNext);
        return str.substring(beginCookbooksNext, endCookbooksNext);
    }

/*
 * {
 * "name": "default.rb",
 * "url":
 * "https://s3.amazonaws.com/opscode-platform-production-data/organization-(...)"
 * ,
 * "checksum": "ba0dadcbca26710a521e0e3160cc5e20",
 * "path": "recipes/default.rb",
 * "specificity": "default"
 * }
 *
 * @todo migrate this to the emf version
 */

    private byte[] sha256sum(String filestr) throws NoSuchAlgorithmException {

        StringBuffer sb = new StringBuffer();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(filestr.getBytes());

        return hash;
    }

    private static String slurp(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1;) {
            out.append(new String(b, 0, n));
        }
        return out.toString();
    }

    public void deleteRecipe(Recipe recipe, boolean deleteResource)
            throws CoreException {
        IFile recipeResource = (IFile) resources.get(recipe);
        elements.remove(recipeResource);
        resources.remove(recipe);

        if (recipeResource != null && deleteResource) {
            recipeResource.delete(true, null);
        }

        // recipe.getCookbook().getRecipes().remove(recipe);
        /*
         * for(CookbookVersion cookbook: recipe.getCookbook()){
         * cookbook.getRecipes().remove(recipe);
         * }
         */
    }

    public void createTemplate(IFile resource) throws CoreException {
        if ((resource.getFileExtension() != null)
                && resource.getFileExtension().equals("erb")) {
            Template eObject = CookbookFactory.eINSTANCE.createTemplate();
            addCheckSum(resource, (ChecksumFile) eObject);
            try {
                CookbookVersion cookbookVersion = (CookbookVersion) getElement(getCookbookForResource(resource));
                cookbookVersion.getTemplates().add(eObject);
                eObject.setCookbook(cookbookVersion);

            } catch (Exception e) {
                logger.debug("cookbook for template " + resource.getName()
                        + " not existing:" + getCookbookForResource(resource));

            }
            eObject.setName(resource.getName().substring(0,
                    resource.getName().lastIndexOf('.')));
            eObject.setID(Long.toString(UUID.randomUUID()
                    .getMostSignificantBits()));

            addMapping(resource, eObject);
        }
    }

    public void createFile(IFile resource) throws CoreException {

        File eObject = CookbookFactory.eINSTANCE.createFile();
        try {
            CookbookVersion cookbookVersion = (CookbookVersion) getElement(resource
                    .getParent());
            cookbookVersion.getFiles().add(eObject);
            eObject.setCookbook(cookbookVersion);

        } catch (Exception e) {
            logger.debug("cookbook not existing:" + resource.getParent());
        }
        eObject.setName(resource.getName().substring(0,
                resource.getName().lastIndexOf('.')));
        eObject.setID(Long.toString(UUID.randomUUID().getMostSignificantBits()));

        addMapping(resource, eObject);

    }

    public void createDefinition(IFile resource) throws CoreException {

        Definition eObject = CookbookFactory.eINSTANCE.createDefinition();
        try {
            CookbookVersion cookbookVersion = (CookbookVersion) getElement(resource
                    .getParent());
            cookbookVersion.getDefinitions().add(eObject);
            eObject.setCookbook(cookbookVersion);

        } catch (Exception e) {
            logger.debug("cookbook not existing:" + resource.getParent());
        }
        eObject.setName(resource.getName().substring(0,
                resource.getName().lastIndexOf('.')));
        eObject.setID(Long.toString(UUID.randomUUID().getMostSignificantBits()));

        addMapping(resource, eObject);

    }

    public void createProvider(IFile resource) throws CoreException {
        if (resource.getFileExtension().equals("rb")) {
            Template eObject = CookbookFactory.eINSTANCE.createTemplate();
            addCheckSum(resource, (ChecksumFile) eObject);
            try {
                CookbookVersion cookbookVersion = (CookbookVersion) getElement(getCookbookForResource(resource));
                cookbookVersion.getTemplates().add(eObject);
                eObject.setCookbook(cookbookVersion);

            } catch (Exception e) {
                logger.debug("cookbook not existing:" + resource.getParent());
            }
            eObject.setName(resource.getName().substring(0,
                    resource.getName().lastIndexOf('.')));
            eObject.setID(Long.toString(UUID.randomUUID()
                    .getMostSignificantBits()));
            addMapping(resource, eObject);
        }
    }

    /**
     * This is a chef cookbooks resource, not an IResource, or an EMF resource <br/>
     * see <a
     * href="http://docs.opscode.com/resource.html">http://docs.opscode.com
     * /resource.html</a> <br/>
     * <a
     * href="http://docs.opscode.com/chef/resources.html">http://docs.opscode.
     * com/chef/resources.html</a> <br/>
     *
     * @param file
     * @throws CoreException
     */
    public void createResource(IFile file) throws CoreException {
        if (file.getFileExtension().equals("rb")) {
            org.limepepper.chefclipse.common.cookbook.Resource eObject = CookbookFactory.eINSTANCE
                    .createResource();
            addCheckSum(file, (ChecksumFile) eObject);
            try {
                CookbookVersion cookbookVersion = (CookbookVersion) getElement(getCookbookForResource(file));
                cookbookVersion.getResources().add(eObject);
                eObject.setCookbook(cookbookVersion);

            } catch (Exception e) {
                e.printStackTrace();
                logger.debug("cookbook not existing:"
                        + getCookbookForResource(file));
            }
            eObject.setName(file.getName().substring(0,
                    file.getName().lastIndexOf('.')));
            eObject.setID(Long.toString(UUID.randomUUID()
                    .getMostSignificantBits()));

            addMapping(file, eObject);
        }
    }

    /**
     * nasty hack
     *
     * @param file
     * @return
     */
    public IResource getCookbookForResource(IResource resource) {
        // logger.debug("path is:" + resource.getFullPath().toString());
        if (resource.getParent().getName().equals("cookbooks")) {
            // logger.debug("returning:" + resource.getName());
            return resource;
        } else {
            return getCookbookForResource(resource.getParent());
        }
    }

    public void deleteTemplate(Template template, boolean deleteResource)
            throws CoreException {
        IFile templateResource = (IFile) resources.get(template);
        elements.remove(templateResource);
        resources.remove(template);

        if (templateResource != null && deleteResource) {
            templateResource.delete(true, null);
        }

        template.getCookbook().getTemplates().remove(template);
        /*
         * for(CookbookVersion cookbook: recipe.getCookbook()){
         * cookbook.getRecipes().remove(recipe);
         * }
         */
    }

    public void remove(IResource resource) {
        delete(resource);
    }

    private void addMapping(IResource resource, EObject element) {
        elements.put(resource, element);
        resources.put(element, resource);
    }

    /*
     * Synchronizes the content of the repository object with the on-disk
     * structure
     */
    private void synchronizeRepository(IContainer location)
            throws CoreException {

        /**
         * loop over the folders at the top level look for the cookbooks
         *
         * @todo chef supports multipul cookbook dirs, and alternative locations
         *       so this needs to be fixed
         *
         */
        for (IResource res : location.members()) {
            if ((res instanceof IFolder) && res.getName().equals("cookbooks")) {
                synchronizeCookbooks((IFolder) res);
            }
        }

        persistRepo(location);
    }

    /*
     * Creates cookbook objects from the on-disk structure
     */
    private boolean synchronizeCookbooks(IFolder location) throws CoreException {
        for (IResource resource : location.members()) {
            if ((resource instanceof IFolder)
                    && (((IFolder) resource).getFile("metadata.rb").exists())) {
                createCookbook((IFolder) resource);
            }
        }
        return true;
    }

    /*
     * Creates a cookbook object from the on-disk structure
     * ToDo: implement the creation of recipes. Now only one dummy recipe is
     * created
     */
    private void synchronizeCookbookContents(CookbookVersion cookbook,
            IFolder location) throws CoreException {
        for (IResource res : location.members()) {
            if (res instanceof IFolder) {
                if (res.getName().equals("recipes")) {
                    for (IResource resource : ((IFolder) res).members()) {
                        if ((resource instanceof IFile)
                                && (((IFile) resource).getName().endsWith("rb"))) {
                            createRecipe((IFile) resource);
                        }

                    }
                } else if (res.getName().equals("providers")) {
                    for (IResource resource : ((IFolder) res).members()) {
                        if (resource instanceof IFile) {
                            createProvider((IFile) resource);
                        }
                    }

                } else if (res.getName().equals("resources")) {
                    for (IResource resource : ((IFolder) res).members()) {
                        if (resource instanceof IFile) {
                            createResource((IFile) resource);
                        }
                    }
                } else if (res.getName().equals("definitions")) {
                    for (IResource resource : ((IFolder) res).members()) {
                        if (resource instanceof IFile) {
                            createDefinition((IFile) resource);
                        }
                    }
                } else if (res.getName().equals("files")) {
                    recurseFilesDir((IFolder) res);

                } else if (res.getName().equals("templates")) {
                    recurseTemplatesDir((IFolder) res);
                }
            }
        }
    }

    private void recurseTemplatesDir(IFolder folder) throws CoreException {
        for (IResource resource : folder.members()) {
            if (resource instanceof IFile) {
                createTemplate((IFile) resource);
            }
            if (resource instanceof IFolder) {
                recurseTemplatesDir((IFolder) resource);
            }
        }
    }

    private void recurseFilesDir(IFolder folder) throws CoreException {
        for (IResource resource : folder.members()) {
            if (resource instanceof IFile) {
                createFile((IFile) resource);
            }
            if (resource instanceof IFolder) {
                recurseTemplatesDir((IFolder) resource);
            }
        }
    }

    private void persistRepo(IResource resource) {
        logger.debug("persisting resourceSet");

        masterResource.getContents().add(getElement(resource.getProject()));

        Job job = new Job("My Job") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        try {

                            List<URI> savelist = new ArrayList<URI>();
                            for (Resource res : resourceSet.getResources()) {
                                if (res.getURI().lastSegment()
                                        .endsWith(".cookbook")) {
                                    logger.debug("saving: {}", res.getURI()
                                            .lastSegment());
                                    logger.debug("saving: {}", res.getURI());

                                    // res
                                    // .save(Collections.EMPTY_MAP);
                                    savelist.add(res.getURI());
                                }
                            }

                            for (URI saveme : savelist) {
                                resourceSet.getResource(saveme, false);
                            }

                            masterResource.save(Collections.EMPTY_MAP);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                return Status.OK_STATUS;
            }
        };
        job.schedule(2000);
    }

    CookbookVersion getCookbookByName(String name) {

        // setIntrinsicIDToEObjectMap

        return null;
    }

    public Resource openEcoreResource(IResource resource) {
        Map<String, Object> options = new HashMap<String, Object>();
        String path = resource.getFullPath().toString();
        logger.debug("knife path was :" + path);
        URI fileURI = URI.createPlatformResourceURI(path, true);
        Resource ecoreResource = resourceSet.createResource(fileURI);
        try {
            ecoreResource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ecoreResource;
    }

    Set<KnifeConfig> knives = new HashSet<KnifeConfig>(1);

    public void readInKnifeConfigs(IProject project) {
        try {
            knives.clear();

            for (IResource resource : project.members()) {
                if (resource instanceof IFile) {
                    if (resource.getName().endsWith(".knife")) {
                        // ChefRepositoryManagerImpl.instance().add(resource);

                        Resource knifeResource = ChefRepositoryManagerImpl
                                .instance().openEcoreResource(resource);
                        logger.debug("knifeResource.getContents() {}",
                                knifeResource.getContents().size());
                        for (EObject eObject : knifeResource.getContents()) {
                            if (eObject instanceof KnifeConfig) {
                                knives.add((KnifeConfig) eObject);
                            }
                        }
                    }
                }
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    public Collection<KnifeConfig> getKnives(IProject iProject) {
        return knives;
    }

    @Override
    public void synchronizeKnifeConfigs(IProject project) {
    }

    @Override
    public IFolder getResource(CookbookVersion cookbook) {
        return null;
    }

}
