/**
 */
package metamodel.impl;

import java.util.Collection;
import metamodel.Action;
import metamodel.Actuator;
import metamodel.Behaviour;
import metamodel.MetamodelPackage;
import metamodel.Robot;
import metamodel.Sensor;
import metamodel.generator.IVisitor;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.RobotImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link metamodel.impl.RobotImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link metamodel.impl.RobotImpl#getActuators <em>Actuators</em>}</li>
 *   <li>{@link metamodel.impl.RobotImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
	/**
	 * The cached value of the '{@link #getBehaviours() <em>Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> behaviours;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuators;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
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
		return MetamodelPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, MetamodelPackage.ROBOT__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, MetamodelPackage.ROBOT__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuators() {
		if (actuators == null) {
			actuators = new EObjectContainmentEList<Actuator>(Actuator.class, this, MetamodelPackage.ROBOT__ACTUATORS);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, MetamodelPackage.ROBOT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.ROBOT__BEHAVIOURS:
				return ((InternalEList<?>)getBehaviours()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.ROBOT__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.ROBOT__ACTUATORS:
				return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.ROBOT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.ROBOT__BEHAVIOURS:
				return getBehaviours();
			case MetamodelPackage.ROBOT__SENSORS:
				return getSensors();
			case MetamodelPackage.ROBOT__ACTUATORS:
				return getActuators();
			case MetamodelPackage.ROBOT__ACTIONS:
				return getActions();
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
			case MetamodelPackage.ROBOT__BEHAVIOURS:
				getBehaviours().clear();
				getBehaviours().addAll((Collection<? extends Behaviour>)newValue);
				return;
			case MetamodelPackage.ROBOT__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case MetamodelPackage.ROBOT__ACTUATORS:
				getActuators().clear();
				getActuators().addAll((Collection<? extends Actuator>)newValue);
				return;
			case MetamodelPackage.ROBOT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case MetamodelPackage.ROBOT__BEHAVIOURS:
				getBehaviours().clear();
				return;
			case MetamodelPackage.ROBOT__SENSORS:
				getSensors().clear();
				return;
			case MetamodelPackage.ROBOT__ACTUATORS:
				getActuators().clear();
				return;
			case MetamodelPackage.ROBOT__ACTIONS:
				getActions().clear();
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
			case MetamodelPackage.ROBOT__BEHAVIOURS:
				return behaviours != null && !behaviours.isEmpty();
			case MetamodelPackage.ROBOT__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case MetamodelPackage.ROBOT__ACTUATORS:
				return actuators != null && !actuators.isEmpty();
			case MetamodelPackage.ROBOT__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
