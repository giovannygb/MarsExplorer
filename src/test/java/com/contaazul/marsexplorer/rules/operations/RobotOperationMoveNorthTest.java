package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveNorthTest {
	private RobotOperationMoveNorth robotOperationMoveNorth;
	private Robot robot;
	
	@Before
	public void testName() throws Exception {
		robotOperationMoveNorth = new RobotOperationMoveNorth();
		robot = new Robot();
	}
	
	@Test
	public void moveRobotNorthToX0Y1N() throws Exception {
			robot.setBearing(Bearing.NORTH);
			
			robot = robotOperationMoveNorth.execute(robot);

			assertThatRobotIsAt(robot, 0, 1, Bearing.NORTH);
	}
	
	private static void assertThatRobotIsAt(Robot robot, Integer x, Integer y, Bearing bearing) {
		assertThat(robot.getX(), is(x));
		assertThat(robot.getY(), is(y));
		assertThat(robot.getBearing(), is(bearing));
	}
}
