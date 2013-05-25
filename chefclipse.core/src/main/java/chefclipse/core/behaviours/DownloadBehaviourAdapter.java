package chefclipse.core.behaviours;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

import chefclipse.core.managers.ChefRepositoryManagerImpl;

public class DownloadBehaviourAdapter extends AdapterImpl implements
		DownloadBehaviour {

	private final CookbookFile cookbookFile;
	static KnifeConfigController api = KnifeConfigController.INSTANCE;

	public DownloadBehaviourAdapter(CookbookFile target) {
		super();
		this.cookbookFile = target;
	}

	@Override
	public InputStream getContentStream() {

		if (cookbookFile.eContainer() instanceof ServerCookbookVersion) {

			KnifeConfig config = ((ServerCookbookVersion) cookbookFile
					.eContainer()).getKnifeConfig();

			ChefServerApi chefServerApi = api.getServer(config);

			assertNotNull(chefServerApi);

			InputStream remoteCookbookFileStream = chefServerApi
					.getCookbookFileStream(cookbookFile);

			return remoteCookbookFileStream;
		} else {
			try {
				return ((IFile) ChefRepositoryManagerImpl.INSTANCE
						.getResource(cookbookFile)).getContents();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean isAdapterForType(Object type) {

		return type == DownloadBehaviour.class;
	}

	@Override
	public void notifyChanged(Notification msg) {

		super.notifyChanged(msg);
	}

}
