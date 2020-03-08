package entities.diagram.providers;

import entities.diagram.part.DefaultDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DefaultDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DefaultDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
