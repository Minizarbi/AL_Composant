package composants.impl;

import composants.TGC;

/**
 * Composant de niveau "m�tier" C1 sous-type de TGC 
 */
public class C1 extends TGC {


	@Override
	public String ew() {
		this.getRequiredI().helloWorld();
		return "Eeeeew!";
	}

	@Override
	public boolean areYouNice() {
		return true;
	}
}
