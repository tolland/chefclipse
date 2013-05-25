/**
 * 
 */
package org.limepepper.chefclipse.graphviewer.controller;

import org.eclipse.jdt.annotation.NonNull;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel;
import org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditorInput;

/**
 * @author Binhua2
 * 
 */
public class CookbookController {

    private CookbookModel cookbookModel;

    public CookbookController(@NonNull CookbookModel cookbookModel) {
        this.cookbookModel = cookbookModel;
    }

    public DrawableCookbook buildDrawableCookbook(CookbookGraphEditorInput input) {
/*        CookbookVersion cookbook = new CookbookVersionImpl() {
            CookbookVersion initialise(String name, String Checksum, String path,
                    String version) {
                setName(name);
                setCatalog("tretgrgr");
                setMetadata(new MetadataImpl());
                getMetadata().setVersion("1.2.3");
                return this;
            }
        }.initialise("mysql", "weifgu4387549387", "/werw4e/thtr/htrhtr",
                "v1.3.0");*/
        
        
        CookbookVersion cookbook = cookbookModel.getDrawableCookbook().getCookbook();
        
        if(cookbook==null)
            throw new NullPointerException();
        

        return new DrawableCookbook(cookbook);
    }

}
