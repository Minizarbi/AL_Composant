package composants;

import services.Pilotage;

public abstract class Pilote {
	private Pilotage requiredPilotage;

	public Pilotage getRequiredPilotage() {
		return requiredPilotage;
	}
	public void setRequiredPilotage(Pilotage requiredPilotage) {
		this.requiredPilotage = requiredPilotage;
	}
}
