package com.contaazul.marsexplorer.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class RobotControllerTest {
	private RobotController robotController;
	
	@Before
	public void setupRobotController() throws Exception {
		robotController = new RobotController();
	}
	
	@Test
	public void canExecuteCommand() throws Exception {
		assertThat(robotController.execute(""), is("(0, 0, N)"));
	}
}
