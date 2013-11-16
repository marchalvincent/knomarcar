package metamodel.generator;

import java.util.ArrayList;
import java.util.List;

import metamodel.DifferentialWheel;
import metamodel.Group;

public class ActuatorsContainer {

	private List<String> vars;
	private List<String> inits;
	private List<String> functions;
	private StringBuilder sb;
	private Group group;
	private DifferentialWheel leftWheels;
	private DifferentialWheel rightWheels;
	
	public ActuatorsContainer() {
		super();
		vars = new ArrayList<>();
		inits = new ArrayList<>();
		functions = new ArrayList<>();
		sb = new StringBuilder();
	}
	
	public void setGroup(Group g) {
		group = g;
	}
	
	public void setWheels(DifferentialWheel wheel, boolean isLeft) {
		if (isLeft)
			leftWheels = wheel;
		else
			rightWheels = wheel;
	}
	
	public Group getGroup() {
		return group;
	}
	
	public DifferentialWheel getDifferentialWheel(boolean isLeft) {
		if (isLeft) return leftWheels;
		return rightWheels;
	}
	
	public void addVar(String var) {
		vars.add(var);
	}
	
	public void addInit(String init) {
		inits.add(init);
	}
	
	public void addFunction(String name, String corps) {
		StringBuilder string = new StringBuilder();
		string.append("function " + name + " { ");
		string.append(corps);
		string.append(" }\n");
		
		functions.add(string.toString());
	}

	public String getString() {
		
		sb.append("class actuators {\n\n");
		
		// les vars
		for (String var : vars) {
			sb.append("\t");
			sb.append(var);
			sb.append("\n");
		}
		sb.append("\n");
		
		// la fonction init
		sb.append("\tfunction init() {\n");
		for (String init : inits) {
			sb.append("\t\t");
			sb.append(init);
			sb.append("\n");
		}
		sb.append("\t};\n\n");
		
		// les fonctions
		for (String function : functions) {
			sb.append("\t");
			sb.append(function);
			sb.append("\n");
		}
		sb.append("};\n\n");
		
		return sb.toString();
	}
}
