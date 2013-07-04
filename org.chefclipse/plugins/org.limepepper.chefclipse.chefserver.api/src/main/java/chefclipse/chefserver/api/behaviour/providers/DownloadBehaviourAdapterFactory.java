package chefclipse.chefserver.api.behaviour.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;

import chefclipse.core.behaviours.DownloadBehaviour;

public class DownloadBehaviourAdapterFactory extends AdapterFactoryImpl {

	public static final DownloadBehaviourAdapterFactory INSTANCE = new DownloadBehaviourAdapterFactory();

	@Override
	public boolean isFactoryForType(Object type) {
		System.out.println("type is " + type.getClass() + " returning "
				+ (type == DownloadBehaviour.class));
		return type == DownloadBehaviour.class;
	}

	@Override
	public Adapter createAdapter(Notifier target) {
		return new DownloadBehaviourAdapter((CookbookFile) target);
	}

}
