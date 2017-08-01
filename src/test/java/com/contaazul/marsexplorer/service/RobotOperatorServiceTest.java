package com.contaazul.marsexplorer.service;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMove;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMoveTest;

public class RobotOperatorServiceTest {
	private RobotOperatorService robotOperatorService;
	
	@Before
	public void setupRobotOperatorService() throws Exception {
		robotOperatorService = new RobotOperatorService();
	}

	@Test
	public void canExecuteCommandOnRobot() throws Exception {
		robotOperatorService.execute("");
	}
	
	@Test
	public void canMoveRobotNorth() throws Exception {
		Robot robot = robotOperatorService.execute("M");
		
		RobotOperationMoveTest.assertThatRobotIsAt(robot, 0, 1, Bearing.NORTH);
	}
}
