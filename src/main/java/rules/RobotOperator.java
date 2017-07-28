package rules;

import com.contaazul.marsexplorer.model.Robot;

public class RobotOperator {
	
	private Robot robot;
	
	public RobotOperator() {
		robot = new Robot();
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}
