package composants;
import services.I;
import services.K;
import services.L;

public abstract class TGC implements K, L {
	private I required_i;

	public I getRequired_i() {
		return required_i;
	}
	public void setRequired_i(I required_i) {
		this.required_i = required_i;
	}
}
