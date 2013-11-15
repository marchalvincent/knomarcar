/**
 */
package metamodel;

import metamodel.generator.IVisitable;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Differential Wheel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.DifferentialWheel#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.DifferentialWheel#isIsLeft <em>Is Left</em>}</li>
 *   <li>{@link metamodel.DifferentialWheel#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getDifferentialWheel()
 * @model
 * @generated
 */
public interface DifferentialWheel extends Actuator, IVisitable {
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
	 * @see metamodel.MetamodelPackage#getDifferentialWheel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.DifferentialWheel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Left</em>' attribute.
	 * @see #setIsLeft(boolean)
	 * @see metamodel.MetamodelPackage#getDifferentialWheel_IsLeft()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsLeft();

	/**
	 * Sets the value of the '{@link metamodel.DifferentialWheel#isIsLeft <em>Is Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Left</em>' attribute.
	 * @see #isIsLeft()
	 * @generated
	 */
	void setIsLeft(boolean value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see metamodel.MetamodelPackage#getDifferentialWheel_Speed()
	 * @model required="true"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link metamodel.DifferentialWheel#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

} // DifferentialWheel
