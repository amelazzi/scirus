package entities.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entities.diagram.edit.parts.CapteurEditPart;
import entities.diagram.edit.parts.CloudEditPart;
import entities.diagram.edit.parts.DataBaseEditPart;
import entities.diagram.edit.parts.EntryFunctionEditPart;
import entities.diagram.edit.parts.GateWayEditPart;
import entities.diagram.providers.DefaultElementTypes;
import entities.diagram.providers.DefaultModelingAssistantProvider;

/**
 * @generated
 */
public class DefaultModelingAssistantProviderOfCloudEditPart extends
		DefaultModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CloudEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(CloudEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DefaultElementTypes.Link_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CloudEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			CloudEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CapteurEditPart) {
			types.add(DefaultElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataBaseEditPart) {
			types.add(DefaultElementTypes.Link_4001);
		}
		if (targetEditPart instanceof CloudEditPart) {
			types.add(DefaultElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GateWayEditPart) {
			types.add(DefaultElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EntryFunctionEditPart) {
			types.add(DefaultElementTypes.Link_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CloudEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(CloudEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DefaultElementTypes.Link_4001) {
			types.add(DefaultElementTypes.Capteur_2001);
			types.add(DefaultElementTypes.DataBase_2002);
			types.add(DefaultElementTypes.Cloud_2003);
			types.add(DefaultElementTypes.GateWay_2004);
			types.add(DefaultElementTypes.EntryFunction_2005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CloudEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(CloudEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DefaultElementTypes.Link_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CloudEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(CloudEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DefaultElementTypes.Link_4001) {
			types.add(DefaultElementTypes.Capteur_2001);
			types.add(DefaultElementTypes.DataBase_2002);
			types.add(DefaultElementTypes.Cloud_2003);
			types.add(DefaultElementTypes.GateWay_2004);
			types.add(DefaultElementTypes.EntryFunction_2005);
		}
		return types;
	}

}
