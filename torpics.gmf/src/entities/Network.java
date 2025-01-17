/**
 */
package entities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entities.Network#getObjectsList <em>Objects List</em>}</li>
 *   <li>{@link entities.Network#getLinkList <em>Link List</em>}</li>
 * </ul>
 * </p>
 *
 * @see entities.EntitiesPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects List</b></em>' containment reference list.
	 * The list contents are of type {@link entities.Objects}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects List</em>' containment reference list.
	 * @see entities.EntitiesPackage#getNetwork_ObjectsList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Objects> getObjectsList();

	/**
	 * Returns the value of the '<em><b>Link List</b></em>' containment reference list.
	 * The list contents are of type {@link entities.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link List</em>' containment reference list.
	 * @see entities.EntitiesPackage#getNetwork_LinkList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinkList();

} // Network
