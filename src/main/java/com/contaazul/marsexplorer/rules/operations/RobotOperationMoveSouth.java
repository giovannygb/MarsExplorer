package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveSouth implements RobotOperation {

	@Override
	public Robot execute(Robot robot) {
		robot.setY(robot.getY() - 1);
		return robot;
	}

}
