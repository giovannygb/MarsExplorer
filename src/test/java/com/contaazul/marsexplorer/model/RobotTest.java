package com.contaazul.marsexplorer.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.enums.Bearing;

public class RobotTest {
	private Robot robot;
	
	@Before
	public void setupRobot() throws Exception {
		robot = new Robot();
	}
	
	@Test
	public void robotSetX() throws Exception {
		robot.setX(1);
		assertThat(robot.getX(), is(1));
	}
	
	@Test
	public void robotSetY() throws Exception {
		robot.setY(1);
		assertThat(robot.getY(), is(1));
	}
	
	@Test
	public void robotSetBearingSouth() throws Exception {
		robot.setBearing(Bearing.SOUTH);
		assertThat(robot.getBearing(), is(Bearing.SOUTH));
	}
	
	@Test
	public void robotAtOriginFacingNorth() throws Exception {
		assertThat(robot.getX(), is(0));
		assertThat(robot.getY(), is(0));
		assertThat(robot.getBearing(), is(Bearing.NORTH));
	}

}
