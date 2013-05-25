package chefclipse.core.behaviours;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.util.CookbookAdapterFactory;

public class DownloadBehaviourAdapterFactory extends CookbookAdapterFactory {

	public static final DownloadBehaviourAdapterFactory INSTANCE = new DownloadBehaviourAdapterFactory();

	@Override
	public boolean isFactoryForType(Object type) {
		return type == CookbookFile.class;
	}

	@SuppressWarnings("cast")
	@Override
	public Adapter createAdapter(Notifier target) {
		return new DownloadBehaviourAdapter(
				(CookbookFile) target);
	}

}
