package org.limepepper.chefclipse.graphviewer.controller;

import java.util.List;

import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;

public class DependencyController {

    private DependencyModel dependencyModel;
    
    public DependencyController(DependencyModel dependencyModel)
    {
        this.dependencyModel=dependencyModel;
    }
    
    public void removeDependency(Object dependencyRelation)
    {
        if(dependencyRelation instanceof EntityConnectionData)
        {
            EntityConnectionData entityConnectionData= (EntityConnectionData)dependencyRelation;
            Object source= entityConnectionData.source;
            Object target = entityConnectionData.dest;

            if(source instanceof CookbookVersion)
            {
                CookbookVersion cookbook = (CookbookVersion) source;
                if(cookbook.getDepends()!=null&&
                        cookbook.getDepends().contains(target))
                {
                    cookbook.getDepends().remove(target);
                }
            }
            dependencyModel.notifyDependencyChanged();
        }
    }
    
    public void removeNode(Object node)
    {
        removeNodeRecursively(dependencyModel.getCookbook(),node);
        dependencyModel.notifyDependencyChanged();
    }
    
    private void removeNodeRecursively(Object parent,Object node)
    {
        if (parent instanceof CookbookVersion)
        {
            CookbookVersion cookbook = (CookbookVersion)parent;
            List<CookbookVersion> cookbooks = cookbook.getDepends();
            if(cookbooks!=null)
            {
                if(cookbooks.contains(node))
                {
                    cookbooks.remove(node);
                }
                for(int i=0;i<cookbooks.size();i++)
                {
                    removeNodeRecursively(cookbooks.get(i),node);
                }
            }
        }
    }
    
    public CookbookVersion getRootCookbook() {
        
        if(dependencyModel.getCookbook()==null){
            
            
        }
/*        Cookbook mysqlCb =new CookbookVersionImpl() {
            Cookbook initialise(String name, String Checksum, String path,
                    String version) {
                setName(name);
                setCatalog(name);
                setMetadata(new MetadataImpl());
                getMetadata().setVersion(version);
                return this;
            }
        }.initialise("mysql", "weifgu387", "/werw4e/thtr/htrhtr",
                "v1.3.0");
        Cookbook apache2Cb =new CookbookVersionImpl() {
            Cookbook initialise(String name, String Checksum, String path,
                    String version) {
                setName(name);
                setCatalog("catalog");
                setMetadata(new MetadataImpl());
                getMetadata().setVersion(version);
                return this;
            }
        }.initialise("apache2Cb", "weifgu4387549fjtuj387", "/werw4e/thtr/htrhtr",
                "v1.3.0");
        Cookbook yumCb =new CookbookVersionImpl() {
            Cookbook initialise(String name, String Checksum, String path,
                    String version, CookbookVersion cookbook) {
                setName(name);
                setCatalog(name);
                setMetadata(new MetadataImpl());
                getMetadata().setVersion(version);
                getDepends().add(CookbookVersion);
                return this;
            }
        }.initialise("yum", "weifgu4387549387", "/werw4e/thtr/htrhtr",
                "v1.3.0",mysqlCb);
        Cookbook phpCb =new CookbookVersionImpl() {
            Cookbook initialise(String name, String Checksum, String path,
                    String version, CookbookVersion cookbook, String catalog) {
                setName(name);
                setCatalog(catalog);
                setMetadata(new MetadataImpl());
                getMetadata().setVersion(version);
                getDepends().add(CookbookVersion);
                return this;
            }
        }.initialise("mysql", "weifgu4387549387", "/werw4e/thtr/htrhtr",
                "v1.3.0", yumCb,"some catalog");

        MockCookbookVersionImpl aptCb = new MockCookbookVersionImpl("mysql","v1.1.16","Web Servers",null); 
*/

        return dependencyModel.getCookbook();
    }
}
