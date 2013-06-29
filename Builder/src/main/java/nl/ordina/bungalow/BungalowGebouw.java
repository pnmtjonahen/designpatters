package nl.tjonahen.bungalow;

import java.util.ArrayList;
import java.util.List;

import nl.tjonahen.IGebouw;

public class BungalowGebouw implements IGebouw {
	private List<Kamer> hal = new ArrayList<Kamer>();
	public void addKamer(Kamer kamer) {
		hal.add(kamer);
	}

}
