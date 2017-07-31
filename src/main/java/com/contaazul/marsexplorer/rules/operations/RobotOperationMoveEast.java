package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveEast implements RobotOperation {
	@Override
	public Robot execute(Robot robot) {
		robot.setX(robot.getX() + 1);
		return robot;
	}
}
