package com.contaazul.marsexplorer.service;

import org.springframework.stereotype.Service;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.exceptions.RobotOutOfBoundsException;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.RobotCommandParser;
import com.contaazul.marsexplorer.rules.RobotOperator;
import com.contaazul.marsexplorer.rules.Terrain;

@Service
public class RobotOperatorService {
	private RobotCommandParser robotCommandParser;
	
	public RobotOperatorService() {
		robotCommandParser = new RobotCommandParser();
	}
	
	public Robot execute(String commands) {
		Robot robot = new Robot();
		
		for (Character command : commands.toCharArray()) {
			RobotCommand robotCommand = robotCommandParser.get(command);
			
			robot = execute(robot, robotCommand);
		}
		
		return robot;
	}
	
	public Robot execute(Robot robot, RobotCommand robotCommand) {
		Robot movedRobot = moveRobot(robot, robotCommand);
		validateRobotWithinTerain(movedRobot);
		
		return movedRobot;
	}
	
	private Robot moveRobot(Robot robot, RobotCommand robotCommand) {
		RobotOperator robotOperator = new RobotOperator(robot);
		return robotOperator.execute(robotCommand);
	}
	
	private void validateRobotWithinTerain(Robot robot) {
		Terrain terrain = new Terrain(5, 5);
		if (!terrain.within(robot)) throw new RobotOutOfBoundsException();
	}
}
