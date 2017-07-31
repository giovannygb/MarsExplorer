package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveSouthTest {
	private RobotOperationMoveSouth robotOperationMoveSouth;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMoveSouth() throws Exception {
		robotOperationMoveSouth = new RobotOperationMoveSouth();
		robot = new Robot(0, 0, Bearing.SOUTH);
	}
	
	@Test
	public void moveRobotSouthToX0YN1S() throws Exception {
		robot = robotOperationMoveSouth.execute(robot);

		assertThatRobotIsAt(robot, 0, -1, Bearing.SOUTH);
	}
	
	private static void assertThatRobotIsAt(Robot robot, Integer x, Integer y, Bearing bearing) {
		assertThat(robot.getX(), is(x));
		assertThat(robot.getY(), is(y));
		assertThat(robot.getBearing(), is(bearing));
	}
}
