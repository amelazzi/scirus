/**
 */
package entities.impl;

import entities.Capteur;
import entities.CapteurType;
import entities.EntitiesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entities.impl.CapteurImpl#getType <em>Type</em>}</li>
 *   <li>{@link entities.impl.CapteurImpl#getSendTime <em>Send Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapteurImpl extends DeviceImpl implements Capteur {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CapteurType TYPE_EDEFAULT = CapteurType.HUMIDITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CapteurType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendTime() <em>Send Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SEND_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSendTime() <em>Send Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendTime()
	 * @generated
	 * @ordered
	 */
	protected int sendTime = SEND_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntitiesPackage.Literals.CAPTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapteurType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CapteurType newType) {
		CapteurType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitiesPackage.CAPTEUR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSendTime() {
		return sendTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendTime(int newSendTime) {
		int oldSendTime = sendTime;
		sendTime = newSendTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntitiesPackage.CAPTEUR__SEND_TIME, oldSendTime, sendTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntitiesPackage.CAPTEUR__TYPE:
				return getType();
			case EntitiesPackage.CAPTEUR__SEND_TIME:
				return getSendTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntitiesPackage.CAPTEUR__TYPE:
				setType((CapteurType)newValue);
				return;
			case EntitiesPackage.CAPTEUR__SEND_TIME:
				setSendTime((Integer)newValue);
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
			case EntitiesPackage.CAPTEUR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EntitiesPackage.CAPTEUR__SEND_TIME:
				setSendTime(SEND_TIME_EDEFAULT);
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
			case EntitiesPackage.CAPTEUR__TYPE:
				return type != TYPE_EDEFAULT;
			case EntitiesPackage.CAPTEUR__SEND_TIME:
				return sendTime != SEND_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", sendTime: ");
		result.append(sendTime);
		result.append(')');
		return result.toString();
	}

} //CapteurImpl
