package entities.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import entities.diagram.part.DefaultDiagramEditorPlugin;
import entities.diagram.part.DefaultVisualIDRegistry;
import entities.diagram.providers.DefaultElementTypes;
import entities.diagram.providers.DefaultParserProvider;

/**
 * @generated
 */
public class DefaultNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DefaultDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DefaultDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DefaultNavigatorItem
				&& !isOwnView(((DefaultNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DefaultNavigatorGroup) {
			DefaultNavigatorGroup group = (DefaultNavigatorGroup) element;
			return DefaultDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DefaultNavigatorItem) {
			DefaultNavigatorItem navigatorItem = (DefaultNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (DefaultVisualIDRegistry.getVisualID(view)) {
		case NetworkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?torpics?Network", DefaultElementTypes.Network_1000); //$NON-NLS-1$
		case CapteurEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?torpics?Capteur", DefaultElementTypes.Capteur_2001); //$NON-NLS-1$
		case GateWayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?torpics?GateWay", DefaultElementTypes.GateWay_2002); //$NON-NLS-1$
		case EntryFunctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?torpics?EntryFunction", DefaultElementTypes.EntryFunction_2003); //$NON-NLS-1$
		case DataBaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?torpics?DataBase", DefaultElementTypes.DataBase_2004); //$NON-NLS-1$
		case CloudEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?torpics?Cloud", DefaultElementTypes.Cloud_2005); //$NON-NLS-1$
		case LinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?torpics?Link", DefaultElementTypes.Link_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DefaultDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DefaultElementTypes.isKnownElementType(elementType)) {
			image = DefaultElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof DefaultNavigatorGroup) {
			DefaultNavigatorGroup group = (DefaultNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DefaultNavigatorItem) {
			DefaultNavigatorItem navigatorItem = (DefaultNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DefaultVisualIDRegistry.getVisualID(view)) {
		case NetworkEditPart.VISUAL_ID:
			return getNetwork_1000Text(view);
		case CapteurEditPart.VISUAL_ID:
			return getCapteur_2001Text(view);
		case GateWayEditPart.VISUAL_ID:
			return getGateWay_2002Text(view);
		case EntryFunctionEditPart.VISUAL_ID:
			return getEntryFunction_2003Text(view);
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_2004Text(view);
		case CloudEditPart.VISUAL_ID:
			return getCloud_2005Text(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getNetwork_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCapteur_2001Text(View view) {
		IParser parser = DefaultParserProvider.getParser(
				DefaultElementTypes.Capteur_2001,
				view.getElement() != null ? view.getElement() : view,
				DefaultVisualIDRegistry.getType(CapteurNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DefaultDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGateWay_2002Text(View view) {
		IParser parser = DefaultParserProvider.getParser(
				DefaultElementTypes.GateWay_2002,
				view.getElement() != null ? view.getElement() : view,
				DefaultVisualIDRegistry.getType(GateWayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DefaultDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryFunction_2003Text(View view) {
		IParser parser = DefaultParserProvider.getParser(
				DefaultElementTypes.EntryFunction_2003,
				view.getElement() != null ? view.getElement() : view,
				DefaultVisualIDRegistry
						.getType(EntryFunctionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DefaultDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataBase_2004Text(View view) {
		IParser parser = DefaultParserProvider
				.getParser(DefaultElementTypes.DataBase_2004,
						view.getElement() != null ? view.getElement() : view,
						DefaultVisualIDRegistry
								.getType(DataBaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DefaultDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloud_2005Text(View view) {
		IParser parser = DefaultParserProvider.getParser(
				DefaultElementTypes.Cloud_2005,
				view.getElement() != null ? view.getElement() : view,
				DefaultVisualIDRegistry.getType(CloudNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DefaultDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4001Text(View view) {
		IParser parser = DefaultParserProvider.getParser(
				DefaultElementTypes.Link_4001,
				view.getElement() != null ? view.getElement() : view,
				DefaultVisualIDRegistry.getType(LinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DefaultDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return NetworkEditPart.MODEL_ID.equals(DefaultVisualIDRegistry
				.getModelID(view));
	}

}
