/**
 */
package metamodel;

import metamodel.generator.IVisitable;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.IntVal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getIntVal()
 * @model
 * @generated
 */
public interface IntVal extends Type, IVisitable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see metamodel.MetamodelPackage#getIntVal_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link metamodel.IntVal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntVal
