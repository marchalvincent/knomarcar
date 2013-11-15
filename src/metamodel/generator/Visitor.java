package metamodel.generator;

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

	StringBuilder sb;
	
	public Visitor() {
		super();
		sb = new StringBuilder();
	}

	@Override
	public String getValue() {
		return sb.toString();
	}

	@Override
	public void visit(Action a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ActionWheel a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Actuator a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(And a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Backward a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Behaviour a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BinaryCond a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BinaryOperator a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BoolVal a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Condition a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(DifferentialWheel a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Different a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(DistanceSensor a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Equal a) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Group a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(IntVal a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(LessThan a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(LightSensor a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MoreThan a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Or a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Robot a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Sensor a) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Transition a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TurnLeft a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TurnRight a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Type a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(UnaryCond a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(UnaryOperator a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Value a) {
		// TODO Auto-generated method stub
		
	}
}
