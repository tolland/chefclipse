package org.limepepper.chefclipse.json;

import org.eclipse.xtext.builder.impl.DirtyStateAwareResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.shared.internal.SharedModule;

import com.google.inject.Module;
import com.google.inject.Scopes;

public class JsonSharedModule extends SharedModule implements Module {

	public JsonSharedModule() {
	}
	
	@Override
	protected void configure() {
		super.configure();
		bind(XtextResourceSet.class).to(JsonXtextResourceSet.class);
		bind(IResourceFactory.class).to(XtextResourceFactory.class);
		
		bind(IResourceDescriptions.class).to(DirtyStateAwareResourceDescriptions.class).in(Scopes.SINGLETON);
		
		new JsonRuntimeModule() {
			public void configureIResourceDescriptions(com.google.inject.Binder binder) {
			};
		}.configure(binder());
		//bind(XtextResource.class).to(LazyLinkingResource.class);
	}
}
