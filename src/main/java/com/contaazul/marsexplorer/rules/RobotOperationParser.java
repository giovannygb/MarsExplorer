package com.contaazul.marsexplorer.rules;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.rules.operations.RobotOperation;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMoveEast;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMoveNorth;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMoveSouth;
import com.contaazul.marsexplorer.rules.operations.RobotOperationMoveWest;

public class RobotOperationParser {
	private Map<Bearing, RobotOperation> mapRobotOperation;
	
	public RobotOperationParser() {
		Map<Bearing, RobotOperation> mapRobotOperation = new HashMap<>();
		
		mapRobotOperation.put(Bearing.NORTH, new RobotOperationMoveNorth());		
		mapRobotOperation.put(Bearing.EAST, new RobotOperationMoveEast());		
		mapRobotOperation.put(Bearing.SOUTH, new RobotOperationMoveSouth());		
		mapRobotOperation.put(Bearing.WEST, new RobotOperationMoveWest());
		
		this.mapRobotOperation = Collections.unmodifiableMap(new HashMap<Bearing, RobotOperation>(mapRobotOperation));
	}

	public RobotOperation get(Bearing bearing) {
		return mapRobotOperation.get(bearing);
	}
}
