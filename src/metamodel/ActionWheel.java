/**
 */
package metamodel;

import metamodel.generator.IVisitable;





/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Wheel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.ActionWheel#getGroup <em>Group</em>}</li>
 *   <li>{@link metamodel.ActionWheel#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getActionWheel()
 * @model abstract="true"
 * @generated
 */
public interface ActionWheel extends Action, IVisitable {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see metamodel.MetamodelPackage#getActionWheel_Group()
	 * @model required="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link metamodel.ActionWheel#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

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
	 * @see metamodel.MetamodelPackage#getActionWheel_Speed()
	 * @model required="true"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link metamodel.ActionWheel#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

} // ActionWheel
