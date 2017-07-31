package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMove implements RobotOperation {
	public Robot execute(Robot robot) {
		if (robot.getBearing() == Bearing.NORTH) {
			return new RobotOperationMoveNorth().execute(robot);
		} else if (robot.getBearing() == Bearing.EAST) {
			robot.setX(robot.getX() + 1);
		} else if (robot.getBearing() == Bearing.SOUTH) {
			robot.setY(robot.getY() - 1);
		} else {
			robot.setX(robot.getX() - 1);
		}
		
		return robot;
	}
}
