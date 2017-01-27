package composants.impl;

import composants.TGC;

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
