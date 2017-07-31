package com.contaazul.marsexplorer.rules.operations;

import org.junit.Test;

import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveWestTest {
	private RobotOperationMoveWest robotOperationMoveWest;
	private Robot robot;
	
	@Test
	public void setupRobotOperationMoveWest() throws Exception {
		robotOperationMoveWest = new RobotOperationMoveWest();
		robot = new Robot();
	}
}
