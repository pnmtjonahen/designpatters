package nl.tjonahen.builders;

import nl.tjonahen.GebouwenBuilder;
import nl.tjonahen.flat.FlatGebouw;
import nl.tjonahen.flat.Kamer;
import nl.tjonahen.flat.Trap;
import nl.tjonahen.flat.Verdieping;

public class FlatBuilder extends GebouwenBuilder {

	public void buildGebouw() {
		gebouw = new FlatGebouw();
		buildVerdieping(0); // begane grond
	}

	public void buildKamer(int opVerdieping, int kamer) {
		((FlatGebouw)gebouw).getVerdiepingen().get(new Integer(opVerdieping)).getKamers().put(new Integer(kamer), new Kamer());
	}

	public void buildTrap(int vanVerdieping, int naarVerdieping) {
		Verdieping onder = ((FlatGebouw)gebouw).getVerdiepingen().get(new Integer(vanVerdieping));
		Verdieping boven = ((FlatGebouw)gebouw).getVerdiepingen().get(new Integer(naarVerdieping));
		Trap trap = new Trap(onder, boven);
		onder.setTrapOmhoog(trap);
		boven.setTrapOmlaag(trap);
		((FlatGebouw)gebouw).getTrappenhuis().add(trap);
	}

	public void buildVerdieping(int verdieping) {
		((FlatGebouw)gebouw).getVerdiepingen().put(new Integer(verdieping), new Verdieping());
	}

}
