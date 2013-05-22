/**
 * 
 */
package org.limepepper.chefclipse.json.tests;

import static org.fest.assertions.api.Assertions.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.IFragmentProvider.Fallback;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.limepepper.chefclipse.json.JsonInjectorProvider;
import org.limepepper.chefclipse.json.JsonUiInjectorProvider;
import org.limepepper.chefclipse.json.QualifiedNameFragmentProvider;
import org.limepepper.chefclipse.json.json.Model;
import org.limepepper.chefclipse.json.json.Pair;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.name.Named;

/**
 * @author Guillermo Zunino
 *
 */
@InjectWith(JsonInjectorProvider.class)
@RunWith(XtextRunner.class)
public class FragmentProviderTest {

	@Inject
	Provider<XtextResource> resProvider;
	
	@Inject
	private IFragmentProvider fragment;
	
	private Fallback fallback = new IFragmentProvider.Fallback() {
		public String getFragment(EObject obj) {
			return res.getURIFragment(obj);
		}
		
		public EObject getEObject(String fragment) {
			return res.getEObject(fragment);
		}
	};

	private XtextResourceSet resSet;

	private Resource res;

	private Model root;

	@Before
	public void setUp() throws Exception {
		assertThat(fragment).isNotNull();
		
		resSet = new XtextResourceSet();
		res = resSet.createResource(URI.createFileURI("testFragments.json"));
		assertThat(res).isNotNull();
		res.load(null);
		root = (Model) res.getContents().get(0);
	}

	/**
	 * Test method for {@link org.limepepper.chefclipse.json.QualifiedNameFragmentProvider#getFragment(org.eclipse.emf.ecore.EObject, org.eclipse.xtext.resource.IFragmentProvider.Fallback)}.
	 */
	@Test
	public void testGetFragmentPair() {
		Pair pair2 = root.getObjects().get(0).getPairs().get(1);
		assertThat(fragment.getFragment(pair2, fallback)).isEqualTo("//@objects.0/@pairs.ssh_keys");
	}

	/**
	 * Test method for {@link org.limepepper.chefclipse.json.QualifiedNameFragmentProvider#getEObject(org.eclipse.emf.ecore.resource.Resource, java.lang.String, org.eclipse.xtext.resource.IFragmentProvider.Fallback)}.
	 */
	@Test
	public void testGetEObjectPair() {
		Pair pair1 = root.getObjects().get(0).getPairs().get(0);
		assertThat(fragment.getEObject(res, "//@objects.0/@pairs.groups", fallback)).isSameAs(pair1);
	}

}
