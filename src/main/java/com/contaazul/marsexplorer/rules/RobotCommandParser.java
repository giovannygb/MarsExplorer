package com.contaazul.marsexplorer.rules;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.exceptions.InvalidRobotOperationException;

public class RobotCommandParser {
	private Map<Character, RobotCommand> mapRobotCommands;
	
	public RobotCommandParser() {
		Map<Character, RobotCommand> mapRobotCommands = new HashMap<>();

		mapRobotCommands.put('M', RobotCommand.MOVE_FORWARD);
		mapRobotCommands.put('L', RobotCommand.ROTATE_LEFT);
		mapRobotCommands.put('R', RobotCommand.ROTATE_RIGHT);
		
		this.mapRobotCommands = Collections.unmodifiableMap(new HashMap<Character, RobotCommand>(mapRobotCommands));
	}
	
	public RobotCommand get(Character command) {
		RobotCommand robotCommand = mapRobotCommands.get(command);
		
		if (robotCommand == null) throw new InvalidRobotOperationException();
		
		return robotCommand;
	}
}
