import composants.impl.A1;
import composants.impl.B1;
import composants.impl.C1;

public class Main {
	public static void main(String[] args) {
		A1 cta1 = new A1();
		B1 ctb1 = new B1();
		C1 ctc1 = new C1();
		cta1.setRequired_j(ctb1);
		cta1.setRequired_k(ctc1);
		cta1.helloWorld();
	}
}
