package nl.tjonahen.builders;

import nl.tjonahen.GebouwenBuilder;
import nl.tjonahen.bunker.BunkerGebouw;

public class BunkerBuilder extends GebouwenBuilder {

	@Override
	public void buildGebouw() {
		gebouw = new BunkerGebouw();
	}

	@Override
	public void buildVerdieping(int verdieping) {
		super.buildVerdieping(verdieping);
	}

}
