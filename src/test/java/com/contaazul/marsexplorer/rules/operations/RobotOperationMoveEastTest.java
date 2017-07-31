package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveEastTest {
	private RobotOperationMoveEast robotOperationMoveEast;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveEast() throws Exception {
		robotOperationMoveEast = new RobotOperationMoveEast();
		robot = new Robot(0, 0, Bearing.EAST);
	}
	
	@Test
	public void moveRobotEastToX1Y0E() throws Exception {
		robot = robotOperationMoveEast.execute(robot);

		assertThatRobotIsAt(robot, 1, 0, Bearing.EAST);
	}
	
	private static void assertThatRobotIsAt(Robot robot, Integer x, Integer y, Bearing bearing) {
		assertThat(robot.getX(), is(x));
		assertThat(robot.getY(), is(y));
		assertThat(robot.getBearing(), is(bearing));
	}
}
