package entities.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import entities.EntitiesPackage;
import entities.Network;
import entities.diagram.edit.parts.CapteurEditPart;
import entities.diagram.edit.parts.CapteurNameEditPart;
import entities.diagram.edit.parts.CloudEditPart;
import entities.diagram.edit.parts.CloudNameEditPart;
import entities.diagram.edit.parts.DataBaseEditPart;
import entities.diagram.edit.parts.DataBaseNameEditPart;
import entities.diagram.edit.parts.EntryFunctionEditPart;
import entities.diagram.edit.parts.EntryFunctionTypeEditPart;
import entities.diagram.edit.parts.GateWayEditPart;
import entities.diagram.edit.parts.GateWayNameEditPart;
import entities.diagram.edit.parts.LinkEditPart;
import entities.diagram.edit.parts.LinkNameEditPart;
import entities.diagram.edit.parts.NetworkEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DefaultVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "torpics.gmf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (NetworkEditPart.MODEL_ID.equals(view.getType())) {
				return NetworkEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return entities.diagram.part.DefaultVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DefaultDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EntitiesPackage.eINSTANCE.getNetwork().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Network) domainElement)) {
			return NetworkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = entities.diagram.part.DefaultVisualIDRegistry
				.getModelID(containerView);
		if (!NetworkEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (NetworkEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = entities.diagram.part.DefaultVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = NetworkEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case NetworkEditPart.VISUAL_ID:
			if (EntitiesPackage.eINSTANCE.getGateWay().isSuperTypeOf(
					domainElement.eClass())) {
				return GateWayEditPart.VISUAL_ID;
			}
			if (EntitiesPackage.eINSTANCE.getCloud().isSuperTypeOf(
					domainElement.eClass())) {
				return CloudEditPart.VISUAL_ID;
			}
			if (EntitiesPackage.eINSTANCE.getEntryFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryFunctionEditPart.VISUAL_ID;
			}
			if (EntitiesPackage.eINSTANCE.getCapteur().isSuperTypeOf(
					domainElement.eClass())) {
				return CapteurEditPart.VISUAL_ID;
			}
			if (EntitiesPackage.eINSTANCE.getDataBase().isSuperTypeOf(
					domainElement.eClass())) {
				return DataBaseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = entities.diagram.part.DefaultVisualIDRegistry
				.getModelID(containerView);
		if (!NetworkEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (NetworkEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = entities.diagram.part.DefaultVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = NetworkEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case NetworkEditPart.VISUAL_ID:
			if (GateWayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloudEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapteurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataBaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GateWayEditPart.VISUAL_ID:
			if (GateWayNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloudEditPart.VISUAL_ID:
			if (CloudNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntryFunctionEditPart.VISUAL_ID:
			if (EntryFunctionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapteurEditPart.VISUAL_ID:
			if (CapteurNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataBaseEditPart.VISUAL_ID:
			if (DataBaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkEditPart.VISUAL_ID:
			if (LinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EntitiesPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Network element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case NetworkEditPart.VISUAL_ID:
			return false;
		case GateWayEditPart.VISUAL_ID:
		case CloudEditPart.VISUAL_ID:
		case EntryFunctionEditPart.VISUAL_ID:
		case CapteurEditPart.VISUAL_ID:
		case DataBaseEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return entities.diagram.part.DefaultVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return entities.diagram.part.DefaultVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return entities.diagram.part.DefaultVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return entities.diagram.part.DefaultVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return entities.diagram.part.DefaultVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return entities.diagram.part.DefaultVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
