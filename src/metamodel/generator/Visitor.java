package metamodel.generator;

import java.util.List;

import metamodel.Action;
import metamodel.ActionWheel;
import metamodel.Actuator;
import metamodel.Add;
import metamodel.And;
import metamodel.Backward;
import metamodel.Behaviour;
import metamodel.BinaryCond;
import metamodel.BinaryOperator;
import metamodel.BoolVal;
import metamodel.Condition;
import metamodel.Different;
import metamodel.DifferentialWheel;
import metamodel.DistanceSensor;
import metamodel.Equal;
import metamodel.FloatVal;
import metamodel.Forward;
import metamodel.Group;
import metamodel.IntVal;
import metamodel.Less;
import metamodel.LessOrEqual;
import metamodel.LightSensor;
import metamodel.More;
import metamodel.MoreOrEqual;
import metamodel.Negation;
import metamodel.Negative;
import metamodel.Operator;
import metamodel.Or;
import metamodel.Positive;
import metamodel.Robot;
import metamodel.Sensor;
import metamodel.State;
import metamodel.StateMachine;
import metamodel.Stopping;
import metamodel.Sub;
import metamodel.Transition;
import metamodel.TurnLeft;
import metamodel.TurnRight;
import metamodel.Type;
import metamodel.UnaryCond;
import metamodel.UnaryOperator;
import metamodel.Value;

public class Visitor implements IVisitor {

	private final String messErreur = "Ne devrait pas arriver, %s est abstrait.";
	
	private StateMachine currentStateMachine;
	private State currentState;
	private ActuatorsContainer actuators;
	
	StringBuilder sb;
	private String robotName;

	public Visitor() {
		super();
		sb = new StringBuilder();
		actuators = new ActuatorsContainer();
	}
	
	@Override
	public String getValue() {
		return sb.toString();
	}

	@Override
	public void visit(Action a) {
		System.err.printf(messErreur, Action.class.getSimpleName());

	}

	@Override
	public void visit(ActionWheel a) {
		System.err.printf(messErreur, ActionWheel.class.getSimpleName());
	}

	@Override
	public void visit(Actuator a) {
		System.err.printf(messErreur, Actuator.class.getSimpleName());
	}

	@Override
	public void visit(Add a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) + ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(And a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) && ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Backward a) {
		/*
		 * function backward() {
		 * 		wheels.speed = -1000;
		 * };
		 */
		actuators.addFunction(Backward.class.getSimpleName() + "()", actuators.getGroup().getName() + ".speed = -" + a.getSpeed() + ";");
	}

	@Override
	public void visit(Behaviour a) {
		sb.append("/* ==============Behavior " + a.getName() + "============== */\n");
		a.getStateMachine().accept(this);
	}

	@Override
	public void visit(BinaryCond a) {
		System.err.printf(messErreur, BinaryCond.class.getSimpleName());
	}

	@Override
	public void visit(BinaryOperator a) {
		System.err.printf(messErreur, BinaryOperator.class.getSimpleName());
	}

	@Override
	public void visit(BoolVal a) {
		if (a.isValue())
			sb.append("true");
		else 
			sb.append("false");
	}

	@Override
	public void visit(Condition a) {
		System.err.printf(messErreur, Condition.class.getSimpleName());
	}

	@Override
	public void visit(Different a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) != ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(DifferentialWheel a) {
		actuators.setWheels(a, a.isIsLeft());

		// ex : var wheelR;
		actuators.addVar("var " + a.getName() + ";");

		// ex : wheelR = DifferentialWheels.new("e-puck", false);
		actuators.addInit(a.getName() + " = DifferentialWheels.new(\"" + robotName + "\", " + a.isIsLeft() + ");");
	}

	@Override
	public void visit(DistanceSensor a) {
		// var Global.FrDsRight = DistanceSensor.new("ps0");
		sb.append("var Global.");
		sb.append(a.getName());
		sb.append(" = DistanceSensor.new(\"");
		sb.append(a.getSensorName());
		sb.append("\");\n");
	}

	@Override
	public void visit(Equal a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) == ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(FloatVal a) {
		sb.append("" + a.getValue());
	}

	@Override
	public void visit(Forward a) {
		/*
		 * function forward(s) {
		 * 		wheels.speed = s;
		 * };
		 */
		actuators.addFunction(Forward.class.getSimpleName() + "(s)", actuators.getGroup().getName() + ".speed = s;");
	}

	@Override
	public void visit(Group a) {
		actuators.setGroup(a);

		// var wheels;
		actuators.addVar("var " + a.getName() + ";");

		// wheels = Group.new(wheelL, wheelR);
		List<DifferentialWheel> list = a.getWheels();
		if (list.size() != 2)
			System.err.println("Ne devrait pas arriver, un groupe de roue possède 2 roues.");

		actuators.addInit(a.getName() + " = Group.new(" + list.get(0).getName() + ", " + list.get(1).getName() + ");");
	}

	@Override
	public void visit(IntVal a) {
		sb.append("" + a.getValue());
	}

	@Override
	public void visit(LessOrEqual a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) <= ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Less a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) < ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(LightSensor a) {
		// var Global.lsRight = LightSensor.new("ls1");
		sb.append("var Global.");
		sb.append(a.getName());
		sb.append(" = LightSensor.new(\"");
		sb.append(a.getSensorName());
		sb.append("\");\n");
	}

	@Override
	public void visit(MoreOrEqual a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) >= ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(More a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) > ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Negation a) {
		sb.append("!( ");
		a.accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Negative a) {
		sb.append("( -");
		a.accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Operator a) {
		System.err.printf(messErreur, Operator.class.getSimpleName());
	}

	@Override
	public void visit(Or a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) || ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Positive a) {
		a.accept(this);
	}

	@Override
	public void visit(Robot a) {
		robotName = a.getName();

		// sensor
		for (Sensor sensor : a.getSensors()) {
			sensor.accept(this);
		}

		// actuator & action
		for (Actuator actuator : a.getActuators()) {
			actuator.accept(this);
		}
		for (Action action : a.getActions()) {
			action.accept(this);
		}
		sb.append(actuators.getString());

		// behaviors
		for (Behaviour behavior : a.getBehaviours()) {
			behavior.accept(this);
		}

		// TODO...
	}

	@Override
	public void visit(Sensor a) {
		System.err.printf(messErreur, Sensor.class.getSimpleName());
	}

	@Override
	public void visit(State a) {
		
		String varName = currentStateMachine.getName() + "." + a.getName();
		
		// WORKING ACTION
		String body = "";
		Action action = a.getWorkingAction();
		if (action != null) {
			if (action instanceof ActionWheel) {
				ActionWheel aWheel = (ActionWheel) action;
				body = "actuator." + aWheel.getClass().getSimpleName() + "(" + aWheel.getSpeed() + ")";
			}
			else {
				System.err.println("L'action 'working' est inconnue...");
			}
		}
		String workingFunction = "\nfunction() {" + body + "}";
		
		
		// ONENTER ACTION
		body = "";
		action = a.getOnEnterAction();
		if (action != null) {
			if (action instanceof ActionWheel) {
				ActionWheel aWheel = (ActionWheel) action;
				body = "\n actuator." + aWheel.getClass().getSimpleName() + "(" + aWheel.getSpeed() + ")\n";
			}
			else {
				System.err.println("L'action 'onleave' est inconnue...");
			}
		}
		String onEnterFunction = "function() {" + body + "}";
		
		// ONLEAVE ACTION
		body = "";
		action = a.getOnLeaveAction();
		if (action != null) {
			if (action instanceof ActionWheel) {
				ActionWheel aWheel = (ActionWheel) action;
				body = "\n actuator." + aWheel.getClass().getSimpleName() + "(" + aWheel.getSpeed() + ")\n";
			}
			else {
				System.err.println("L'action 'onleave' est inconnue...");
			}
		}
		String onLeaveFunction = "function() {" + body + "}";
		
		// breackpoint est laissé à false pour l'instant...
		String breakPoint = "false";
		
		sb.append("var " + varName + " = fsm.State.create(\"" + varName + "\", " + currentStateMachine.getName() + ", " + 
				workingFunction + ", " + a.isIsInitial() +", " + a.getUid() + ", " + onEnterFunction + ", " + onLeaveFunction + ", " + breakPoint + ");\n\n");

	}

	@Override
	public void visit(StateMachine a) {
		// permet de dire qu'on est en train de générer cette StateMachine (pour récupérer le parentId)
		currentStateMachine = a;
		sb.append("/*  Creating the " + a.getName() + " state */\n");
		sb.append("removeSlot(\"" + a.getName() + "\");\n");
		sb.append("var Global." + a.getName() + " = fsm.State.new(\"" + a.getName() + "\");\n");

		// on ne comprend pas ce code...
		sb.append(a.getName() + ".params_dict = Dictionary.new();\n");

		// les states
		for (State state : a.getStates()) {
			state.accept(this);
		}

		// puis les transitions
		for (State state : a.getStates()) {
			currentState = state;
			for (Transition transition : state.getTransitions()) {
				transition.accept(this);
			}
		}
	}

	@Override
	public void visit(Stopping a) {
		/*
		 * function stopping() {
		 * 		wheels.speed = 0;
		 * };
		 */
		actuators.addFunction(Stopping.class.getSimpleName() + "()", actuators.getGroup().getName() + ".speed = 0;");
	}

	@Override
	public void visit(Sub a) {
		sb.append("( ");
		a.getOperandLeft().accept(this);
		sb.append(" ) - ( ");
		a.getOperandRight().accept(this);
		sb.append(" )");
	}

	@Override
	public void visit(Transition a) {
		// TODO Auto-generated method stub
		
		
		
//		sb.append("fsm.Transition.create(" + currentStateMachine.getName() + ", " + var + ", " + var + ", " + var + ", " + var + ");");
	}

	@Override
	public void visit(TurnLeft a) {
		/*
		 * function turnLeft(s) {
		 * 		wheelL.speed = -s & wheelR.speed = s;
		 * };
		 */
		actuators.addFunction(TurnLeft.class.getSimpleName() + "(s)", actuators.getDifferentialWheel(true).getName() + ".speed = -s &"
				+ actuators.getDifferentialWheel(false).getName() + ".speed = s;");
	}

	@Override
	public void visit(TurnRight a) {
		/*
		 * function turnRight(s) {
		 * 		wheelL.speed = s & wheelR.speed = -s;
		 * };
		 */
		actuators.addFunction(TurnRight.class.getSimpleName() + "(s)", actuators.getDifferentialWheel(true).getName() + ".speed = s &"
				+ actuators.getDifferentialWheel(false).getName() + ".speed = -s;");
	}

	@Override
	public void visit(Type a) {
		System.err.printf(messErreur, Type.class.getSimpleName());
	}

	@Override
	public void visit(UnaryCond a) {
		System.err.printf(messErreur, UnaryCond.class.getSimpleName());
	}

	@Override
	public void visit(UnaryOperator a) {
		System.err.printf(messErreur, UnaryOperator.class.getSimpleName());
	}

	@Override
	public void visit(Value a) {
		// TODO Auto-generated method stub
	}
}
