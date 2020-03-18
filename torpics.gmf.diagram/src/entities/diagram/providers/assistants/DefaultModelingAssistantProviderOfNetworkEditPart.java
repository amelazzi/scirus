package entities.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entities.diagram.providers.DefaultElementTypes;
import entities.diagram.providers.DefaultModelingAssistantProvider;

/**
 * @generated
 */
public class DefaultModelingAssistantProviderOfNetworkEditPart extends
		DefaultModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(DefaultElementTypes.Capteur_2001);
		types.add(DefaultElementTypes.DataBase_2002);
		types.add(DefaultElementTypes.Cloud_2003);
		types.add(DefaultElementTypes.GateWay_2004);
		types.add(DefaultElementTypes.EntryFunction_2005);
		return types;
	}

}
