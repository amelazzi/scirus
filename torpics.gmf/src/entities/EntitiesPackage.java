/**
 */
package entities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see entities.EntitiesFactory
 * @model kind="package"
 * @generated
 */
public interface EntitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "torpics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "torpicsEMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntitiesPackage eINSTANCE = entities.impl.EntitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link entities.impl.ObjectsImpl <em>Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.ObjectsImpl
	 * @see entities.impl.EntitiesPackageImpl#getObjects()
	 * @generated
	 */
	int OBJECTS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS__ID = 0;

	/**
	 * The number of structural features of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.DeviceImpl
	 * @see entities.impl.EntitiesPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = OBJECTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = OBJECTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.impl.CapteurImpl <em>Capteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.CapteurImpl
	 * @see entities.impl.EntitiesPackageImpl#getCapteur()
	 * @generated
	 */
	int CAPTEUR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTEUR__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTEUR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTEUR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTEUR__SEND_TIME = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTEUR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTEUR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.impl.StorageDeviceImpl <em>Storage Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.StorageDeviceImpl
	 * @see entities.impl.EntitiesPackageImpl#getStorageDevice()
	 * @generated
	 */
	int STORAGE_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__URL = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__USER_NAME = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__PWD = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__PORT = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storage Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Storage Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.DataBaseImpl
	 * @see entities.impl.EntitiesPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__ID = STORAGE_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAME = STORAGE_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__URL = STORAGE_DEVICE__URL;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__USER_NAME = STORAGE_DEVICE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__PWD = STORAGE_DEVICE__PWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__PORT = STORAGE_DEVICE__PORT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__TYPE = STORAGE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__PROTOCOL = STORAGE_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = STORAGE_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = STORAGE_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.LinkImpl
	 * @see entities.impl.EntitiesPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESTINATION = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.CloudImpl
	 * @see entities.impl.EntitiesPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__ID = STORAGE_DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__NAME = STORAGE_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__URL = STORAGE_DEVICE__URL;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__USER_NAME = STORAGE_DEVICE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PWD = STORAGE_DEVICE__PWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PORT = STORAGE_DEVICE__PORT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__TYPE = STORAGE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__METHOD = STORAGE_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>API Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__API_KEY = STORAGE_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__CHANNEL_ID = STORAGE_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PROTOCOL = STORAGE_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = STORAGE_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = STORAGE_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.impl.GateWayImpl <em>Gate Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.GateWayImpl
	 * @see entities.impl.EntitiesPackageImpl#getGateWay()
	 * @generated
	 */
	int GATE_WAY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_WAY__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_WAY__NAME = DEVICE__NAME;

	/**
	 * The number of structural features of the '<em>Gate Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_WAY_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gate Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_WAY_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.NetworkImpl
	 * @see entities.impl.EntitiesPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 7;

	/**
	 * The feature id for the '<em><b>Objects List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OBJECTS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Link List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINK_LIST = 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entities.impl.EntryFunctionImpl <em>Entry Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.impl.EntryFunctionImpl
	 * @see entities.impl.EntitiesPackageImpl#getEntryFunction()
	 * @generated
	 */
	int ENTRY_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION__ID = OBJECTS__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION__TYPE = OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION__THRESHOLD = OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION__METRIC = OBJECTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION__PERIOD = OBJECTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entry Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION_FEATURE_COUNT = OBJECTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entry Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FUNCTION_OPERATION_COUNT = OBJECTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entities.CapteurType <em>Capteur Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.CapteurType
	 * @see entities.impl.EntitiesPackageImpl#getCapteurType()
	 * @generated
	 */
	int CAPTEUR_TYPE = 10;

	/**
	 * The meta object id for the '{@link entities.BddType <em>Bdd Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.BddType
	 * @see entities.impl.EntitiesPackageImpl#getBddType()
	 * @generated
	 */
	int BDD_TYPE = 11;

	/**
	 * The meta object id for the '{@link entities.ComProtocol <em>Com Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.ComProtocol
	 * @see entities.impl.EntitiesPackageImpl#getComProtocol()
	 * @generated
	 */
	int COM_PROTOCOL = 12;

	/**
	 * The meta object id for the '{@link entities.CloudType <em>Cloud Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.CloudType
	 * @see entities.impl.EntitiesPackageImpl#getCloudType()
	 * @generated
	 */
	int CLOUD_TYPE = 13;

	/**
	 * The meta object id for the '{@link entities.ReadWrite <em>Read Write</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.ReadWrite
	 * @see entities.impl.EntitiesPackageImpl#getReadWrite()
	 * @generated
	 */
	int READ_WRITE = 14;

	/**
	 * The meta object id for the '{@link entities.EntryFunctionType <em>Entry Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entities.EntryFunctionType
	 * @see entities.impl.EntitiesPackageImpl#getEntryFunctionType()
	 * @generated
	 */
	int ENTRY_FUNCTION_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link entities.Capteur <em>Capteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capteur</em>'.
	 * @see entities.Capteur
	 * @generated
	 */
	EClass getCapteur();

	/**
	 * Returns the meta object for the attribute '{@link entities.Capteur#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see entities.Capteur#getType()
	 * @see #getCapteur()
	 * @generated
	 */
	EAttribute getCapteur_Type();

	/**
	 * Returns the meta object for the attribute '{@link entities.Capteur#getSendTime <em>Send Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Time</em>'.
	 * @see entities.Capteur#getSendTime()
	 * @see #getCapteur()
	 * @generated
	 */
	EAttribute getCapteur_SendTime();

	/**
	 * Returns the meta object for class '{@link entities.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see entities.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the attribute '{@link entities.DataBase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see entities.DataBase#getType()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_Type();

	/**
	 * Returns the meta object for the attribute '{@link entities.DataBase#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see entities.DataBase#getProtocol()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_Protocol();

	/**
	 * Returns the meta object for class '{@link entities.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see entities.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link entities.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the reference '{@link entities.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see entities.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link entities.Link#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see entities.Link#getDestination()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Destination();

	/**
	 * Returns the meta object for class '{@link entities.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see entities.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the attribute '{@link entities.Cloud#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see entities.Cloud#getType()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Type();

	/**
	 * Returns the meta object for the attribute '{@link entities.Cloud#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see entities.Cloud#getMethod()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Method();

	/**
	 * Returns the meta object for the attribute '{@link entities.Cloud#getAPIKey <em>API Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Key</em>'.
	 * @see entities.Cloud#getAPIKey()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_APIKey();

	/**
	 * Returns the meta object for the attribute '{@link entities.Cloud#getChannelID <em>Channel ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel ID</em>'.
	 * @see entities.Cloud#getChannelID()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_ChannelID();

	/**
	 * Returns the meta object for the attribute '{@link entities.Cloud#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see entities.Cloud#getProtocol()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Protocol();

	/**
	 * Returns the meta object for class '{@link entities.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see entities.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link entities.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entities.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for class '{@link entities.StorageDevice <em>Storage Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Device</em>'.
	 * @see entities.StorageDevice
	 * @generated
	 */
	EClass getStorageDevice();

	/**
	 * Returns the meta object for the attribute '{@link entities.StorageDevice#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see entities.StorageDevice#getUrl()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_Url();

	/**
	 * Returns the meta object for the attribute '{@link entities.StorageDevice#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see entities.StorageDevice#getUserName()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_UserName();

	/**
	 * Returns the meta object for the attribute '{@link entities.StorageDevice#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see entities.StorageDevice#getPwd()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link entities.StorageDevice#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see entities.StorageDevice#getPort()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_Port();

	/**
	 * Returns the meta object for class '{@link entities.GateWay <em>Gate Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Way</em>'.
	 * @see entities.GateWay
	 * @generated
	 */
	EClass getGateWay();

	/**
	 * Returns the meta object for class '{@link entities.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see entities.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link entities.Network#getObjectsList <em>Objects List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects List</em>'.
	 * @see entities.Network#getObjectsList()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_ObjectsList();

	/**
	 * Returns the meta object for the containment reference list '{@link entities.Network#getLinkList <em>Link List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link List</em>'.
	 * @see entities.Network#getLinkList()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_LinkList();

	/**
	 * Returns the meta object for class '{@link entities.EntryFunction <em>Entry Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Function</em>'.
	 * @see entities.EntryFunction
	 * @generated
	 */
	EClass getEntryFunction();

	/**
	 * Returns the meta object for the attribute '{@link entities.EntryFunction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see entities.EntryFunction#getType()
	 * @see #getEntryFunction()
	 * @generated
	 */
	EAttribute getEntryFunction_Type();

	/**
	 * Returns the meta object for the attribute '{@link entities.EntryFunction#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see entities.EntryFunction#getThreshold()
	 * @see #getEntryFunction()
	 * @generated
	 */
	EAttribute getEntryFunction_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link entities.EntryFunction#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see entities.EntryFunction#getMetric()
	 * @see #getEntryFunction()
	 * @generated
	 */
	EAttribute getEntryFunction_Metric();

	/**
	 * Returns the meta object for the attribute '{@link entities.EntryFunction#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see entities.EntryFunction#getPeriod()
	 * @see #getEntryFunction()
	 * @generated
	 */
	EAttribute getEntryFunction_Period();

	/**
	 * Returns the meta object for class '{@link entities.Objects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objects</em>'.
	 * @see entities.Objects
	 * @generated
	 */
	EClass getObjects();

	/**
	 * Returns the meta object for the attribute '{@link entities.Objects#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see entities.Objects#getId()
	 * @see #getObjects()
	 * @generated
	 */
	EAttribute getObjects_Id();

	/**
	 * Returns the meta object for enum '{@link entities.CapteurType <em>Capteur Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capteur Type</em>'.
	 * @see entities.CapteurType
	 * @generated
	 */
	EEnum getCapteurType();

	/**
	 * Returns the meta object for enum '{@link entities.BddType <em>Bdd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bdd Type</em>'.
	 * @see entities.BddType
	 * @generated
	 */
	EEnum getBddType();

	/**
	 * Returns the meta object for enum '{@link entities.ComProtocol <em>Com Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Com Protocol</em>'.
	 * @see entities.ComProtocol
	 * @generated
	 */
	EEnum getComProtocol();

	/**
	 * Returns the meta object for enum '{@link entities.CloudType <em>Cloud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloud Type</em>'.
	 * @see entities.CloudType
	 * @generated
	 */
	EEnum getCloudType();

	/**
	 * Returns the meta object for enum '{@link entities.ReadWrite <em>Read Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Read Write</em>'.
	 * @see entities.ReadWrite
	 * @generated
	 */
	EEnum getReadWrite();

	/**
	 * Returns the meta object for enum '{@link entities.EntryFunctionType <em>Entry Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Function Type</em>'.
	 * @see entities.EntryFunctionType
	 * @generated
	 */
	EEnum getEntryFunctionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntitiesFactory getEntitiesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link entities.impl.CapteurImpl <em>Capteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.CapteurImpl
		 * @see entities.impl.EntitiesPackageImpl#getCapteur()
		 * @generated
		 */
		EClass CAPTEUR = eINSTANCE.getCapteur();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTEUR__TYPE = eINSTANCE.getCapteur_Type();

		/**
		 * The meta object literal for the '<em><b>Send Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTEUR__SEND_TIME = eINSTANCE.getCapteur_SendTime();

		/**
		 * The meta object literal for the '{@link entities.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.DataBaseImpl
		 * @see entities.impl.EntitiesPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__TYPE = eINSTANCE.getDataBase_Type();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__PROTOCOL = eINSTANCE.getDataBase_Protocol();

		/**
		 * The meta object literal for the '{@link entities.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.LinkImpl
		 * @see entities.impl.EntitiesPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DESTINATION = eINSTANCE.getLink_Destination();

		/**
		 * The meta object literal for the '{@link entities.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.CloudImpl
		 * @see entities.impl.EntitiesPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__TYPE = eINSTANCE.getCloud_Type();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__METHOD = eINSTANCE.getCloud_Method();

		/**
		 * The meta object literal for the '<em><b>API Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__API_KEY = eINSTANCE.getCloud_APIKey();

		/**
		 * The meta object literal for the '<em><b>Channel ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__CHANNEL_ID = eINSTANCE.getCloud_ChannelID();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__PROTOCOL = eINSTANCE.getCloud_Protocol();

		/**
		 * The meta object literal for the '{@link entities.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.DeviceImpl
		 * @see entities.impl.EntitiesPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '{@link entities.impl.StorageDeviceImpl <em>Storage Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.StorageDeviceImpl
		 * @see entities.impl.EntitiesPackageImpl#getStorageDevice()
		 * @generated
		 */
		EClass STORAGE_DEVICE = eINSTANCE.getStorageDevice();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__URL = eINSTANCE.getStorageDevice_Url();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__USER_NAME = eINSTANCE.getStorageDevice_UserName();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__PWD = eINSTANCE.getStorageDevice_Pwd();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__PORT = eINSTANCE.getStorageDevice_Port();

		/**
		 * The meta object literal for the '{@link entities.impl.GateWayImpl <em>Gate Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.GateWayImpl
		 * @see entities.impl.EntitiesPackageImpl#getGateWay()
		 * @generated
		 */
		EClass GATE_WAY = eINSTANCE.getGateWay();

		/**
		 * The meta object literal for the '{@link entities.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.NetworkImpl
		 * @see entities.impl.EntitiesPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Objects List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__OBJECTS_LIST = eINSTANCE.getNetwork_ObjectsList();

		/**
		 * The meta object literal for the '<em><b>Link List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__LINK_LIST = eINSTANCE.getNetwork_LinkList();

		/**
		 * The meta object literal for the '{@link entities.impl.EntryFunctionImpl <em>Entry Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.EntryFunctionImpl
		 * @see entities.impl.EntitiesPackageImpl#getEntryFunction()
		 * @generated
		 */
		EClass ENTRY_FUNCTION = eINSTANCE.getEntryFunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_FUNCTION__TYPE = eINSTANCE.getEntryFunction_Type();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_FUNCTION__THRESHOLD = eINSTANCE.getEntryFunction_Threshold();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_FUNCTION__METRIC = eINSTANCE.getEntryFunction_Metric();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_FUNCTION__PERIOD = eINSTANCE.getEntryFunction_Period();

		/**
		 * The meta object literal for the '{@link entities.impl.ObjectsImpl <em>Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.impl.ObjectsImpl
		 * @see entities.impl.EntitiesPackageImpl#getObjects()
		 * @generated
		 */
		EClass OBJECTS = eINSTANCE.getObjects();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTS__ID = eINSTANCE.getObjects_Id();

		/**
		 * The meta object literal for the '{@link entities.CapteurType <em>Capteur Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.CapteurType
		 * @see entities.impl.EntitiesPackageImpl#getCapteurType()
		 * @generated
		 */
		EEnum CAPTEUR_TYPE = eINSTANCE.getCapteurType();

		/**
		 * The meta object literal for the '{@link entities.BddType <em>Bdd Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.BddType
		 * @see entities.impl.EntitiesPackageImpl#getBddType()
		 * @generated
		 */
		EEnum BDD_TYPE = eINSTANCE.getBddType();

		/**
		 * The meta object literal for the '{@link entities.ComProtocol <em>Com Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.ComProtocol
		 * @see entities.impl.EntitiesPackageImpl#getComProtocol()
		 * @generated
		 */
		EEnum COM_PROTOCOL = eINSTANCE.getComProtocol();

		/**
		 * The meta object literal for the '{@link entities.CloudType <em>Cloud Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.CloudType
		 * @see entities.impl.EntitiesPackageImpl#getCloudType()
		 * @generated
		 */
		EEnum CLOUD_TYPE = eINSTANCE.getCloudType();

		/**
		 * The meta object literal for the '{@link entities.ReadWrite <em>Read Write</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.ReadWrite
		 * @see entities.impl.EntitiesPackageImpl#getReadWrite()
		 * @generated
		 */
		EEnum READ_WRITE = eINSTANCE.getReadWrite();

		/**
		 * The meta object literal for the '{@link entities.EntryFunctionType <em>Entry Function Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entities.EntryFunctionType
		 * @see entities.impl.EntitiesPackageImpl#getEntryFunctionType()
		 * @generated
		 */
		EEnum ENTRY_FUNCTION_TYPE = eINSTANCE.getEntryFunctionType();

	}

} //EntitiesPackage