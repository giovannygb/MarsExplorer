package com.contaazul.marsexplorer.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class RobotTest {
	private Robot robot;
	
	@Before
	public void canInstantiateRobot() throws Exception {
		robot = new Robot();
	}
	
	@Test
	public void robotAtOriginFacingNorth() throws Exception {
		Robot robot = new Robot();

		assertThat(robot.getX(), is(0));
		assertThat(robot.getY(), is(0));
		assertThat(robot.getBearing(), is("N"));
	}

}
