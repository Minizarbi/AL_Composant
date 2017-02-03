package composants.impl;

import composants.TGA;

/**
 * Composant de niveau "métier" A1 sous-type de TGA 
 */
public class A1 extends TGA {
	@Override
	public void helloWorld() {
		System.out.println("Hello World from A1, I have " + this.getRequiredJ().howManyChildren() + " children.");
		if (this.getRequiredK().areYouNice()) {
			System.out.println("I am soooo nice!");
		} else {
			System.out.println("I'm not nice at all?!");
		}
	}
}
