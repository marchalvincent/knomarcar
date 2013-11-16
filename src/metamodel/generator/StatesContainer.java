package metamodel.generator;

import java.util.ArrayList;
import java.util.List;

import metamodel.State;
import metamodel.Transition;

public class StatesContainer {

	private List<State> states;
	private List<Transition> transitions;
	
	public StatesContainer() {
		super();
		states = new ArrayList<>();
		transitions = new ArrayList<>();
	}
	
	public void addState(State s) {
		states.add(s);
	}
	
	public void addTransition(Transition t) {
		transitions.add(t);
	}
	
	public String getString() {
		
	}
}
