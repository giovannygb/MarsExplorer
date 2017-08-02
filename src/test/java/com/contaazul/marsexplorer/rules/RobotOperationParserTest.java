package com.contaazul.marsexplorer.rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.enums.Bearing;
import com.contaazul.marsexplorer.rules.operations.*;

public class RobotOperationParserTest {
	private RobotOperationParser robotOperationParser;
	
	@Before
	public void setupRobotOperationParser() throws Exception {
		robotOperationParser = new RobotOperationParser();
	}

	@Test
	public void shouldReturnMoveNorth() throws Exception {
		assertThat(robotOperationParser.get(Bearing.NORTH), instanceOf(RobotOperationMoveNorth.class));
	}
	
	@Test
	public void shouldReturnMoveEast() throws Exception {
		assertThat(robotOperationParser.get(Bearing.EAST), instanceOf(RobotOperationMoveEast.class));
	}
	
	@Test
	public void shouldReturnMoveSouth() throws Exception {
		assertThat(robotOperationParser.get(Bearing.SOUTH), instanceOf(RobotOperationMoveSouth.class));
	}
	
	@Test
	public void shouldReturnMoveWest() throws Exception {
		assertThat(robotOperationParser.get(Bearing.WEST), instanceOf(RobotOperationMoveWest.class));
	}
}
