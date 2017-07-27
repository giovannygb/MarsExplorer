package com.contaazul.marsexplorer.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import enums.Bearing;

public class RobotTest {
	private Robot robot;
	
	@Before
	public void setupRobot() throws Exception {
		robot = new Robot();
	}
	
	@Test
	public void robotAtOriginFacingNorth() throws Exception {
		assertThat(robot.getX(), is(0));
		assertThat(robot.getY(), is(0));
		assertThat(robot.getBearing(), is(Bearing.NORTH));
	}

}
