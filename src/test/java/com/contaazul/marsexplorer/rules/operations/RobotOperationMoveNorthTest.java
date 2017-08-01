package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveNorthTest {
	private RobotOperationMoveNorth robotOperationMoveNorth;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveNorth() throws Exception {
		robotOperationMoveNorth = new RobotOperationMoveNorth();
		robot = new Robot();
	}
	
	@Test
	public void moveRobotNorthToX0Y1N() throws Exception {
			robot = robotOperationMoveNorth.execute(robot);

			RobotOperationMoveTest.assertThatRobotIsAt(robot, 0, 1);
	}
}
