/**
 */
package metamodel.impl;

import metamodel.BinaryOperator;
import metamodel.MetamodelPackage;
import metamodel.Value;
import metamodel.generator.IVisitor;

import org.eclipse.emf.common.notify.Notification;
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
public abstract class BinaryOperatorImpl extends ConditionImpl implements BinaryOperator {
	/**
	 * The cached value of the '{@link #getOperandLeft() <em>Operand Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandLeft()
	 * @generated
	 * @ordered
	 */
	protected Value operandLeft;

	/**
	 * The cached value of the '{@link #getOperandRight() <em>Operand Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandRight()
	 * @generated
	 * @ordered
	 */
	protected Value operandRight;

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
	public Value getOperandLeft() {
		if (operandLeft != null && operandLeft.eIsProxy()) {
			InternalEObject oldOperandLeft = (InternalEObject)operandLeft;
			operandLeft = (Value)eResolveProxy(oldOperandLeft);
			if (operandLeft != oldOperandLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT, oldOperandLeft, operandLeft));
			}
		}
		return operandLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetOperandLeft() {
		return operandLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandLeft(Value newOperandLeft) {
		Value oldOperandLeft = operandLeft;
		operandLeft = newOperandLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_OPERATOR__OPERAND_LEFT, oldOperandLeft, operandLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getOperandRight() {
		if (operandRight != null && operandRight.eIsProxy()) {
			InternalEObject oldOperandRight = (InternalEObject)operandRight;
			operandRight = (Value)eResolveProxy(oldOperandRight);
			if (operandRight != oldOperandRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT, oldOperandRight, operandRight));
			}
		}
		return operandRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetOperandRight() {
		return operandRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandRight(Value newOperandRight) {
		Value oldOperandRight = operandRight;
		operandRight = newOperandRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT, oldOperandRight, operandRight));
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
				if (resolve) return getOperandLeft();
				return basicGetOperandLeft();
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				if (resolve) return getOperandRight();
				return basicGetOperandRight();
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
				setOperandLeft((Value)newValue);
				return;
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				setOperandRight((Value)newValue);
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
				setOperandLeft((Value)null);
				return;
			case MetamodelPackage.BINARY_OPERATOR__OPERAND_RIGHT:
				setOperandRight((Value)null);
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
