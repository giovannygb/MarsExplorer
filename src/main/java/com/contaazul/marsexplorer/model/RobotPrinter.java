package com.contaazul.marsexplorer.model;

public class RobotPrinter {
	private Robot robot;
	private String format;

	public RobotPrinter(Robot robot) {
		this(robot, "(%d, %d, %.1s)");
	}
	
	public RobotPrinter(Robot robot, String format) {
		this.robot = robot;
		this.format = format;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	@Override
	public String toString() {
		return String.format(format, robot.getX(), robot.getY(), robot.getBearing());
	}
}
