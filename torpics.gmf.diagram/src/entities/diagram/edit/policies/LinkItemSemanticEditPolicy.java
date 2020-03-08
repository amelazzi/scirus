package entities.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import entities.diagram.providers.DefaultElementTypes;

/**
 * @generated
 */
public class LinkItemSemanticEditPolicy extends
		DefaultBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkItemSemanticEditPolicy() {
		super(DefaultElementTypes.Link_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
