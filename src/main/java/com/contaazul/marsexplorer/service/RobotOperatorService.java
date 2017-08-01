package com.contaazul.marsexplorer.service;

import org.springframework.stereotype.Service;

import com.contaazul.marsexplorer.model.Robot;

@Service
public class RobotOperatorService {
	public Robot execute(String command) {
		return new Robot();
	}
}
