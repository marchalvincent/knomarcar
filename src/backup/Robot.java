/**
 */
package backup;

import metamodel.generator.IVisitable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Robot#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link metamodel.Robot#getSensors <em>Sensors</em>}</li>
 *   <li>{@link metamodel.Robot#getActuators <em>Actuators</em>}</li>
 *   <li>{@link metamodel.Robot#getActions <em>Actions</em>}</li>
 *   <li>{@link metamodel.Robot#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject, IVisitable {
	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getRobot_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getRobot_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Actuator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getRobot_Actuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getRobot_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel.MetamodelPackage#getRobot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Robot
