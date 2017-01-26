package composants;
import services.I;
import services.J;
import services.K;

public abstract class TGA implements I {
	private J required_j;
	private K required_k;
	
	public J getRequired_j() {
		return required_j;
	}
	public void setRequired_j(J required_j) {
		this.required_j = required_j;
	}
	public K getRequired_k() {
		return required_k;
	}
	public void setRequired_k(K required_k) {
		this.required_k = required_k;
	}
}
