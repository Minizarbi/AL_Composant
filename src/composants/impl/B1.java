package composants.impl;

import composants.TGB;

/**
 * Composant de niveau "métier" C1 sous-type de TGC 
 */
public class B1 extends TGB {
	@Override
	public int howManyChildren() {
		return 4;
	}
}
