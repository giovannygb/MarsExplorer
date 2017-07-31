package com.contaazul.marsexplorer.rules.operations;

import org.junit.Before;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveSouthTest {
	private RobotOperationMoveSouth robotOperationMoveSouth;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveSouth() throws Exception {
		robotOperationMoveSouth = new RobotOperationMoveSouth();
		robot = new Robot(0, 0, Bearing.SOUTH);
	}
}
