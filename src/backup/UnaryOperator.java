/**
 */
package backup;





/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.UnaryOperator#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getUnaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface UnaryOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' reference.
	 * @see #setValeur(Value)
	 * @see metamodel.MetamodelPackage#getUnaryOperator_Valeur()
	 * @model required="true"
	 * @generated
	 */
	Value getValeur();

	/**
	 * Sets the value of the '{@link metamodel.UnaryOperator#getValeur <em>Valeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' reference.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(Value value);

} // UnaryOperator
