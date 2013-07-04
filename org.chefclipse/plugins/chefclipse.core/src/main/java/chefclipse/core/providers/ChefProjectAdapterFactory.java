package chefclipse.core.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.limepepper.chefclipse.common.chefclient.provider.ChefclientItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.chefserver.provider.ChefserverItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.cookbook.provider.CookbookItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.knife.provider.KnifeItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.workstation.provider.WorkstationItemProviderAdapterFactory;

import chefclipse.core.factories.ChefModelItemProviderAdapterFactory;

public class ChefProjectAdapterFactory {

	private static ComposedAdapterFactory adapterFactory;

	public final static List<AdapterFactory> createFactoryList() {
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();

		factories.add(new ChefclientItemProviderAdapterFactory());
		factories.add(new ChefserverItemProviderAdapterFactory());
		factories.add(new CookbookItemProviderAdapterFactory());
		factories.add(new KnifeItemProviderAdapterFactory());
		factories.add(new WorkstationItemProviderAdapterFactory());
		factories.add(new ChefModelItemProviderAdapterFactory());

		return factories;
	}

	public final static ComposedAdapterFactory getAdapterFactory() {
		if (adapterFactory == null)
			adapterFactory = new ComposedAdapterFactory(createFactoryList());
		return adapterFactory;
	}
}