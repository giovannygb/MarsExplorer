package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveWestTest {
	private RobotOperationMoveWest robotOperationMoveWest;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveWest() throws Exception {
		robotOperationMoveWest = new RobotOperationMoveWest();
		robot = new Robot(0, 0, Bearing.WEST);
	}
	
	@Test
	public void moveRobotWestToXN1Y0W() throws Exception {
		robot = robotOperationMoveWest.execute(robot);
		
		assertThatRobotIsAt(robot, -1, 0, Bearing.WEST);
	}
	
	private static void assertThatRobotIsAt(Robot robot, Integer x, Integer y, Bearing bearing) {
		assertThat(robot.getX(), is(x));
		assertThat(robot.getY(), is(y));
		assertThat(robot.getBearing(), is(bearing));
	}
}
