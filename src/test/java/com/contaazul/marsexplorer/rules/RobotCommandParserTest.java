package com.contaazul.marsexplorer.rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.contaazul.marsexplorer.enums.RobotCommand;
import com.contaazul.marsexplorer.exceptions.InvalidRobotOperationException;

public class RobotCommandParserTest {
	private RobotCommandParser robotCommandParser;
	
	@Before
	public void setupRobotCommandParser() throws Exception {
		robotCommandParser = new RobotCommandParser();
	}

	@Test
	public void shouldReturnMoveForwardCommand() throws Exception {
		assertThat(robotCommandParser.get('M'), is(RobotCommand.MOVE_FORWARD));
	}

	@Test
	public void shouldReturnRotateLeftCommand() throws Exception {
		assertThat(robotCommandParser.get('L'), is(RobotCommand.ROTATE_LEFT));
	}
	
	@Test
	public void shouldReturnRotateRightCommand() throws Exception {
		assertThat(robotCommandParser.get('R'), is(RobotCommand.ROTATE_RIGHT));
	}
	
	@Test(expected = InvalidRobotOperationException.class)
	public void shouldRaiseInvalidRobotOperationException() throws Exception {
		robotCommandParser.get('X');
	}
}
