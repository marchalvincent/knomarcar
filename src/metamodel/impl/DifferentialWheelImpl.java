/**
 */
package metamodel.impl;

import metamodel.DifferentialWheel;
import metamodel.MetamodelPackage;
import metamodel.generator.IVisitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Differential Wheel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.DifferentialWheelImpl#isIsLeft <em>Is Left</em>}</li>
 *   <li>{@link metamodel.impl.DifferentialWheelImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferentialWheelImpl extends ActuatorImpl implements DifferentialWheel {
	/**
	 * The default value of the '{@link #isIsLeft() <em>Is Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeft() <em>Is Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeft()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeft = IS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferentialWheelImpl() {
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
		return MetamodelPackage.Literals.DIFFERENTIAL_WHEEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeft() {
		return isLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeft(boolean newIsLeft) {
		boolean oldIsLeft = isLeft;
		isLeft = newIsLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DIFFERENTIAL_WHEEL__IS_LEFT, oldIsLeft, isLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DIFFERENTIAL_WHEEL__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.DIFFERENTIAL_WHEEL__IS_LEFT:
				return isIsLeft();
			case MetamodelPackage.DIFFERENTIAL_WHEEL__SPEED:
				return getSpeed();
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
			case MetamodelPackage.DIFFERENTIAL_WHEEL__IS_LEFT:
				setIsLeft((Boolean)newValue);
				return;
			case MetamodelPackage.DIFFERENTIAL_WHEEL__SPEED:
				setSpeed((Integer)newValue);
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
			case MetamodelPackage.DIFFERENTIAL_WHEEL__IS_LEFT:
				setIsLeft(IS_LEFT_EDEFAULT);
				return;
			case MetamodelPackage.DIFFERENTIAL_WHEEL__SPEED:
				setSpeed(SPEED_EDEFAULT);
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
			case MetamodelPackage.DIFFERENTIAL_WHEEL__IS_LEFT:
				return isLeft != IS_LEFT_EDEFAULT;
			case MetamodelPackage.DIFFERENTIAL_WHEEL__SPEED:
				return speed != SPEED_EDEFAULT;
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
		result.append(" (isLeft: ");
		result.append(isLeft);
		result.append(", speed: ");
		result.append(speed);
		result.append(')');
		return result.toString();
	}

} //DifferentialWheelImpl
