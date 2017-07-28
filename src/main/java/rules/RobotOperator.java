package rules;

import com.contaazul.marsexplorer.model.Robot;

import enums.Bearing;
import enums.RobotOperation;

public class RobotOperator {
	
	private Robot robot;
	
	public RobotOperator() {
		robot = new Robot();
	}
	
	public Robot execute(RobotOperation robotOperation) {
		if (robotOperation == RobotOperation.MOVE_FORWARD) {
			if (robot.getBearing() == Bearing.NORTH) {
				robot.setY(robot.getY() + 1);
			} else if (robot.getBearing() == Bearing.EAST) {
				robot.setX(robot.getX() + 1);
			} else if (robot.getBearing() == Bearing.SOUTH) {
				robot.setY(robot.getY() - 1);
			}
		}
		
		return robot;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}
