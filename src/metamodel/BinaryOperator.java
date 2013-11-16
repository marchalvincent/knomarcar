/**
 */
package metamodel;





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
public interface BinaryOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Operand Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Left</em>' containment reference.
	 * @see #setOperandLeft(Operator)
	 * @see metamodel.MetamodelPackage#getBinaryOperator_OperandLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getOperandLeft();

	/**
	 * Sets the value of the '{@link metamodel.BinaryOperator#getOperandLeft <em>Operand Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Left</em>' containment reference.
	 * @see #getOperandLeft()
	 * @generated
	 */
	void setOperandLeft(Operator value);

	/**
	 * Returns the value of the '<em><b>Operand Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Right</em>' containment reference.
	 * @see #setOperandRight(Operator)
	 * @see metamodel.MetamodelPackage#getBinaryOperator_OperandRight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getOperandRight();

	/**
	 * Sets the value of the '{@link metamodel.BinaryOperator#getOperandRight <em>Operand Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Right</em>' containment reference.
	 * @see #getOperandRight()
	 * @generated
	 */
	void setOperandRight(Operator value);

} // BinaryOperator
