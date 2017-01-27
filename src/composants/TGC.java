package composants;
import services.I;
import services.K;
import services.L;

public abstract class TGC implements K, L {
	private I requiredI;

	public I getRequiredI() {
		return requiredI;
	}
	public void setRequiredI(I requiredI) {
		this.requiredI = requiredI;
	}
}
