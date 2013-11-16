/**
 */
package metamodel.util;

import metamodel.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetamodelPackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DIFFERENTIAL_WHEEL: {
				DifferentialWheel differentialWheel = (DifferentialWheel)theEObject;
				T result = caseDifferentialWheel(differentialWheel);
				if (result == null) result = caseActuator(differentialWheel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseActuator(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ACTION_WHEEL: {
				ActionWheel actionWheel = (ActionWheel)theEObject;
				T result = caseActionWheel(actionWheel);
				if (result == null) result = caseAction(actionWheel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TURN_LEFT: {
				TurnLeft turnLeft = (TurnLeft)theEObject;
				T result = caseTurnLeft(turnLeft);
				if (result == null) result = caseActionWheel(turnLeft);
				if (result == null) result = caseAction(turnLeft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FORWARD: {
				Forward forward = (Forward)theEObject;
				T result = caseForward(forward);
				if (result == null) result = caseActionWheel(forward);
				if (result == null) result = caseAction(forward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.STOPPING: {
				Stopping stopping = (Stopping)theEObject;
				T result = caseStopping(stopping);
				if (result == null) result = caseActionWheel(stopping);
				if (result == null) result = caseAction(stopping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.BACKWARD: {
				Backward backward = (Backward)theEObject;
				T result = caseBackward(backward);
				if (result == null) result = caseActionWheel(backward);
				if (result == null) result = caseAction(backward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TURN_RIGHT: {
				TurnRight turnRight = (TurnRight)theEObject;
				T result = caseTurnRight(turnRight);
				if (result == null) result = caseActionWheel(turnRight);
				if (result == null) result = caseAction(turnRight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DISTANCE_SENSOR: {
				DistanceSensor distanceSensor = (DistanceSensor)theEObject;
				T result = caseDistanceSensor(distanceSensor);
				if (result == null) result = caseSensor(distanceSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.LIGHT_SENSOR: {
				LightSensor lightSensor = (LightSensor)theEObject;
				T result = caseLightSensor(lightSensor);
				if (result == null) result = caseSensor(lightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.BOOL_VAL: {
				BoolVal boolVal = (BoolVal)theEObject;
				T result = caseBoolVal(boolVal);
				if (result == null) result = caseType(boolVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.FLOAT_VAL: {
				FloatVal floatVal = (FloatVal)theEObject;
				T result = caseFloatVal(floatVal);
				if (result == null) result = caseType(floatVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.INT_VAL: {
				IntVal intVal = (IntVal)theEObject;
				T result = caseIntVal(intVal);
				if (result == null) result = caseType(intVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				T result = caseBehaviour(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseCondition(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseCondition(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.BINARY_COND: {
				BinaryCond binaryCond = (BinaryCond)theEObject;
				T result = caseBinaryCond(binaryCond);
				if (result == null) result = caseCondition(binaryCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryCond(or);
				if (result == null) result = caseCondition(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryCond(and);
				if (result == null) result = caseCondition(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.UNARY_COND: {
				UnaryCond unaryCond = (UnaryCond)theEObject;
				T result = caseUnaryCond(unaryCond);
				if (result == null) result = caseCondition(unaryCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.NEGATION: {
				Negation negation = (Negation)theEObject;
				T result = caseNegation(negation);
				if (result == null) result = caseUnaryCond(negation);
				if (result == null) result = caseCondition(negation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseBinaryOperator(equal);
				if (result == null) result = caseCondition(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseBinaryOperator(lessThan);
				if (result == null) result = caseCondition(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.MORE_THAN: {
				MoreThan moreThan = (MoreThan)theEObject;
				T result = caseMoreThan(moreThan);
				if (result == null) result = caseBinaryOperator(moreThan);
				if (result == null) result = caseCondition(moreThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.DIFFERENT: {
				Different different = (Different)theEObject;
				T result = caseDifferent(different);
				if (result == null) result = caseBinaryOperator(different);
				if (result == null) result = caseCondition(different);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.LESS_OR_EQUAL: {
				LessOrEqual lessOrEqual = (LessOrEqual)theEObject;
				T result = caseLessOrEqual(lessOrEqual);
				if (result == null) result = caseBinaryOperator(lessOrEqual);
				if (result == null) result = caseCondition(lessOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.MORE_OR_EQUAL: {
				MoreOrEqual moreOrEqual = (MoreOrEqual)theEObject;
				T result = caseMoreOrEqual(moreOrEqual);
				if (result == null) result = caseBinaryOperator(moreOrEqual);
				if (result == null) result = caseCondition(moreOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Differential Wheel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Differential Wheel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentialWheel(DifferentialWheel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Wheel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Wheel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionWheel(ActionWheel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnLeft(TurnLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stopping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stopping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopping(Stopping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackward(Backward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnRight(TurnRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceSensor(DistanceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSensor(LightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolVal(BoolVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatVal(FloatVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntVal(IntVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryCond(BinaryCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryCond(UnaryCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>More Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>More Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoreThan(MoreThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferent(Different object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqual(LessOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>More Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>More Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoreOrEqual(MoreOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetamodelSwitch
