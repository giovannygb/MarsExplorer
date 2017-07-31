package com.contaazul.marsexplorer.rules;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMove;
import com.contaazul.marsexplorer.rules.operations.RobotOperationRotateLeft;
import com.contaazul.marsexplorer.rules.operations.RobotOperationRotateRight;

public class RobotOperator {
	
	private Robot robot;
	
	public RobotOperator() {
		this(new Robot());
	}
	
	public RobotOperator(Robot robot) {
		this.robot = robot;
	}
	
	public Robot execute(RobotCommand robotOperation) {
		if (robotOperation == RobotCommand.MOVE_FORWARD) {
			robot = new RobotOperationMove().execute(robot);
		} else if (robotOperation == RobotCommand.ROTATE_LEFT) {
			robot = new RobotOperationRotateLeft().execute(robot);
		} else {
			robot = new RobotOperationRotateRight().execute(robot);
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
