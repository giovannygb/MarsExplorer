package rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.model.Robot;

public class RobotOperatorTest {
	private RobotOperator robotOperator;
	
	@Before
	public void canInstantiateRobotOperator() throws Exception {
		robotOperator = new RobotOperator();
	}
	
	@Test
	public void robotOperatorCanSetRobot() throws Exception {
		Robot robot = new Robot();
		robotOperator.setRobot(robot);
		
		assertThat(robotOperator.getRobot(), is(robot));
	}
	
	@Test
	public void robotOperatorHasRobotToOperate() throws Exception {
		assertThat(robotOperator.getRobot(), is(not(nullValue())));
	}
}
