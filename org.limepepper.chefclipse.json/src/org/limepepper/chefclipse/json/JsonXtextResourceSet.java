package org.limepepper.chefclipse.json;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

import com.google.inject.Inject;

/**
 * Overrides xtext resource set to force resolution of resource factory using XtextResourceFactory
 * oterwise it will resolve to JSResourse
 * 
 * @author Guillermo Zunino
 */
public class JsonXtextResourceSet extends SynchronizedXtextResourceSet {
	
	private IResourceFactory factory;

	@Inject
	public JsonXtextResourceSet(IResourceFactory factory) {
		this.factory = factory;
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("json", factory);
	}

	@Override
	protected Resource demandCreateResource(URI uri) {
		if ("json".equals(uri.fileExtension())) {
			getResourceFactoryRegistry().getContentTypeToFactoryMap().put("json", factory);
			return createResource(uri, "json");
		}
		return super.createResource(uri);
	}
	
}
