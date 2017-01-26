package composants.impl;

import composants.TGA;

public class A1 extends TGA {
	@Override
	public void helloWorld() {
		System.out.println("Hello World from A1, I have " + this.getRequired_j().howManyChildren() + " children.");
		if (this.getRequired_k().areYouGaaaaaaaaaay()) {
			System.out.println("I am gaaaaaaaaaay!");
		} else {
			System.out.println("I'm not gay?!");
		}
	}
}
