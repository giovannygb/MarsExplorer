package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationMoveTest {
	private RobotOperationMove robotOperationMove;
	private Robot robot;
	
	@Before
	public void setupRobotOperationMove() throws Exception {
		robotOperationMove = new RobotOperationMove();
		robot = new Robot();
	}
	
	@Test
	public void moveRobotNorthToX0Y1N() throws Exception {
		robot.setBearing(Bearing.NORTH);
		
		robot = robotOperationMove.execute(robot);

		assertThatRobotIsAt(robot, 0, 1, Bearing.NORTH);
	}

	@Test
	public void moveRobotEastToX1Y0E() throws Exception {
		robot.setBearing(Bearing.EAST);
		
		robot = robotOperationMove.execute(robot);

		assertThatRobotIsAt(robot, 1, 0, Bearing.EAST);
	}

	@Test
	public void moveRobotSouthToX0YN1S() throws Exception {
		robot.setBearing(Bearing.SOUTH);
		
		robot = robotOperationMove.execute(robot);

		assertThatRobotIsAt(robot, 0, -1, Bearing.SOUTH);
	}

	@Test
	public void moveRobotWestToXN1Y0W() throws Exception {
		robot.setBearing(Bearing.WEST);
		
		robot = robotOperationMove.execute(robot);

		assertThatRobotIsAt(robot, -1, 0, Bearing.WEST);
	}
	
	private static void assertThatRobotIsAt(Robot robot, Integer x, Integer y, Bearing bearing) {
		assertThat(robot.getX(), is(x));
		assertThat(robot.getY(), is(y));
		assertThat(robot.getBearing(), is(bearing));
	}
}
