package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveSouthTest {
	private RobotOperationMoveSouth robotOperationMoveSouth;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveSouth() throws Exception {
		robotOperationMoveSouth = new RobotOperationMoveSouth();
		robot = new Robot();
	}
	
	@Test
	public void moveRobotSouthToX0YN1S() throws Exception {
		robot = robotOperationMoveSouth.execute(robot);

		RobotOperationMoveTest.assertThatRobotIsAt(robot, 0, -1);
	}
}
