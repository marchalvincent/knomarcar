/**
 */
package metamodel;

import metamodel.generator.IVisitable;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.BinaryOperator#getOperandLeft <em>Operand Left</em>}</li>
 *   <li>{@link metamodel.BinaryOperator#getOperandRight <em>Operand Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getBinaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperator extends Condition, IVisitable {
	/**
	 * Returns the value of the '<em><b>Operand Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Left</em>' reference.
	 * @see #setOperandLeft(Value)
	 * @see metamodel.MetamodelPackage#getBinaryOperator_OperandLeft()
	 * @model required="true"
	 * @generated
	 */
	Value getOperandLeft();

	/**
	 * Sets the value of the '{@link metamodel.BinaryOperator#getOperandLeft <em>Operand Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Left</em>' reference.
	 * @see #getOperandLeft()
	 * @generated
	 */
	void setOperandLeft(Value value);

	/**
	 * Returns the value of the '<em><b>Operand Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Right</em>' reference.
	 * @see #setOperandRight(Value)
	 * @see metamodel.MetamodelPackage#getBinaryOperator_OperandRight()
	 * @model required="true"
	 * @generated
	 */
	Value getOperandRight();

	/**
	 * Sets the value of the '{@link metamodel.BinaryOperator#getOperandRight <em>Operand Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Right</em>' reference.
	 * @see #getOperandRight()
	 * @generated
	 */
	void setOperandRight(Value value);

} // BinaryOperator
