import composants.impl.A1;
import composants.impl.B1;
import composants.impl.C1;
import composants.impl.D1;

public class Main {
	public static void main(String[] args) {
		A1 cta1 = new A1();
		B1 ctb1 = new B1();
		C1 ctc1 = new C1();
		D1 ctd1 = new D1();
		cta1.setRequiredJ(ctb1);
		cta1.setRequiredK(ctc1);
		cta1.helloWorld();
		ctc1.setRequiredI(cta1);
		ctd1.helloWorld();
	}
}
