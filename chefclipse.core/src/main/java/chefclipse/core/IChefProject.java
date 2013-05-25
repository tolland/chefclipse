package chefclipse.core;

import org.eclipse.core.resources.IProject;
import org.limepepper.chefclipse.common.workstation.Repository;

/**
 * 
 * 
 * @author tomhodder
 * 
 */

public interface IChefProject extends IChefElement, IOpenable {

	IProject getProject();

	Repository getRepository();

}
