package composants;

import java.awt.Robot;

import services.Pilotage;

public abstract class PilotageRobot implements Pilotage {
	private Robot requiredRobot;

	public Robot getRequiredRobot() {
		return requiredRobot;
	}
	public void setRequiredRobot(Robot requiredRobot) {
		this.requiredRobot = requiredRobot;
	}

}
