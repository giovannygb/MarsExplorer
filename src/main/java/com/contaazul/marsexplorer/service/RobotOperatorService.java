package com.contaazul.marsexplorer.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.exceptions.InvalidRobotOperationException;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.RobotOperator;
import com.contaazul.marsexplorer.rules.Terrain;

@Service
public class RobotOperatorService {
	private Map<Character, RobotCommand> mapRobotCommands;
	
	public RobotOperatorService() {
		Map<Character, RobotCommand> mapRobotCommands = new HashMap<>();

		mapRobotCommands.put('M', RobotCommand.MOVE_FORWARD);
		mapRobotCommands.put('L', RobotCommand.ROTATE_LEFT);
		mapRobotCommands.put('R', RobotCommand.ROTATE_RIGHT);
		
		this.mapRobotCommands = Collections.unmodifiableMap(new HashMap<Character, RobotCommand>(mapRobotCommands));
	}
	
	public Robot execute(String commands) {
		Robot robot = new Robot();
		
		for (Character command : commands.toCharArray()) {
			RobotCommand robotCommand = mapRobotCommands.get(command);
			
			robot = execute(robot, robotCommand);
		}
		
		return robot;
	}
	
	public Robot execute(Robot robot, RobotCommand robotCommand) {
		if (robotCommand == null) throw new InvalidRobotOperationException();
		
		RobotOperator robotOperator = new RobotOperator(robot);
		Terrain terrain = new Terrain(5, 5);
		
		robotOperator.execute(robotCommand);
		
		if (!terrain.within(robot)) throw new RuntimeException();
		
		return robot;
	}
}
