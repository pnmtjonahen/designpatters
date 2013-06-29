package nl.tjonahen.builders;

import nl.tjonahen.GebouwenBuilder;
import nl.tjonahen.bungalow.BungalowGebouw;
import nl.tjonahen.bungalow.Kamer;

public class BungalowBuilder extends GebouwenBuilder {

	@Override
	public void buildGebouw() {
		gebouw = new BungalowGebouw();
	}

	@Override
	public void buildKamer(int opVerdieping, int kamer) {
		((BungalowGebouw)gebouw).addKamer(new Kamer());
	}

}
