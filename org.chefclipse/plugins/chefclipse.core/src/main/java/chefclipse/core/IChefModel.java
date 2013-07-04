/**
 */
package chefclipse.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Chef Model</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.limepepper.chefclipse.ChefclipsePackage#getChefModel()
 * @model
 * @generated
 */
public interface IChefModel extends IChefElement {

	public IChefProject getChefProject(IResource project);

	IWorkspace getWorkspace();

} // ChefModel
