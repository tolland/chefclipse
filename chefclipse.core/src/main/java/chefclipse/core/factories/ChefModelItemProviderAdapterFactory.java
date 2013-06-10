package chefclipse.core.factories;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;

public class ChefModelItemProviderAdapterFactory implements AdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return false;
	}

	@Override
	public Object adapt(Object object, Object type) {
		return null;
	}

	@Override
	public Adapter adapt(Notifier target, Object type) {
		return null;
	}

	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		return null;
	}

	@Override
	public void adaptAllNew(Notifier notifier) {

	}

	public static AdapterFactory getAdapterFactory() {
		
		return null;
	}

}
