/**
 */
package metamodel.impl;

import metamodel.BinaryCond;
import metamodel.Condition;
import metamodel.MetamodelPackage;
import metamodel.generator.IVisitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.BinaryCondImpl#getOperandRight <em>Operand Right</em>}</li>
 *   <li>{@link metamodel.impl.BinaryCondImpl#getOperandLeft <em>Operand Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryCondImpl extends ConditionImpl implements BinaryCond {
	/**
	 * The cached value of the '{@link #getOperandRight() <em>Operand Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandRight()
	 * @generated
	 * @ordered
	 */
	protected Condition operandRight;
	/**
	 * The cached value of the '{@link #getOperandLeft() <em>Operand Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandLeft()
	 * @generated
	 * @ordered
	 */
	protected Condition operandLeft;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryCondImpl() {
		super();
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
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.BINARY_COND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOperandRight() {
		return operandRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandRight(Condition newOperandRight, NotificationChain msgs) {
		Condition oldOperandRight = operandRight;
		operandRight = newOperandRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_COND__OPERAND_RIGHT, oldOperandRight, newOperandRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandRight(Condition newOperandRight) {
		if (newOperandRight != operandRight) {
			NotificationChain msgs = null;
			if (operandRight != null)
				msgs = ((InternalEObject)operandRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_COND__OPERAND_RIGHT, null, msgs);
			if (newOperandRight != null)
				msgs = ((InternalEObject)newOperandRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_COND__OPERAND_RIGHT, null, msgs);
			msgs = basicSetOperandRight(newOperandRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_COND__OPERAND_RIGHT, newOperandRight, newOperandRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOperandLeft() {
		return operandLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandLeft(Condition newOperandLeft, NotificationChain msgs) {
		Condition oldOperandLeft = operandLeft;
		operandLeft = newOperandLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_COND__OPERAND_LEFT, oldOperandLeft, newOperandLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandLeft(Condition newOperandLeft) {
		if (newOperandLeft != operandLeft) {
			NotificationChain msgs = null;
			if (operandLeft != null)
				msgs = ((InternalEObject)operandLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_COND__OPERAND_LEFT, null, msgs);
			if (newOperandLeft != null)
				msgs = ((InternalEObject)newOperandLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_COND__OPERAND_LEFT, null, msgs);
			msgs = basicSetOperandLeft(newOperandLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_COND__OPERAND_LEFT, newOperandLeft, newOperandLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.BINARY_COND__OPERAND_RIGHT:
				return basicSetOperandRight(null, msgs);
			case MetamodelPackage.BINARY_COND__OPERAND_LEFT:
				return basicSetOperandLeft(null, msgs);
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
			case MetamodelPackage.BINARY_COND__OPERAND_RIGHT:
				return getOperandRight();
			case MetamodelPackage.BINARY_COND__OPERAND_LEFT:
				return getOperandLeft();
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
			case MetamodelPackage.BINARY_COND__OPERAND_RIGHT:
				setOperandRight((Condition)newValue);
				return;
			case MetamodelPackage.BINARY_COND__OPERAND_LEFT:
				setOperandLeft((Condition)newValue);
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
			case MetamodelPackage.BINARY_COND__OPERAND_RIGHT:
				setOperandRight((Condition)null);
				return;
			case MetamodelPackage.BINARY_COND__OPERAND_LEFT:
				setOperandLeft((Condition)null);
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
			case MetamodelPackage.BINARY_COND__OPERAND_RIGHT:
				return operandRight != null;
			case MetamodelPackage.BINARY_COND__OPERAND_LEFT:
				return operandLeft != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryCondImpl
