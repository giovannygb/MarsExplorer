package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveEastTest {
	private RobotOperationMoveEast robotOperationMoveEast;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveEast() throws Exception {
		robotOperationMoveEast = new RobotOperationMoveEast();
		robot = new Robot(0, 0, Bearing.EAST);
	}
	
	@Test
	public void moveRobotEastToX1Y0E() throws Exception {
		robot = robotOperationMoveEast.execute(robot);

		RobotOperationMoveTest.assertThatRobotIsAt(robot, 1, 0, Bearing.EAST);
	}
}
