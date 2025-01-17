/**
 */
package entities.impl;

import entities.EntitiesPackage;
import entities.Link;
import entities.Network;
import entities.Objects;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entities.impl.NetworkImpl#getObjectsList <em>Objects List</em>}</li>
 *   <li>{@link entities.impl.NetworkImpl#getLinkList <em>Link List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The cached value of the '{@link #getObjectsList() <em>Objects List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Objects> objectsList;

	/**
	 * The cached value of the '{@link #getLinkList() <em>Link List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkList()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> linkList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitiesPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objects> getObjectsList() {
		if (objectsList == null) {
			objectsList = new EObjectContainmentEList<Objects>(Objects.class, this, EntitiesPackage.NETWORK__OBJECTS_LIST);
		}
		return objectsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinkList() {
		if (linkList == null) {
			linkList = new EObjectContainmentEList<Link>(Link.class, this, EntitiesPackage.NETWORK__LINK_LIST);
		}
		return linkList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntitiesPackage.NETWORK__OBJECTS_LIST:
				return ((InternalEList<?>)getObjectsList()).basicRemove(otherEnd, msgs);
			case EntitiesPackage.NETWORK__LINK_LIST:
				return ((InternalEList<?>)getLinkList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntitiesPackage.NETWORK__OBJECTS_LIST:
				return getObjectsList();
			case EntitiesPackage.NETWORK__LINK_LIST:
				return getLinkList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntitiesPackage.NETWORK__OBJECTS_LIST:
				getObjectsList().clear();
				getObjectsList().addAll((Collection<? extends Objects>)newValue);
				return;
			case EntitiesPackage.NETWORK__LINK_LIST:
				getLinkList().clear();
				getLinkList().addAll((Collection<? extends Link>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntitiesPackage.NETWORK__OBJECTS_LIST:
				getObjectsList().clear();
				return;
			case EntitiesPackage.NETWORK__LINK_LIST:
				getLinkList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntitiesPackage.NETWORK__OBJECTS_LIST:
				return objectsList != null && !objectsList.isEmpty();
			case EntitiesPackage.NETWORK__LINK_LIST:
				return linkList != null && !linkList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkImpl
