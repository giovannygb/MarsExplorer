package com.contaazul.marsexplorer.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.enums.Bearing;

public class RobotPrinterTest {
	private RobotPrinter robotPrinter;
	private Robot robot;
	
	@Before
	public void setupRobotPrinter() throws Exception {
		robot = new Robot();
		robotPrinter = new RobotPrinter(robot);
	}
	
	@Test
	public void robotNorthShouldBe00N() throws Exception {
		assertThat(robotPrinter.toString(), is("(0, 0, N)"));
	}
	
	@Test
	public void robotWestShouldBe00W() throws Exception {
		robot.setBearing(Bearing.WEST);
		assertThat(robotPrinter.toString(), is("(0, 0, W)"));
	}
	
	@Test
	public void robotSouthShouldBe00S() throws Exception {
		robot.setBearing(Bearing.SOUTH);
		assertThat(robotPrinter.toString(), is("(0, 0, S)"));
	}
	
	@Test
	public void robotEastShouldBe00E() throws Exception {
		robot.setBearing(Bearing.EAST);
		assertThat(robotPrinter.toString(), is("(0, 0, E)"));
	}
}
