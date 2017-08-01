package com.contaazul.marsexplorer.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RobotOperatorServiceTest {
	private RobotOperatorService robotOperatorService;
	
	@Before
	public void setupRobotOperatorService() throws Exception {
		robotOperatorService = new RobotOperatorService();
	}

	@Test
	public void canExecuteCommandOnRobot() throws Exception {
		robotOperatorService.execute("");
	}
}
