package com.contaazul.marsexplorer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.service.RobotOperatorService;

@RestController
@RequestMapping("/rest")
public class RobotController {
	private RobotOperatorService robotOperatorService;
	
	public RobotController(@Autowired RobotOperatorService robotOperatorService) {
		this.robotOperatorService = robotOperatorService;
	}

	@PostMapping("/mars/{command}")
	public String execute(@PathVariable String command) {
		Robot robot = robotOperatorService.execute(command);
		
		return String.format("(%d, %d, N)", robot.getX(), robot.getY());
	}
}
