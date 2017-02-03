package services;

import utilitaires.Cap;

/**
 * Service qui fournit des méthodes de pilotage du robot
 */
public interface Pilotage {

	public void avancer(int distance);
	public void reculer(int distance);
	public void quartDeTourGauche();
	public void quartDeTourDroite();
	public void setCap(Cap c);
	
}
