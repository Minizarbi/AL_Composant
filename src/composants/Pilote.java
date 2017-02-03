package composants;

import services.Pilotage;

/**
 * Composant pilote qui requiert un service défini par l'interface Pilotage
 */
public abstract class Pilote {
	private Pilotage requiredPilotage;

	public Pilotage getRequiredPilotage() {
		return requiredPilotage;
	}
	public void setRequiredPilotage(Pilotage requiredPilotage) {
		this.requiredPilotage = requiredPilotage;
	}
}
