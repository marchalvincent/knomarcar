package metamodel.generator;

import metamodel.*;

public class RobotUrbi
{
  protected static String nl;
  public static synchronized RobotUrbi create(String lineSeparator)
  {
    nl = lineSeparator;
    RobotUrbi result = new RobotUrbi();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<xml=\"1.0\">";
  protected final String TEXT_2 = "\t";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Robot robot = (Robot) argument; 
    stringBuffer.append(TEXT_1);
    
	IVisitor v = new Visitor();
	robot.accept(v);

    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(v.getValue());
    return stringBuffer.toString();
  }
}
