package chefclipse.core;

import org.eclipse.core.resources.IProject;

/**
 * 
 * 
 * @author tomhodder
 * 
 */

public interface IChefProject extends IChefElement, IOpenable {

	IProject getProject();

}
