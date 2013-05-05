package chefclipse.core.utils;

import static org.junit.Assert.assertNotNull;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.ChefCore;
import chefclipse.core.CookbookFolder;

public class Utilities {

    static Logger                logger = LoggerFactory
            .getLogger(Utilities.class);

    static KnifeConfigController api    = KnifeConfigController.INSTANCE;

    public static IResource[] getResources(final ISelection selection) {

        if (selection instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) selection;
            IResource[] resources = new IResource[sel.toArray().length];
            for (int i = 0; i < sel.toArray().length; i++) {
                if (sel.toArray()[i] instanceof IResource) {
                    resources[i] = (IResource) sel.toArray()[i];
                } else {
                    resources[i] = null;
                }
            }
            return resources;
        }
        return null;
    }

/*    public static void compareWithServer(final CookbookFolder item) {

        assertNotNull(item);

        KnifeConfig config = ChefConfigManager.instance()
                .retrieveProjectChefConfig(item.getResource());
        ChefServerApi chefServerApi = api.getServer(config);

        assertNotNull(chefServerApi);

        ChefCore.log(item);

        IResource cookbookResource = item.getResource();

        // assertNotNull(cookbookVersion);

        String cookbookName = cookbookResource.getName();

        ServerCookbookVersion cookbook = chefServerApi
                .getCookbookVersion(cookbookName);

        CompareUI.openCompareEditor(new CookbookCompareInput(
                item.getResource(), cookbook));
    }*/
}
