package com.contaazul.marsexplorer.rules.operations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMove implements RobotOperation {
	private Map<Bearing, RobotOperation> moveOperationDirection;
	
	public RobotOperationMove() {
		Map<Bearing, RobotOperation> moveOperationDirection = new HashMap<>();
		
		moveOperationDirection.put(Bearing.NORTH, new RobotOperationMoveNorth());		
		moveOperationDirection.put(Bearing.EAST, new RobotOperationMoveEast());		
		moveOperationDirection.put(Bearing.SOUTH, new RobotOperationMoveSouth());		
		moveOperationDirection.put(Bearing.WEST, new RobotOperationMoveWest());
		
		this.moveOperationDirection = Collections.unmodifiableMap(new HashMap<Bearing, RobotOperation>(moveOperationDirection));
	}
	
	public Robot execute(Robot robot) {
		RobotOperation operation = moveOperationDirection.get(robot.getBearing());
		
		return operation.execute(robot);
	}
}
