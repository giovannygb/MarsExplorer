package com.contaazul.marsexplorer.rules.operations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.model.Robot;

public class RobotOperationRotateRightTest {
	private RobotOperationRotateRight robotOperationRotateRight;
	private Robot robot;
	
	@Before
	public void setupRobotOperationRotateLeft() throws Exception {
		robotOperationRotateRight = new RobotOperationRotateRight();
		robot = new Robot();
	}
	
	@Test
	public void rotateRightNorthFacingRobotToEast() throws Exception {
		robot.setBearing(Bearing.NORTH);
		
		robot = robotOperationRotateRight.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.EAST));
	}

	
	@Test
	public void rotateRightEastFacingRobotToSouth() throws Exception {
		robot.setBearing(Bearing.EAST);
		
		robot = robotOperationRotateRight.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.SOUTH));
	}

	
	@Test
	public void rotateRightSouthFacingRobotToWest() throws Exception {
		robot.setBearing(Bearing.SOUTH);
		
		robot = robotOperationRotateRight.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.WEST));
	}

	
	@Test
	public void rotateRightWestFacingRobotToNorth() throws Exception {
		robot.setBearing(Bearing.WEST);
		
		robot = robotOperationRotateRight.execute(robot);
		
		assertThat(robot.getBearing(), is(Bearing.NORTH));
	}
	
}
