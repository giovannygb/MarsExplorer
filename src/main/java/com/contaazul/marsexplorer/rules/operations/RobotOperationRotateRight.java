package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.BearingRotation;

public class RobotOperationRotateRight implements RobotOperation {
	public Robot execute(Robot robot) {
		robot.setBearing(new BearingRotation().rightOf(robot.getBearing()));
		
		return robot;
	}
}
