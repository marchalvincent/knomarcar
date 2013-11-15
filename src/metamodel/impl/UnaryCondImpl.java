/**
 */
package metamodel.impl;

import metamodel.Condition;
import metamodel.MetamodelPackage;
import metamodel.UnaryCond;
import metamodel.generator.IVisitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.UnaryCondImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnaryCondImpl extends ConditionImpl implements UnaryCond {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Condition child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryCondImpl() {
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
		return MetamodelPackage.Literals.UNARY_COND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (Condition)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.UNARY_COND__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Condition newChild) {
		Condition oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.UNARY_COND__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.UNARY_COND__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
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
			case MetamodelPackage.UNARY_COND__CHILD:
				setChild((Condition)newValue);
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
			case MetamodelPackage.UNARY_COND__CHILD:
				setChild((Condition)null);
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
			case MetamodelPackage.UNARY_COND__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryCondImpl
