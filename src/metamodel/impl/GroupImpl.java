/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.DifferentialWheel;
import metamodel.Group;
import metamodel.MetamodelPackage;
import metamodel.generator.IVisitor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.GroupImpl#getWheels <em>Wheels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends ActuatorImpl implements Group {
	/**
	 * The cached value of the '{@link #getWheels() <em>Wheels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheels()
	 * @generated
	 * @ordered
	 */
	protected EList<DifferentialWheel> wheels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
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
		return MetamodelPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifferentialWheel> getWheels() {
		if (wheels == null) {
			wheels = new EObjectResolvingEList<DifferentialWheel>(DifferentialWheel.class, this, MetamodelPackage.GROUP__WHEELS);
		}
		return wheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.GROUP__WHEELS:
				return getWheels();
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
			case MetamodelPackage.GROUP__WHEELS:
				getWheels().clear();
				getWheels().addAll((Collection<? extends DifferentialWheel>)newValue);
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
			case MetamodelPackage.GROUP__WHEELS:
				getWheels().clear();
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
			case MetamodelPackage.GROUP__WHEELS:
				return wheels != null && !wheels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
