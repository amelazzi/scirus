package entities.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import entities.diagram.part.DefaultVisualIDRegistry;

/**
 * @generated
 */
public class DefaultNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DefaultNavigatorItem) {
			DefaultNavigatorItem item = (DefaultNavigatorItem) element;
			return DefaultVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
