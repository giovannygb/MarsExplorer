package com.contaazul.marsexplorer.rules.operations;

import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.RobotOperationParser;

public class RobotOperationMove implements RobotOperation {
	private RobotOperationParser robotOperationParser;
	
	public RobotOperationMove() {
		robotOperationParser = new RobotOperationParser();
	}
	
	public Robot execute(Robot robot) {
		RobotOperation operation = robotOperationParser.get(robot.getBearing());
		
		return operation.execute(robot);
	}
}
