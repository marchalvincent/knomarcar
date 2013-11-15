/**
 */
package metamodel;

import metamodel.generator.IVisitable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Transition#getDest <em>Dest</em>}</li>
 *   <li>{@link metamodel.Transition#getConditions <em>Conditions</em>}</li>
 *   <li>{@link metamodel.Transition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject, IVisitable {
	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(State)
	 * @see metamodel.MetamodelPackage#getTransition_Dest()
	 * @model required="true"
	 * @generated
	 */
	State getDest();

	/**
	 * Sets the value of the '{@link metamodel.Transition#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(State value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getTransition_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

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
	 * @see metamodel.MetamodelPackage#getTransition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
