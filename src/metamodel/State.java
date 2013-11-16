/**
 */
package metamodel;

import metamodel.generator.IVisitable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link metamodel.State#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel.State#getWorkingAction <em>Working Action</em>}</li>
 *   <li>{@link metamodel.State#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link metamodel.State#getOnEnterAction <em>On Enter Action</em>}</li>
 *   <li>{@link metamodel.State#getOnLeaveAction <em>On Leave Action</em>}</li>
 *   <li>{@link metamodel.State#getUid <em>Uid</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject, IVisitable {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see metamodel.MetamodelPackage#getState_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link metamodel.State#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Working Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Action</em>' reference.
	 * @see #setWorkingAction(Action)
	 * @see metamodel.MetamodelPackage#getState_WorkingAction()
	 * @model
	 * @generated
	 */
	Action getWorkingAction();

	/**
	 * Sets the value of the '{@link metamodel.State#getWorkingAction <em>Working Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Action</em>' reference.
	 * @see #getWorkingAction()
	 * @generated
	 */
	void setWorkingAction(Action value);

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
	 * @see metamodel.MetamodelPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see metamodel.MetamodelPackage#getState_IsInitial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link metamodel.State#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>On Enter Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Enter Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Enter Action</em>' reference.
	 * @see #setOnEnterAction(Action)
	 * @see metamodel.MetamodelPackage#getState_OnEnterAction()
	 * @model
	 * @generated
	 */
	Action getOnEnterAction();

	/**
	 * Sets the value of the '{@link metamodel.State#getOnEnterAction <em>On Enter Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Enter Action</em>' reference.
	 * @see #getOnEnterAction()
	 * @generated
	 */
	void setOnEnterAction(Action value);

	/**
	 * Returns the value of the '<em><b>On Leave Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Leave Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Leave Action</em>' reference.
	 * @see #setOnLeaveAction(Action)
	 * @see metamodel.MetamodelPackage#getState_OnLeaveAction()
	 * @model
	 * @generated
	 */
	Action getOnLeaveAction();

	/**
	 * Sets the value of the '{@link metamodel.State#getOnLeaveAction <em>On Leave Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Leave Action</em>' reference.
	 * @see #getOnLeaveAction()
	 * @generated
	 */
	void setOnLeaveAction(Action value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(int)
	 * @see metamodel.MetamodelPackage#getState_Uid()
	 * @model required="true"
	 * @generated
	 */
	int getUid();

	/**
	 * Sets the value of the '{@link metamodel.State#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(int value);

} // State
