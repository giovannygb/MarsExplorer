package com.contaazul.marsexplorer.rules;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.operations.RobotOperation;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMove;
import com.contaazul.marsexplorer.rules.operations.RobotOperationRotateLeft;
import com.contaazul.marsexplorer.rules.operations.RobotOperationRotateRight;

public class RobotOperator {
	
	private Robot robot;
	private Map<RobotCommand, RobotOperation> robotOperations;
	
	public RobotOperator() {
		this(new Robot());
	}
	
	public RobotOperator(Robot robot) {
		this.robot = robot;
		
		Map<RobotCommand, RobotOperation> robotOperations = new HashMap<>();
		robotOperations.put(RobotCommand.MOVE_FORWARD, new RobotOperationMove());
		robotOperations.put(RobotCommand.ROTATE_LEFT, new RobotOperationRotateLeft());
		robotOperations.put(RobotCommand.ROTATE_RIGHT, new RobotOperationRotateRight());
		
		this.robotOperations = Collections.unmodifiableMap(new HashMap<RobotCommand, RobotOperation>(robotOperations));
	}
	
	public Robot execute(RobotCommand robotOperation) {
		RobotOperation operation = robotOperations.get(robotOperation);
		
		return operation.execute(robot);
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}
