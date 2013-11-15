/**
 */
package metamodel;

import metamodel.generator.IVisitable;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.BinaryCond#getOperandRight <em>Operand Right</em>}</li>
 *   <li>{@link metamodel.BinaryCond#getOperandLeft <em>Operand Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getBinaryCond()
 * @model abstract="true"
 * @generated
 */
public interface BinaryCond extends Condition, IVisitable {
	/**
	 * Returns the value of the '<em><b>Operand Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Right</em>' reference.
	 * @see #setOperandRight(Condition)
	 * @see metamodel.MetamodelPackage#getBinaryCond_OperandRight()
	 * @model required="true"
	 * @generated
	 */
	Condition getOperandRight();

	/**
	 * Sets the value of the '{@link metamodel.BinaryCond#getOperandRight <em>Operand Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Right</em>' reference.
	 * @see #getOperandRight()
	 * @generated
	 */
	void setOperandRight(Condition value);

	/**
	 * Returns the value of the '<em><b>Operand Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Left</em>' reference.
	 * @see #setOperandLeft(Condition)
	 * @see metamodel.MetamodelPackage#getBinaryCond_OperandLeft()
	 * @model required="true"
	 * @generated
	 */
	Condition getOperandLeft();

	/**
	 * Sets the value of the '{@link metamodel.BinaryCond#getOperandLeft <em>Operand Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Left</em>' reference.
	 * @see #getOperandLeft()
	 * @generated
	 */
	void setOperandLeft(Condition value);

} // BinaryCond
