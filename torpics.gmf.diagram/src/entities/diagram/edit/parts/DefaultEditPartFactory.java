package entities.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import entities.diagram.part.DefaultVisualIDRegistry;

/**
 * @generated
 */
public class DefaultEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DefaultVisualIDRegistry.getVisualID(view)) {

			case NetworkEditPart.VISUAL_ID:
				return new NetworkEditPart(view);

			case DataBaseEditPart.VISUAL_ID:
				return new DataBaseEditPart(view);

			case DataBaseNameEditPart.VISUAL_ID:
				return new DataBaseNameEditPart(view);

			case CapteurEditPart.VISUAL_ID:
				return new CapteurEditPart(view);

			case CapteurNameEditPart.VISUAL_ID:
				return new CapteurNameEditPart(view);

			case GateWayEditPart.VISUAL_ID:
				return new GateWayEditPart(view);

			case GateWayNameEditPart.VISUAL_ID:
				return new GateWayNameEditPart(view);

			case CloudEditPart.VISUAL_ID:
				return new CloudEditPart(view);

			case CloudNameEditPart.VISUAL_ID:
				return new CloudNameEditPart(view);

			case LinkEditPart.VISUAL_ID:
				return new LinkEditPart(view);

			case LinkNameEditPart.VISUAL_ID:
				return new LinkNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
