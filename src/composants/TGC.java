package composants;
import services.I;
import services.K;
import services.L;

/**
 * SuperType de composant logiciel TGC qui fournit des services d�finis par l'interface K et L 
 * et requiert un service d�fini par l'interface I
 */
public abstract class TGC implements K, L {
	private I requiredI;

	public I getRequiredI() {
		return requiredI;
	}
	public void setRequiredI(I requiredI) {
		this.requiredI = requiredI;
	}
}
