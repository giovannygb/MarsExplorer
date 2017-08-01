package com.contaazul.marsexplorer.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.service.RobotOperatorService;

public class RobotControllerTest {
	private RobotController robotController;
	
	@Before
	public void setupRobotController() throws Exception {
		robotController = new RobotController(new RobotOperatorService());
	}
	
	@Test
	public void canExecuteCommand() throws Exception {
		assertThat(robotController.execute(""), is("(0, 0, N)"));
	}
}
