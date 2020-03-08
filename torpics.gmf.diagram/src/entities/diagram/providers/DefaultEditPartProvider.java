package entities.diagram.providers;

import entities.diagram.edit.parts.DefaultEditPartFactory;
import entities.diagram.edit.parts.NetworkEditPart;
import entities.diagram.part.DefaultVisualIDRegistry;

/**
 * @generated
 */
public class DefaultEditPartProvider extends
		org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DefaultEditPartProvider() {
		super(new DefaultEditPartFactory(),
				DefaultVisualIDRegistry.TYPED_INSTANCE,
				NetworkEditPart.MODEL_ID);
	}

}
