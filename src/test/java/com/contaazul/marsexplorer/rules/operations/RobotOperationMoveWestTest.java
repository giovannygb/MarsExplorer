package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveWestTest {
	private RobotOperationMoveWest robotOperationMoveWest;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveWest() throws Exception {
		robotOperationMoveWest = new RobotOperationMoveWest();
		robot = new Robot();
	}
	
	@Test
	public void moveRobotWestToXN1Y0W() throws Exception {
		robot = robotOperationMoveWest.execute(robot);
		
		RobotOperationMoveTest.assertThatRobotIsAt(robot, -1, 0);
	}
}
