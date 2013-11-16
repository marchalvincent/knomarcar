/**
 */
package metamodel.impl;

import metamodel.BinaryOperator;
import metamodel.MetamodelPackage;
import metamodel.Operator;
import metamodel.generator.IVisitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.BinaryOperatorImpl#getOperandLeft <em>Operand Left</em>}</li>
 *   <li>{@link metamodel.impl.BinaryOperatorImpl#getOperandRight <em>Operand Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryOperatorImpl extends OperatorImpl implements BinaryOperator {
	/**
	 * The cached value of the '{@link #getOperandLeft() <em>Operand Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandLeft()
	 * @generated
	 * @ordered
	 */
	protected Operator operandLeft;

	/**
	 * The cached value of the '{@link #getOperandRight() <em>Operand Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandRight()
	 * @generated
	 * @ordered
	 */
	protected Operator operandRight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperatorImpl() {
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
		return MetamodelPackage.Literals.BINARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperandLeft() {
		return operandLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandLeft(Operator newOperandLeft, NotificationChain msgs) {
		Operator oldOperandLeft = operandLeft;
		operandLeft = newOperandLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT, oldOperandLeft, newOperandLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandLeft(Operator newOperandLeft) {
		if (newOperandLeft != operandLeft) {
			NotificationChain msgs = null;
			if (operandLeft != null)
				msgs = ((InternalEObject)operandLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT, null, msgs);
			if (newOperandLeft != null)
				msgs = ((InternalEObject)newOperandLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT, null, msgs);
			msgs = basicSetOperandLeft(newOperandLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT, newOperandLeft, newOperandLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperandRight() {
		return operandRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandRight(Operator newOperandRight, NotificationChain msgs) {
		Operator oldOperandRight = operandRight;
		operandRight = newOperandRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT, oldOperandRight, newOperandRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandRight(Operator newOperandRight) {
		if (newOperandRight != operandRight) {
			NotificationChain msgs = null;
			if (operandRight != null)
				msgs = ((InternalEObject)operandRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT, null, msgs);
			if (newOperandRight != null)
				msgs = ((InternalEObject)newOperandRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT, null, msgs);
			msgs = basicSetOperandRight(newOperandRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT, newOperandRight, newOperandRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT:
				return basicSetOperandLeft(null, msgs);
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				return basicSetOperandRight(null, msgs);
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
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT:
				return getOperandLeft();
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				return getOperandRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT:
				setOperandLeft((Operator)newValue);
				return;
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				setOperandRight((Operator)newValue);
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
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT:
				setOperandLeft((Operator)null);
				return;
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				setOperandRight((Operator)null);
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
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT:
				return operandLeft != null;
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				return operandRight != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryOperatorImpl
