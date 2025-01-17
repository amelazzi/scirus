package entities.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entities.Link;
import entities.Network;
import entities.Objects;
import entities.diagram.edit.policies.DefaultBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public LinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Link) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Objects && newEnd instanceof Objects)) {
			return false;
		}
		Objects target = getLink().getDestination();
		if (!(getLink().eContainer() instanceof Network)) {
			return false;
		}
		Network container = (Network) getLink().eContainer();
		return DefaultBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistLink_4001(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Objects && newEnd instanceof Objects)) {
			return false;
		}
		Objects source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Network)) {
			return false;
		}
		Network container = (Network) getLink().eContainer();
		return DefaultBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistLink_4001(container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDestination(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Link getLink() {
		return (Link) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Objects getOldSource() {
		return (Objects) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Objects getNewSource() {
		return (Objects) newEnd;
	}

	/**
	 * @generated
	 */
	protected Objects getOldTarget() {
		return (Objects) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Objects getNewTarget() {
		return (Objects) newEnd;
	}
}
