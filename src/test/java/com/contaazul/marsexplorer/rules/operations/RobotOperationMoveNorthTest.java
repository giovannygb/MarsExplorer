package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;

import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveNorthTest {
	private RobotOperationMoveNorth robotOperationMoveNorth;
	private Robot robot;
	
	@Before
	public void testName() throws Exception {
		robotOperationMoveNorth = new RobotOperationMoveNorth();
		robot = new Robot();
	}
}
