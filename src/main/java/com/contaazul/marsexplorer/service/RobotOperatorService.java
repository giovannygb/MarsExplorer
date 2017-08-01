package com.contaazul.marsexplorer.service;

import org.springframework.stereotype.Service;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.RobotOperator;
import com.contaazul.marsexplorer.rules.Terrain;

@Service
public class RobotOperatorService {
	public Robot execute(String commands) {
		Robot robot = new Robot();
		
		for (char command : commands.toCharArray()) {
			if (command == 'M') robot = execute(robot, RobotCommand.MOVE_FORWARD);
			else if (command == 'L') robot = execute(robot, RobotCommand.ROTATE_LEFT);
			else if (command == 'R') robot = execute(robot, RobotCommand.ROTATE_RIGHT);
			else throw new RuntimeException();
		}
		
		return robot;
	}
	
	public Robot execute(Robot robot, RobotCommand robotCommand) {
		RobotOperator robotOperator = new RobotOperator(robot);
		Terrain terrain = new Terrain(5, 5);
		robotOperator.execute(robotCommand);
		
		if (!terrain.within(robot)) throw new RuntimeException();
		
		return robot;
	}
}
