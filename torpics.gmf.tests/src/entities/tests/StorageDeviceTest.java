/**
 */
package entities.tests;

import entities.EntitiesFactory;
import entities.StorageDevice;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Storage Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorageDeviceTest extends DeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StorageDeviceTest.class);
	}

	/**
	 * Constructs a new Storage Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageDeviceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Storage Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StorageDevice getFixture() {
		return (StorageDevice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntitiesFactory.eINSTANCE.createStorageDevice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StorageDeviceTest
