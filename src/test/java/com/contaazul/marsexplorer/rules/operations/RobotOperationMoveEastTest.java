package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;

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
}
