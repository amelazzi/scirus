package entities.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import entities.Capteur;
import entities.Cloud;
import entities.DataBase;
import entities.EntitiesPackage;
import entities.EntryFunction;
import entities.GateWay;
import entities.Link;
import entities.Network;
import entities.Objects;
import entities.diagram.edit.parts.CapteurEditPart;
import entities.diagram.edit.parts.CloudEditPart;
import entities.diagram.edit.parts.DataBaseEditPart;
import entities.diagram.edit.parts.EntryFunctionEditPart;
import entities.diagram.edit.parts.GateWayEditPart;
import entities.diagram.edit.parts.LinkEditPart;
import entities.diagram.edit.parts.NetworkEditPart;
import entities.diagram.providers.DefaultElementTypes;

/**
 * @generated
 */
public class DefaultDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<DefaultNodeDescriptor> getSemanticChildren(View view) {
		switch (DefaultVisualIDRegistry.getVisualID(view)) {
		case NetworkEditPart.VISUAL_ID:
			return getNetwork_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultNodeDescriptor> getNetwork_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Network modelElement = (Network) view.getElement();
		LinkedList<DefaultNodeDescriptor> result = new LinkedList<DefaultNodeDescriptor>();
		for (Iterator<?> it = modelElement.getObjectsList().iterator(); it
				.hasNext();) {
			Objects childElement = (Objects) it.next();
			int visualID = DefaultVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CapteurEditPart.VISUAL_ID) {
				result.add(new DefaultNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataBaseEditPart.VISUAL_ID) {
				result.add(new DefaultNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloudEditPart.VISUAL_ID) {
				result.add(new DefaultNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GateWayEditPart.VISUAL_ID) {
				result.add(new DefaultNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntryFunctionEditPart.VISUAL_ID) {
				result.add(new DefaultNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getContainedLinks(View view) {
		switch (DefaultVisualIDRegistry.getVisualID(view)) {
		case NetworkEditPart.VISUAL_ID:
			return getNetwork_1000ContainedLinks(view);
		case CapteurEditPart.VISUAL_ID:
			return getCapteur_2001ContainedLinks(view);
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_2002ContainedLinks(view);
		case CloudEditPart.VISUAL_ID:
			return getCloud_2003ContainedLinks(view);
		case GateWayEditPart.VISUAL_ID:
			return getGateWay_2004ContainedLinks(view);
		case EntryFunctionEditPart.VISUAL_ID:
			return getEntryFunction_2005ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getIncomingLinks(View view) {
		switch (DefaultVisualIDRegistry.getVisualID(view)) {
		case CapteurEditPart.VISUAL_ID:
			return getCapteur_2001IncomingLinks(view);
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_2002IncomingLinks(view);
		case CloudEditPart.VISUAL_ID:
			return getCloud_2003IncomingLinks(view);
		case GateWayEditPart.VISUAL_ID:
			return getGateWay_2004IncomingLinks(view);
		case EntryFunctionEditPart.VISUAL_ID:
			return getEntryFunction_2005IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getOutgoingLinks(View view) {
		switch (DefaultVisualIDRegistry.getVisualID(view)) {
		case CapteurEditPart.VISUAL_ID:
			return getCapteur_2001OutgoingLinks(view);
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_2002OutgoingLinks(view);
		case CloudEditPart.VISUAL_ID:
			return getCloud_2003OutgoingLinks(view);
		case GateWayEditPart.VISUAL_ID:
			return getGateWay_2004OutgoingLinks(view);
		case EntryFunctionEditPart.VISUAL_ID:
			return getEntryFunction_2005OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getNetwork_1000ContainedLinks(
			View view) {
		Network modelElement = (Network) view.getElement();
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getCapteur_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getDataBase_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getCloud_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getGateWay_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getEntryFunction_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getCapteur_2001IncomingLinks(
			View view) {
		Capteur modelElement = (Capteur) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getDataBase_2002IncomingLinks(
			View view) {
		DataBase modelElement = (DataBase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getCloud_2003IncomingLinks(
			View view) {
		Cloud modelElement = (Cloud) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getGateWay_2004IncomingLinks(
			View view) {
		GateWay modelElement = (GateWay) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getEntryFunction_2005IncomingLinks(
			View view) {
		EntryFunction modelElement = (EntryFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getCapteur_2001OutgoingLinks(
			View view) {
		Capteur modelElement = (Capteur) view.getElement();
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getDataBase_2002OutgoingLinks(
			View view) {
		DataBase modelElement = (DataBase) view.getElement();
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getCloud_2003OutgoingLinks(
			View view) {
		Cloud modelElement = (Cloud) view.getElement();
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getGateWay_2004OutgoingLinks(
			View view) {
		GateWay modelElement = (GateWay) view.getElement();
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getEntryFunction_2005OutgoingLinks(
			View view) {
		EntryFunction modelElement = (EntryFunction) view.getElement();
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DefaultLinkDescriptor> getLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DefaultLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(
			Network container) {
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		for (Iterator<?> links = container.getLinkList().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != DefaultVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Objects dst = link.getDestination();
			Objects src = link.getSource();
			result.add(new DefaultLinkDescriptor(src, dst, link,
					DefaultElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DefaultLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(
			Objects target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntitiesPackage.eINSTANCE
					.getLink_Destination()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (LinkEditPart.VISUAL_ID != DefaultVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Objects src = link.getSource();
			result.add(new DefaultLinkDescriptor(src, target, link,
					DefaultElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DefaultLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(
			Objects source) {
		Network container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Network) {
				container = (Network) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DefaultLinkDescriptor> result = new LinkedList<DefaultLinkDescriptor>();
		for (Iterator<?> links = container.getLinkList().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != DefaultVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Objects dst = link.getDestination();
			Objects src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DefaultLinkDescriptor(src, dst, link,
					DefaultElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<DefaultNodeDescriptor> getSemanticChildren(View view) {
			return DefaultDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DefaultLinkDescriptor> getContainedLinks(View view) {
			return DefaultDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DefaultLinkDescriptor> getIncomingLinks(View view) {
			return DefaultDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DefaultLinkDescriptor> getOutgoingLinks(View view) {
			return DefaultDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
