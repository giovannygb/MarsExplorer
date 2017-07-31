package com.contaazul.marsexplorer.rules;

import com.contaazul.marsexplorer.enums.RobotOperation;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMove;
import com.contaazul.marsexplorer.rules.operations.RobotOperationRotateLeft;

public class RobotOperator {
	
	private Robot robot;
	
	public RobotOperator() {
		this(new Robot());
	}
	
	public RobotOperator(Robot robot) {
		this.robot = robot;
	}
	
	public Robot execute(RobotOperation robotOperation) {
		if (robotOperation == RobotOperation.MOVE_FORWARD) {
			robot = new RobotOperationMove().execute(robot);
		} else if (robotOperation == RobotOperation.ROTATE_LEFT) {
			robot = new RobotOperationRotateLeft().execute(robot);
		} else {
			robot.setBearing(new BearingRotation().rightOf(robot.getBearing()));
		}
		
		return robot;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}
