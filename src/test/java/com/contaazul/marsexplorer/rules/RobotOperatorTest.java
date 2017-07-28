package com.contaazul.marsexplorer.rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.enums.*;
import com.contaazul.marsexplorer.model.Robot;
import com.contaazul.marsexplorer.rules.RobotOperator;

public class RobotOperatorTest {
	private RobotOperator robotOperator;
	
	@Before
	public void canInstantiateRobotOperator() throws Exception {
		robotOperator = new RobotOperator();
	}
	
	@Test
	public void robotOperatorCanSetRobot() throws Exception {
		Robot robot = new Robot();
		robotOperator.setRobot(robot);
		
		assertThat(robotOperator.getRobot(), is(robot));
	}
	
	@Test
	public void robotOperatorHasRobotToOperate() throws Exception {
		assertThat(robotOperator.getRobot(), is(not(nullValue())));
	}
	
	@Test
	public void robotOperatorMoveRobotNorthToX0Y1N() throws Exception {
		Robot robot = createAndSetupRobot(Bearing.NORTH);
		
		robot = robotOperator.execute(RobotOperation.MOVE_FORWARD);

		assertThatRobotIsAt(robot, 0, 1, Bearing.NORTH);
	}

	@Test
	public void robotOperatorMoveRobotEastToX1Y0E() throws Exception {
		Robot robot = createAndSetupRobot(Bearing.EAST);
		
		robot = robotOperator.execute(RobotOperation.MOVE_FORWARD);

		assertThatRobotIsAt(robot, 1, 0, Bearing.EAST);
	}

	@Test
	public void robotOperatorMoveRobotSouthToX0YN1S() throws Exception {
		Robot robot = createAndSetupRobot(Bearing.SOUTH);
		
		robot = robotOperator.execute(RobotOperation.MOVE_FORWARD);

		assertThatRobotIsAt(robot, 0, -1, Bearing.SOUTH);
	}

	@Test
	public void robotOperatorMoveRobotWestToXN1Y0W() throws Exception {
		Robot robot = createAndSetupRobot(Bearing.WEST);
		
		robot = robotOperator.execute(RobotOperation.MOVE_FORWARD);

		assertThatRobotIsAt(robot, -1, 0, Bearing.WEST);
	}
	
	@Test
	public void robotOperatorRotateLeftToFaceWest() throws Exception {
		Robot robot = robotOperator.execute(RobotOperation.ROTATE_LEFT);
		
		assertThat(robot.getBearing(), is(Bearing.WEST));
	}
	
	@Test
	public void robotOperatorRotateRightToFaceEast() throws Exception {
		Robot robot = robotOperator.execute(RobotOperation.ROTATE_RIGHT);
		
		assertThat(robot.getBearing(), is(Bearing.EAST));
	}
	
	private Robot createAndSetupRobot(Bearing bearing) {
		Robot robot = new Robot(0, 0, bearing);
		robotOperator.setRobot(robot);
		
		return robot;
	}
	
	private static void assertThatRobotIsAt(Robot robot, Integer x, Integer y, Bearing bearing) {
		assertThat(robot.getX(), is(x));
		assertThat(robot.getY(), is(y));
		assertThat(robot.getBearing(), is(bearing));
	}
}
