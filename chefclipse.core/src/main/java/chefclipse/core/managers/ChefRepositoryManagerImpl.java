package chefclipse.core.managers;

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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.swt.widgets.Display;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.cookbook.Attributes;
import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.File;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.common.cookbook.Provider;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.cookbook.Template;
import org.limepepper.chefclipse.common.cookbook.util.CookbookSwitch;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.IdentObject;
import org.limepepper.chefclipse.utility.NamedObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.builders.ChefProjectNature;
import chefclipse.core.utils.ChefUtils;

public class ChefRepositoryManagerImpl implements ChefRepositoryManager {
	static Logger logger = LoggerFactory
			.getLogger(ChefRepositoryManagerImpl.class);

	/**
	 * so this is a back and forth mapping of the model to resources, its used
	 * in various places for easy access to the respective object
	 *
	 * @todo I am pretty sure there is a better way!
	 *
	 *
	 */
	private Map<IResource, EObject> elements = new HashMap<IResource, EObject>();
	private Map<EObject, IResource> resources = new HashMap<EObject, IResource>();

	/**
	 * @todo no idea!
	 *
	 */
	private ResourceSet resourceSet = new ResourceSetImpl();
	private Resource masterResource = null;
	Map<String, EObject> cache = new HashMap<String, EObject>();
	Map<String, String> options = new HashMap<String, String>();

	private static ChefRepositoryManagerImpl instance = null;

	static ChefRepositoryManagerImpl instance() {
		if (instance == null) {
			instance = new ChefRepositoryManagerImpl();
		}

		return instance;
	}

	public void registerAdapter(AdapterFactory factory) {
		resourceSet.getAdapterFactories().add(factory);

	}

	protected ChefRepositoryManagerImpl() {
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		options.put(XMLResource.OPTION_LINE_WIDTH, "100");

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
							(eObject));

				}
			} catch (Exception e) {
				// e.printStackTrace();
				logger.debug("Not able to completely delete without NPE");
			}
		}
	}

	public EObject create(IResource resource) {
		logger.debug("create element for IResource " + resource + " "
				+ resource.getType());

		/*
		 * holds the element that is the singleton model item corresponding to
		 * the chef entity, e.g. cookbook, repository, recipe (rather than the
		 * chefclipse equivalent)
		 */
		// @todo root this at the base of the chef model.
		EObject eObject = null;
		try {
			switch (resource.getType()) {
			case IResource.ROOT:

				break;
			case IResource.PROJECT:
				if ((resource instanceof IProject)
						&& ((IProject) resource)
								.isNatureEnabled(ChefProjectNature.NATURE_ID)) {
					logger.debug("opening project and repository: {}",
							((IProject) resource).getName());
					eObject = createRepository((IProject) resource);

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
						.equals("data_bags")) {
					eObject = createDataBag((IFolder) resource);
				}

				if (((IFolder) resource).getParent().getName()
						.equals("configuration")) {
					logger.debug("not implemented");
				}
				break;
			case IResource.FILE:
				// @todo this is not used, because recipes cannot be created
				// from eclipse atm
				if (((IFile) resource).getParent().getName().equals("recipes")) {
					eObject = createCookbookFile((IFile) resource,
							CookbookPackage.eINSTANCE.getRecipe());
				}
				// if a file appears in a dir, called metadata.rb, then this
				// should trigger
				// check on making the parent a cookbook folder
				IContainer parent = ((IFile) resource).getParent();
				if (parent != null) {
					if (((parent.getName().toLowerCase().equals("data_bags") || (parent
							.getParent() != null && parent.getParent()
							.getName().toLowerCase().equals("data_bags"))))
							&& ((IFile) resource).getName().toLowerCase()
									.endsWith("json")) {
						eObject = createDataBagItem((IFile) resource);
					}
				}
				if (((IFile) resource).getName().equals("metadata.rb")) {
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
			// persistRepo((IResource) resource);
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
	 * cookbooks to be updated
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

		Repository repo = (Repository) getElement(resource.getProject());

		assertNotNull(repo);
		assertNotNull(eObject);

		repo.getCookbooks().add(eObject);

		Metadata updateMetadata = createCookbookMetadata(resource);
		if (updateMetadata != null)
			eObject.setMetadata(updateMetadata);

		logger.debug("creating cookbook:" + resource.getName());
		addMapping(resource, eObject);

		synchronizeCookbookContents(eObject, resource);

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

	@Override
	public EObject createDataBag(IFolder resource) throws CoreException {
		DataBag eObject = ChefserverFactory.eINSTANCE.createDataBag();
		eObject.setDescription("databag description");
		eObject.setID(eObject.eClass().getInstanceTypeName().toLowerCase()
				+ "-" + ((NamedObject) eObject).getName() + "-");
		// TODO set the server to the data bag.
		eObject.setName(resource.getName());
		eObject.setResource(resource);
		logger.debug("creating data bag:" + resource.getName());

		addMapping(resource, eObject);

		// add the data bag to the databag list of the server. maybe retrieve
		// the server from preferences.

		synchronizeDataBagContents(resource);

		return eObject;
	}

	@Override
	public EObject createDataBagItem(IFile resource) {
		DataBagItem eObject = ChefserverFactory.eINSTANCE.createDataBagItem();
		eObject.setId(eObject.eClass().getInstanceTypeName().toLowerCase()
				+ "-" + ((IdentObject) eObject).getId() + "-");
		eObject.setId(resource.getName());
		eObject.setJsonResource(resource);
		IContainer parent = resource.getParent();
		DataBag dataBag = (DataBag) getElement(parent);
		eObject.setDataBag(dataBag);
		dataBag.getItems().add(eObject);
		addMapping(resource, eObject);
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

		synchronizeRepository(resource);
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

	/**
	 * pass the EClass for the type
	 *
	 * @param resource
	 * @param eClass
	 * @return
	 * @throws CoreException
	 */
	public CookbookFile createCookbookFile(final IFile resource, EClass eClass)
			throws CoreException {

		CookbookFile eObject = (CookbookFile) CookbookFactory.eINSTANCE
				.create(eClass);

		addCheckSum(resource, eObject);
		eObject.setName(resource.getName());
		addMapping(resource, eObject);

		try {
			final CookbookVersion cookbookVersion = (CookbookVersion) getElement(getCookbookForResource(resource));
			CookbookSwitch<CookbookFile> cookbookFileSwitch = new CookbookSwitch<CookbookFile>() {

				@Override
				public CookbookFile caseRecipe(Recipe eObject) {
					cookbookVersion.getRecipes().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseAttributes(Attributes eObject) {
					cookbookVersion.getAttributes().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseProvider(Provider eObject) {
					cookbookVersion.getProviders().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseRoot_file(Root_file eObject) {
					cookbookVersion.getRoot_files().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseFile(File eObject) {
					cookbookVersion.getFiles().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseLibrary(Library eObject) {
					cookbookVersion.getLibraries().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseDefinition(Definition eObject) {
					cookbookVersion.getDefinitions().add(eObject);
					return eObject;
				}

				@Override
				public CookbookFile caseTemplate(Template eObject) {
					cookbookVersion.getTemplates().add(eObject);
					return eObject;
				}

			};
			cookbookFileSwitch.doSwitch(eObject);
			// cookbookVersion.getRecipes().add(eObject);
			eObject.setCookbook(cookbookVersion);

		} catch (Exception e) {
			create(getCookbookForResource(resource));
		}

		eObject.setID(eObject.eClass().getInstanceTypeName().toLowerCase()
				+ "-" + ((NamedObject) eObject).getName() + "-"
				+ eObject.getCookbook().getID());

		return eObject;
	}

	/**
	 * hack function @todo remove this
	 *
	 * @param resource
	 * @param checksumFile
	 */
	void addCheckSum(IFile file, ChecksumFile checksumFile) {

		try {

			String checksum = ChefUtils.hexMd5Sum(file.getContents());
			checksumFile.setChecksum(checksum);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	/*
	 * static byte[] md5sum(byte[] filebytes) throws NoSuchAlgorithmException {
	 *
	 * MessageDigest md = MessageDigest.getInstance("MD5"); byte[] hash =
	 * md.digest(filebytes);
	 *
	 * logger.debug("hash length is:{}", hash.length); // logger.deb return
	 * hash; }
	 */
	static String md5sum(InputStream is) throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("MD5");

		// Create the byte array to hold the data
		byte[] bytes = new byte[8 * 1024];
		byte[] hash = null;

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		try {
			while (offset < bytes.length
					&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
				hash = md.digest(bytes);
			}
			logger.debug("hash length is:{}", bytes2String(hash));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// logger.deb
		return bytes2String(hash);
	}

	// @todo utils bundle
	static String bytes2String(byte[] bytes) {
		StringBuilder string = new StringBuilder();
		for (byte b : bytes) {
			String hexString = Integer.toHexString(0x00FF & b);
			string.append(hexString.length() == 1 ? "0" + hexString : hexString);
		}
		return string.toString();
	}

	/**
	 * so this is a hack function to return the path relative to the cookbook
	 * not sure how the most appropriate way to populate this field should be
	 *
	 * @todo so the main hack is that it wouldn;t support other cookbook dir
	 *       names which the knife.rb clearly does by using an array for
	 *       specifying
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

	private byte[] sha256sum(byte[] bytes) throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hash = md.digest(bytes);

		logger.debug("hash length is:{}", hash.length);
		// logger.debug("hash string is:{}", new String(hash));
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
	}

	// @todo move to utils

	public static IResource lookUpForCookbookResource(IResource resource)
			throws Exception {

		if (resource instanceof IFile) {

			return lookUpForCookbookResource(resource.getParent());
		} else if (resource instanceof IFolder) {
			// @todo hack, need to replace with search the cookbooks dir array
			if (resource.getParent().getName().equals("cookbooks")) {
				return resource;
			} else {
				return lookUpForCookbookResource(resource.getParent());
			}
		} else {
			//
			throw new Exception("not in a cookbook subdirectory");

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
			addCheckSum(file, eObject);
			try {
				CookbookVersion cookbookVersion = (CookbookVersion) getElement(getCookbookForResource(file));
				cookbookVersion.getResources().add(eObject);
				eObject.setCookbook(cookbookVersion);

			} catch (Exception e) {
				e.printStackTrace();
				logger.debug("cookbook not existing:"
						+ getCookbookForResource(file));
			}
			/*
			 * if (resource.getName().lastIndexOf('.') != -1) {
			 * eObject.setName(resource.getName().substring(0,
			 * resource.getName().lastIndexOf('.'))); } else {
			 */
			eObject.setName(file.getName());
			/* } */
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
		 * cookbook.getRecipes().remove(recipe); }
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
			if ((res instanceof IFolder) && res.getName().equals("data_bags")) {
				synchronizeDataBags((IFolder) res);
			}
		}
		persistRepo(location);
	}

	private boolean synchronizeDataBags(IFolder location) throws CoreException {
		for (IResource resource : location.members()) {
			if (resource instanceof IFolder) {
				createDataBag((IFolder) resource);
			}
			// in case there is a databagitem inside the data_bags folder.
			if (resource instanceof IFile
					&& ((IFile) resource).getName().toLowerCase()
							.endsWith("json")) {
				createDataBagItem((IFile) resource);
			}
		}
		return true;
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

	private void synchronizeDataBagContents(IFolder location)
			throws CoreException {
		for (IResource res : location.members()) {
			if (res instanceof IFile
					&& ((IFile) res).getName().endsWith("json")) {
				createDataBagItem((IFile) res);
			}
		}
	}

	/*
	 * Creates a cookbook object from the on-disk structure ToDo: implement the
	 * creation of recipes. Now only one dummy recipe is created
	 */
	private void synchronizeCookbookContents(CookbookVersion cookbook,
			IFolder location) throws CoreException {
		for (IResource res : location.members()) {
			if (res instanceof IFolder) {
				if (res.getName().equals("recipes")) {
					for (IResource resource : ((IFolder) res).members()) {
						if ((resource instanceof IFile)
								&& (((IFile) resource).getName().endsWith("rb"))) {
							createCookbookFile((IFile) resource,
									CookbookPackage.eINSTANCE.getRecipe());
						}

					}
				} else if (res.getName().equals("providers")) {
					for (IResource resource : ((IFolder) res).members()) {
						if (resource instanceof IFile) {
							createCookbookFile((IFile) resource,
									CookbookPackage.eINSTANCE.getProvider());
						}
					}

				} else if (res.getName().equals("resources")) {
					for (IResource resource : ((IFolder) res).members()) {
						if (resource instanceof IFile) {
							createCookbookFile((IFile) resource,
									CookbookPackage.eINSTANCE.getResource());
						}
					}
				} else if (res.getName().equals("definitions")) {
					for (IResource resource : ((IFolder) res).members()) {
						if (resource instanceof IFile) {
							createCookbookFile((IFile) resource,
									CookbookPackage.eINSTANCE.getDefinition());
						}
					}
				} else if (res.getName().equals("attributes")) {
					for (IResource resource : ((IFolder) res).members()) {
						if (resource instanceof IFile) {
							createCookbookFile((IFile) resource,
									CookbookPackage.eINSTANCE.getAttributes());
						}
					}
				} else if (res.getName().equals("files")) {
					recurseFilesDir((IFolder) res);

				} else if (res.getName().equals("templates")) {
					recurseTemplatesDir((IFolder) res);
				}
			} else if (res instanceof IFile) {
				if (!isIgnored(res)) {
					createCookbookFile((IFile) res,
							CookbookPackage.eINSTANCE.getRoot_file());

				}
			}
		}
	}

	public static boolean isIgnored(IResource resource) {
		if (resource.isDerived()) {
			return true;
		}
		if (resource.getName().endsWith(".workstation")
				|| resource.getName().equals(".cookbook")
				|| resource.getName().equals(".cookbooksource")
				|| resource.getName().endsWith(".knife"))
			return true;
		return false;
	}

	private void recurseTemplatesDir(IFolder folder) throws CoreException {
		for (IResource resource : folder.members()) {
			if (resource instanceof IFile) {
				createCookbookFile((IFile) resource,
						CookbookPackage.eINSTANCE.getTemplate());
			}
			if (resource instanceof IFolder) {
				recurseTemplatesDir((IFolder) resource);
			}
		}
	}

	private void recurseFilesDir(IFolder folder) throws CoreException {
		for (IResource resource : folder.members()) {
			if (resource instanceof IFile) {
				createCookbookFile((IFile) resource,
						CookbookPackage.eINSTANCE.getFile());
			}
			if (resource instanceof IFolder) {
				recurseFilesDir((IFolder) resource);
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

									// res
									// .save(Collections.EMPTY_MAP);
									savelist.add(res.getURI());
								}
							}

							for (URI saveme : savelist) {
								logger.debug("saving: {}",
										saveme.toFileString());
								resourceSet.getResource(saveme, false).save(
										null);
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
	public IFolder getResource(CookbookVersion cookbook) {
		IResource resource = resources.get(cookbook);
		if (resource instanceof IFolder) {
			return (IFolder) resource;
		}
		return null;
	}

}
