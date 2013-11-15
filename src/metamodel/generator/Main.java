package metamodel.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import metamodel.Robot;

public class Main {

	public static void main(String[] args) {
		Robot robot = RobotSerializer.load(new File("example/Robot.xmi"));
		RobotUrbi jet = new RobotUrbi();
		String generation = jet.generate(robot);
		
		FileWriter fw;
		try {
			fw = new FileWriter(new File("example/Robot.u"));
			fw.write(generation);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
