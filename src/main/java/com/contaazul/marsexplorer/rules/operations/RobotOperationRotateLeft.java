package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.BearingRotation;

public class RobotOperationRotateLeft {
	public Robot execute(Robot robot) {
		robot.setBearing(new BearingRotation().leftOf(robot.getBearing()));
		
		return robot;
	}
}
