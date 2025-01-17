package entities.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import entities.EntitiesPackage;
import entities.diagram.edit.parts.CapteurNameEditPart;
import entities.diagram.edit.parts.CloudNameEditPart;
import entities.diagram.edit.parts.DataBaseNameEditPart;
import entities.diagram.edit.parts.EntryFunctionTypeEditPart;
import entities.diagram.edit.parts.GateWayNameEditPart;
import entities.diagram.edit.parts.LinkNameEditPart;
import entities.diagram.parsers.MessageFormatParser;
import entities.diagram.part.DefaultVisualIDRegistry;

/**
 * @generated
 */
public class DefaultParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser capteurName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCapteurName_5001Parser() {
		if (capteurName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitiesPackage.eINSTANCE
					.getDevice_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			capteurName_5001Parser = parser;
		}
		return capteurName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataBaseName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDataBaseName_5002Parser() {
		if (dataBaseName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitiesPackage.eINSTANCE
					.getDevice_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataBaseName_5002Parser = parser;
		}
		return dataBaseName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloudName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCloudName_5003Parser() {
		if (cloudName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitiesPackage.eINSTANCE
					.getDevice_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloudName_5003Parser = parser;
		}
		return cloudName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser gateWayName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getGateWayName_5004Parser() {
		if (gateWayName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitiesPackage.eINSTANCE
					.getDevice_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gateWayName_5004Parser = parser;
		}
		return gateWayName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser entryFunctionType_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEntryFunctionType_5005Parser() {
		if (entryFunctionType_5005Parser == null) {
			EAttribute editableFeature = EntitiesPackage.eINSTANCE
					.getEntryFunction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			entryFunctionType_5005Parser = parser;
		}
		return entryFunctionType_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getLinkName_6001Parser() {
		if (linkName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitiesPackage.eINSTANCE
					.getLink_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linkName_6001Parser = parser;
		}
		return linkName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CapteurNameEditPart.VISUAL_ID:
			return getCapteurName_5001Parser();
		case DataBaseNameEditPart.VISUAL_ID:
			return getDataBaseName_5002Parser();
		case CloudNameEditPart.VISUAL_ID:
			return getCloudName_5003Parser();
		case GateWayNameEditPart.VISUAL_ID:
			return getGateWayName_5004Parser();

		case EntryFunctionTypeEditPart.VISUAL_ID:
			return getEntryFunctionType_5005Parser();
		case LinkNameEditPart.VISUAL_ID:
			return getLinkName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DefaultVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DefaultVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DefaultElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
