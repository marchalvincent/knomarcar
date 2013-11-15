package metamodel.generator;

import java.util.List;

import metamodel.Action;
import metamodel.ActionWheel;
import metamodel.Actuator;
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
import metamodel.LessThan;
import metamodel.LightSensor;
import metamodel.MoreThan;
import metamodel.Or;
import metamodel.Robot;
import metamodel.Sensor;
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

public class Visitor implements IVisitor {

	private final String messErreur = "Ne devrait pas arriver, %s est abstrait.";
	Actuators actuators;

	StringBuilder sb;
	private String robotName;


	public Visitor() {
		super();
		sb = new StringBuilder();
		actuators = new Actuators();
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
	public void visit(And a) {
		a.getOperandLeft().accept(this);
		sb.append(" && ");
		a.getOperandRight().accept(this);
	}

	@Override
	public void visit(Backward a) {
		/*
		 * function backward() {
		 * 		wheels.speed = -1000;
		 * };
		 */
		actuators.addFunction("backward()", actuators.getGroup().getName() + ".speed = -" + a.getSpeed() + ";");
	}

	@Override
	public void visit(Behaviour a) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(Condition a) {
		System.err.printf(messErreur, Condition.class.getSimpleName());
	}

	@Override
	public void visit(DifferentialWheel a) {
		actuators.setWheels(a, a.isIsLeft());
		
		// var wheelR;
		actuators.addVar("var " + a.getName() + ";");
		
		// wheelR = DifferentialWheels.new("e-puck", false);
		actuators.addInit(a.getName() + " = DifferentialWheels.new(\"" + robotName + "\", " + a.isIsLeft() + ");");
	}

	@Override
	public void visit(Different a) {
		a.getOperandLeft().accept(this);
		sb.append(" != ");
		a.getOperandRight().accept(this);
	}

	@Override
	public void visit(DistanceSensor a) {
		// var Global.FrDsRight = DistanceSensor.new("ps0");
		sb.append("var Global.");
		sb.append(a.getName());
		sb.append(" = DistanceSensor.new(\"");
		sb.append(a.getSensorName());
		sb.append("\")");
	}

	@Override
	public void visit(Equal a) {
		a.getOperandLeft().accept(this);
		sb.append(" == ");
		a.getOperandRight().accept(this);
	}

	@Override
	public void visit(Float a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(FloatVal a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Forward a) {
		/*
		 * function forward(s) {
		 * 		wheels.speed = s;
		 * };
		 */
		actuators.addFunction("forward(s)", actuators.getGroup().getName() + ".speed = s;");
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
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LessThan a) {
		a.getOperandLeft().accept(this);
		sb.append(" < ");
		a.getOperandRight().accept(this);
	}

	@Override
	public void visit(LightSensor a) {
		// var Global.lsRight = LightSensor.new("ls1");
		sb.append("var Global.");
		sb.append(a.getName());
		sb.append(" = LightSensor.new(\"");
		sb.append(a.getSensorName());
		sb.append("\")");
	}

	@Override
	public void visit(MoreThan a) {
		a.getOperandLeft().accept(this);
		sb.append(" > ");
		a.getOperandRight().accept(this);
	}

	@Override
	public void visit(Or a) {
		a.getOperandLeft().accept(this);
		sb.append(" || ");
		a.getOperandRight().accept(this);
	}

	@Override
	public void visit(Robot a) {
		robotName = a.getName();
		
		// fsm
		// TODO

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

		// escape


		// home


	}

	@Override
	public void visit(Sensor a) {
		System.err.println("pas normal, la classe Sensor est abstraite.");
	}

	@Override
	public void visit(State a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(StateMachine a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Stopping a) {
		/*
		 * function stopping() {
		 * 		wheels.speed = 0;
		 * };
		 */
		actuators.addFunction("stopping()", actuators.getGroup().getName() + ".speed = 0;");
	}

	@Override
	public void visit(Transition a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(TurnLeft a) {
		/*
		 * function turnLeft(s) {
		 * 		wheelL.speed = -s & wheelR.speed = s;
		 * };
		 */
		actuators.addFunction("turnLeft(s)", actuators.getDifferentialWheel(true).getName() + ".speed = -s &"
				+ actuators.getDifferentialWheel(false).getName() + ".speed = s;");
	}

	@Override
	public void visit(TurnRight a) {
		/*
		 * function turnRight(s) {
		 * 		wheelL.speed = s & wheelR.speed = -s;
		 * };
		 */
		actuators.addFunction("turnRight(s)", actuators.getDifferentialWheel(true).getName() + ".speed = s &"
				+ actuators.getDifferentialWheel(false).getName() + ".speed = -s;");
	}

	@Override
	public void visit(Type a) {
		// TODO Auto-generated method stub

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
