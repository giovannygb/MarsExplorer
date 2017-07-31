package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationRotateLeftTest {
	private RobotOperationRotateLeft robotOperationRotateLeft;
	private Robot robot;
	
	@Before
	public void setupRobotOperationRotateLeft() throws Exception {
		robotOperationRotateLeft = new RobotOperationRotateLeft();
		robot = new Robot();
	}
	
	@Test
	public void rotateLeftNorthFacingRobotToWest() throws Exception {
		robot.setBearing(Bearing.NORTH);
		
		robot = robotOperationRotateLeft.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.WEST));
	}

	
	@Test
	public void rotateLeftWestFacingRobotToSouth() throws Exception {
		robot.setBearing(Bearing.WEST);
		
		robot = robotOperationRotateLeft.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.SOUTH));
	}

	
	@Test
	public void rotateLeftSouthFacingRobotToEast() throws Exception {
		robot.setBearing(Bearing.SOUTH);
		
		robot = robotOperationRotateLeft.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.EAST));
	}

	
	@Test
	public void rotateLeftEastFacingRobotToNorth() throws Exception {
		robot.setBearing(Bearing.EAST);
		
		robot = robotOperationRotateLeft.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.NORTH));
	}
	
}
