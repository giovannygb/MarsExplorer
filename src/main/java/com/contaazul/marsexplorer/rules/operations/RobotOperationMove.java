package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMove implements RobotOperation {
	public Robot execute(Robot robot) {
		if (robot.getBearing() == Bearing.NORTH) {
			return new RobotOperationMoveNorth().execute(robot);
		} else if (robot.getBearing() == Bearing.EAST) {
			return new RobotOperationMoveEast().execute(robot);
		} else if (robot.getBearing() == Bearing.SOUTH) {
			return new RobotOperationMoveSouth().execute(robot);
		} else {
			return new RobotOperationMoveWest().execute(robot);
		}
	}
}
