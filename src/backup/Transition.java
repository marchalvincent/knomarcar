/**
 */
package backup;

import metamodel.generator.IVisitable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Transition#getDstId <em>Dst Id</em>}</li>
 *   <li>{@link metamodel.Transition#getCond <em>Cond</em>}</li>
 *   <li>{@link metamodel.Transition#getNameIn <em>Name In</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject, IVisitable {
	/**
	 * Returns the value of the '<em><b>Dst Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Id</em>' reference.
	 * @see #setDstId(State)
	 * @see metamodel.MetamodelPackage#getTransition_DstId()
	 * @model required="true"
	 * @generated
	 */
	State getDstId();

	/**
	 * Sets the value of the '{@link metamodel.Transition#getDstId <em>Dst Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Id</em>' reference.
	 * @see #getDstId()
	 * @generated
	 */
	void setDstId(State value);

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Condition)
	 * @see metamodel.MetamodelPackage#getTransition_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCond();

	/**
	 * Sets the value of the '{@link metamodel.Transition#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Condition value);

	/**
	 * Returns the value of the '<em><b>Name In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name In</em>' attribute.
	 * @see #setNameIn(String)
	 * @see metamodel.MetamodelPackage#getTransition_NameIn()
	 * @model required="true"
	 * @generated
	 */
	String getNameIn();

	/**
	 * Sets the value of the '{@link metamodel.Transition#getNameIn <em>Name In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name In</em>' attribute.
	 * @see #getNameIn()
	 * @generated
	 */
	void setNameIn(String value);

} // Transition
