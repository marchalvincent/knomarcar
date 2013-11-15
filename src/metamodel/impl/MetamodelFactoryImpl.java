/**
 */
package metamodel.impl;

import metamodel.Action;
import metamodel.ActionWheel;
import metamodel.And;
import metamodel.Backward;
import metamodel.Behaviour;
import metamodel.BinaryCond;
import metamodel.BinaryOperator;
import metamodel.BoolVal;
import metamodel.Different;
import metamodel.DifferentialWheel;
import metamodel.DistanceSensor;
import metamodel.Equal;
import metamodel.FloatVal;
import metamodel.Forward;
import metamodel.Group;
import metamodel.IntVal;
import metamodel.LessThan;
import metamodel.LightSensor;
import metamodel.MetamodelFactory;
import metamodel.MetamodelPackage;
import metamodel.MoreThan;
import metamodel.Negation;
import metamodel.Or;
import metamodel.Robot;
import metamodel.State;
import metamodel.StateMachine;
import metamodel.Stopping;
import metamodel.Transition;
import metamodel.TurnLeft;
import metamodel.TurnRight;
import metamodel.Type;
import metamodel.UnaryCond;
import metamodel.UnaryOperator;
import metamodel.Value;
import metamodel.Wait;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetamodelPackage.ROBOT: return createRobot();
			case MetamodelPackage.DIFFERENTIAL_WHEEL: return createDifferentialWheel();
			case MetamodelPackage.GROUP: return createGroup();
			case MetamodelPackage.ACTION_WHEEL: return createActionWheel();
			case MetamodelPackage.TURN_LEFT: return createTurnLeft();
			case MetamodelPackage.FORWARD: return createForward();
			case MetamodelPackage.STOPPING: return createStopping();
			case MetamodelPackage.BACKWARD: return createBackward();
			case MetamodelPackage.TURN_RIGHT: return createTurnRight();
			case MetamodelPackage.ACTION: return createAction();
			case MetamodelPackage.DISTANCE_SENSOR: return createDistanceSensor();
			case MetamodelPackage.LIGHT_SENSOR: return createLightSensor();
			case MetamodelPackage.VALUE: return createValue();
			case MetamodelPackage.TYPE: return createType();
			case MetamodelPackage.BOOL_VAL: return createBoolVal();
			case MetamodelPackage.FLOAT_VAL: return createFloatVal();
			case MetamodelPackage.INT_VAL: return createIntVal();
			case MetamodelPackage.BEHAVIOUR: return createBehaviour();
			case MetamodelPackage.STATE_MACHINE: return createStateMachine();
			case MetamodelPackage.STATE: return createState();
			case MetamodelPackage.TRANSITION: return createTransition();
			case MetamodelPackage.UNARY_OPERATOR: return createUnaryOperator();
			case MetamodelPackage.BINARY_OPERATOR: return createBinaryOperator();
			case MetamodelPackage.BINARY_COND: return createBinaryCond();
			case MetamodelPackage.OR: return createOr();
			case MetamodelPackage.AND: return createAnd();
			case MetamodelPackage.UNARY_COND: return createUnaryCond();
			case MetamodelPackage.NEGATION: return createNegation();
			case MetamodelPackage.EQUAL: return createEqual();
			case MetamodelPackage.LESS_THAN: return createLessThan();
			case MetamodelPackage.MORE_THAN: return createMoreThan();
			case MetamodelPackage.DIFFERENT: return createDifferent();
			case MetamodelPackage.WAIT: return createWait();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentialWheel createDifferentialWheel() {
		DifferentialWheelImpl differentialWheel = new DifferentialWheelImpl();
		return differentialWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionWheel createActionWheel() {
		ActionWheelImpl actionWheel = new ActionWheelImpl();
		return actionWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stopping createStopping() {
		StoppingImpl stopping = new StoppingImpl();
		return stopping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backward createBackward() {
		BackwardImpl backward = new BackwardImpl();
		return backward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRight createTurnRight() {
		TurnRightImpl turnRight = new TurnRightImpl();
		return turnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensor createDistanceSensor() {
		DistanceSensorImpl distanceSensor = new DistanceSensorImpl();
		return distanceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolVal createBoolVal() {
		BoolValImpl boolVal = new BoolValImpl();
		return boolVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatVal createFloatVal() {
		FloatValImpl floatVal = new FloatValImpl();
		return floatVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVal createIntVal() {
		IntValImpl intVal = new IntValImpl();
		return intVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviour() {
		BehaviourImpl behaviour = new BehaviourImpl();
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperator() {
		UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperator() {
		BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryCond createBinaryCond() {
		BinaryCondImpl binaryCond = new BinaryCondImpl();
		return binaryCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryCond createUnaryCond() {
		UnaryCondImpl unaryCond = new UnaryCondImpl();
		return unaryCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoreThan createMoreThan() {
		MoreThanImpl moreThan = new MoreThanImpl();
		return moreThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Different createDifferent() {
		DifferentImpl different = new DifferentImpl();
		return different;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
