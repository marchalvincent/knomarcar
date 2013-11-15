/**
 */
package metamodel.impl;

import metamodel.BinaryCond;
import metamodel.Condition;
import metamodel.MetamodelPackage;
import metamodel.generator.IVisitor;
import org.eclipse.emf.common.notify.Notification;
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
	 * The cached value of the '{@link #getOperandRight() <em>Operand Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandRight()
	 * @generated
	 * @ordered
	 */
	protected Condition operandRight;
	/**
	 * The cached value of the '{@link #getOperandLeft() <em>Operand Left</em>}' reference.
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
		if (operandRight != null && operandRight.eIsProxy()) {
			InternalEObject oldOperandRight = (InternalEObject)operandRight;
			operandRight = (Condition)eResolveProxy(oldOperandRight);
			if (operandRight != oldOperandRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.BINARY_COND__OPERAND_RIGHT, oldOperandRight, operandRight));
			}
		}
		return operandRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetOperandRight() {
		return operandRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandRight(Condition newOperandRight) {
		Condition oldOperandRight = operandRight;
		operandRight = newOperandRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_COND__OPERAND_RIGHT, oldOperandRight, operandRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOperandLeft() {
		if (operandLeft != null && operandLeft.eIsProxy()) {
			InternalEObject oldOperandLeft = (InternalEObject)operandLeft;
			operandLeft = (Condition)eResolveProxy(oldOperandLeft);
			if (operandLeft != oldOperandLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.BINARY_COND__OPERAND_LEFT, oldOperandLeft, operandLeft));
			}
		}
		return operandLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetOperandLeft() {
		return operandLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandLeft(Condition newOperandLeft) {
		Condition oldOperandLeft = operandLeft;
		operandLeft = newOperandLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BINARY_COND__OPERAND_LEFT, oldOperandLeft, operandLeft));
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
				if (resolve) return getOperandRight();
				return basicGetOperandRight();
			case MetamodelPackage.BINARY_COND__OPERAND_LEFT:
				if (resolve) return getOperandLeft();
				return basicGetOperandLeft();
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
