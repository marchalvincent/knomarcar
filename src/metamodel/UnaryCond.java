/**
 */
package metamodel;

import metamodel.generator.IVisitable;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.UnaryCond#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getUnaryCond()
 * @model
 * @generated
 */
public interface UnaryCond extends Condition, IVisitable {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Condition)
	 * @see metamodel.MetamodelPackage#getUnaryCond_Child()
	 * @model containment="true"
	 * @generated
	 */
	Condition getChild();

	/**
	 * Sets the value of the '{@link metamodel.UnaryCond#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Condition value);

} // UnaryCond
