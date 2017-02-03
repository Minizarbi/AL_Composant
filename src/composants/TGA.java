package composants;
import services.I;
import services.J;
import services.K;

/**
 * SuperType de composant logiciel TGA qui fournit un service défini par l'interface I 
 * et requiert deux services définis respectivement par les interfaces J et K
 *
 */
public abstract class TGA implements I {
	private J requiredJ;
	private K requiredK;
	
	public J getRequiredJ() {
		return requiredJ;
	}
	public void setRequiredJ(J requiredJ) {
		this.requiredJ = requiredJ;
	}
	public K getRequiredK() {
		return requiredK;
	}
	public void setRequiredK(K requiredK) {
		this.requiredK = requiredK;
	}
}
