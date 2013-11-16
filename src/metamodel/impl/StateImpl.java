/**
 */
package metamodel.impl;

import java.util.Collection;
import metamodel.Action;
import metamodel.MetamodelPackage;
import metamodel.State;
import metamodel.Transition;
import metamodel.Value;
import metamodel.generator.IVisitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#getWorkingAction <em>Working Action</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#getOnEnterAction <em>On Enter Action</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#getOnLeaveAction <em>On Leave Action</em>}</li>
 *   <li>{@link metamodel.impl.StateImpl#getUid <em>Uid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The cached value of the '{@link #getWorkingAction() <em>Working Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingAction()
	 * @generated
	 * @ordered
	 */
	protected Action workingAction;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnEnterAction() <em>On Enter Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEnterAction()
	 * @generated
	 * @ordered
	 */
	protected Action onEnterAction;

	/**
	 * The cached value of the '{@link #getOnLeaveAction() <em>On Leave Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLeaveAction()
	 * @generated
	 * @ordered
	 */
	protected Action onLeaveAction;

	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, MetamodelPackage.STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.STATE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.STATE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getWorkingAction() {
		if (workingAction != null && workingAction.eIsProxy()) {
			InternalEObject oldWorkingAction = (InternalEObject)workingAction;
			workingAction = (Action)eResolveProxy(oldWorkingAction);
			if (workingAction != oldWorkingAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.STATE__WORKING_ACTION, oldWorkingAction, workingAction));
			}
		}
		return workingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetWorkingAction() {
		return workingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingAction(Action newWorkingAction) {
		Action oldWorkingAction = workingAction;
		workingAction = newWorkingAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__WORKING_ACTION, oldWorkingAction, workingAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__IS_INITIAL, oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getOnEnterAction() {
		if (onEnterAction != null && onEnterAction.eIsProxy()) {
			InternalEObject oldOnEnterAction = (InternalEObject)onEnterAction;
			onEnterAction = (Action)eResolveProxy(oldOnEnterAction);
			if (onEnterAction != oldOnEnterAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.STATE__ON_ENTER_ACTION, oldOnEnterAction, onEnterAction));
			}
		}
		return onEnterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetOnEnterAction() {
		return onEnterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEnterAction(Action newOnEnterAction) {
		Action oldOnEnterAction = onEnterAction;
		onEnterAction = newOnEnterAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__ON_ENTER_ACTION, oldOnEnterAction, onEnterAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getOnLeaveAction() {
		if (onLeaveAction != null && onLeaveAction.eIsProxy()) {
			InternalEObject oldOnLeaveAction = (InternalEObject)onLeaveAction;
			onLeaveAction = (Action)eResolveProxy(oldOnLeaveAction);
			if (onLeaveAction != oldOnLeaveAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.STATE__ON_LEAVE_ACTION, oldOnLeaveAction, onLeaveAction));
			}
		}
		return onLeaveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetOnLeaveAction() {
		return onLeaveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnLeaveAction(Action newOnLeaveAction) {
		Action oldOnLeaveAction = onLeaveAction;
		onLeaveAction = newOnLeaveAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__ON_LEAVE_ACTION, oldOnLeaveAction, onLeaveAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		int oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void accept(IVisitor v) {
		v.visit(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.STATE__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.STATE__TRANSITIONS:
				return getTransitions();
			case MetamodelPackage.STATE__VALUE:
				return getValue();
			case MetamodelPackage.STATE__WORKING_ACTION:
				if (resolve) return getWorkingAction();
				return basicGetWorkingAction();
			case MetamodelPackage.STATE__NAME:
				return getName();
			case MetamodelPackage.STATE__IS_INITIAL:
				return isIsInitial();
			case MetamodelPackage.STATE__ON_ENTER_ACTION:
				if (resolve) return getOnEnterAction();
				return basicGetOnEnterAction();
			case MetamodelPackage.STATE__ON_LEAVE_ACTION:
				if (resolve) return getOnLeaveAction();
				return basicGetOnLeaveAction();
			case MetamodelPackage.STATE__UID:
				return getUid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case MetamodelPackage.STATE__VALUE:
				setValue((Value)newValue);
				return;
			case MetamodelPackage.STATE__WORKING_ACTION:
				setWorkingAction((Action)newValue);
				return;
			case MetamodelPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.STATE__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case MetamodelPackage.STATE__ON_ENTER_ACTION:
				setOnEnterAction((Action)newValue);
				return;
			case MetamodelPackage.STATE__ON_LEAVE_ACTION:
				setOnLeaveAction((Action)newValue);
				return;
			case MetamodelPackage.STATE__UID:
				setUid((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				return;
			case MetamodelPackage.STATE__VALUE:
				setValue((Value)null);
				return;
			case MetamodelPackage.STATE__WORKING_ACTION:
				setWorkingAction((Action)null);
				return;
			case MetamodelPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.STATE__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case MetamodelPackage.STATE__ON_ENTER_ACTION:
				setOnEnterAction((Action)null);
				return;
			case MetamodelPackage.STATE__ON_LEAVE_ACTION:
				setOnLeaveAction((Action)null);
				return;
			case MetamodelPackage.STATE__UID:
				setUid(UID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case MetamodelPackage.STATE__VALUE:
				return value != null;
			case MetamodelPackage.STATE__WORKING_ACTION:
				return workingAction != null;
			case MetamodelPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.STATE__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
			case MetamodelPackage.STATE__ON_ENTER_ACTION:
				return onEnterAction != null;
			case MetamodelPackage.STATE__ON_LEAVE_ACTION:
				return onLeaveAction != null;
			case MetamodelPackage.STATE__UID:
				return uid != UID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isInitial: ");
		result.append(isInitial);
		result.append(", uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //StateImpl
