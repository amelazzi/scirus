package entities.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import entities.EntitiesPackage;
import entities.diagram.edit.parts.CapteurEditPart;
import entities.diagram.edit.parts.CloudEditPart;
import entities.diagram.edit.parts.DataBaseEditPart;
import entities.diagram.edit.parts.EntryFunctionEditPart;
import entities.diagram.edit.parts.GateWayEditPart;
import entities.diagram.edit.parts.LinkEditPart;
import entities.diagram.edit.parts.NetworkEditPart;
import entities.diagram.part.DefaultDiagramEditorPlugin;

/**
 * @generated
 */
public class DefaultElementTypes {

	/**
	 * @generated
	 */
	private DefaultElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DefaultDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Network_1000 = getElementType("torpics.gmf.diagram.Network_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GateWay_2001 = getElementType("torpics.gmf.diagram.GateWay_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capteur_2002 = getElementType("torpics.gmf.diagram.Capteur_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cloud_2003 = getElementType("torpics.gmf.diagram.Cloud_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataBase_2004 = getElementType("torpics.gmf.diagram.DataBase_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryFunction_2005 = getElementType("torpics.gmf.diagram.EntryFunction_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_4001 = getElementType("torpics.gmf.diagram.Link_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Network_1000, EntitiesPackage.eINSTANCE.getNetwork());

			elements.put(GateWay_2001, EntitiesPackage.eINSTANCE.getGateWay());

			elements.put(Capteur_2002, EntitiesPackage.eINSTANCE.getCapteur());

			elements.put(Cloud_2003, EntitiesPackage.eINSTANCE.getCloud());

			elements.put(DataBase_2004, EntitiesPackage.eINSTANCE.getDataBase());

			elements.put(EntryFunction_2005,
					EntitiesPackage.eINSTANCE.getEntryFunction());

			elements.put(Link_4001, EntitiesPackage.eINSTANCE.getLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Network_1000);
			KNOWN_ELEMENT_TYPES.add(GateWay_2001);
			KNOWN_ELEMENT_TYPES.add(Capteur_2002);
			KNOWN_ELEMENT_TYPES.add(Cloud_2003);
			KNOWN_ELEMENT_TYPES.add(DataBase_2004);
			KNOWN_ELEMENT_TYPES.add(EntryFunction_2005);
			KNOWN_ELEMENT_TYPES.add(Link_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case NetworkEditPart.VISUAL_ID:
			return Network_1000;
		case GateWayEditPart.VISUAL_ID:
			return GateWay_2001;
		case CapteurEditPart.VISUAL_ID:
			return Capteur_2002;
		case CloudEditPart.VISUAL_ID:
			return Cloud_2003;
		case DataBaseEditPart.VISUAL_ID:
			return DataBase_2004;
		case EntryFunctionEditPart.VISUAL_ID:
			return EntryFunction_2005;
		case LinkEditPart.VISUAL_ID:
			return Link_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return entities.diagram.providers.DefaultElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return entities.diagram.providers.DefaultElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return entities.diagram.providers.DefaultElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
