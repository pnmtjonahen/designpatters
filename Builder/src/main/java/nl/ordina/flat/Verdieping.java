package nl.tjonahen.flat;

import java.util.HashMap;
import java.util.Map;


public class Verdieping {
	private Map<Integer, Kamer> kamers = new HashMap<Integer, Kamer>();
	public Map<Integer, Kamer> getKamers() {
		return kamers;
	}

	private Trap omhoog;
	public void setTrapOmhoog(Trap trap) {
		omhoog = trap;

	}

	private Trap omlaag;
	public void setTrapOmlaag(Trap trap) {
		omlaag = trap;

	}
	public Trap getOmhoog() {
		return omhoog;
	}
	public Trap getOmlaag() {
		return omlaag;
	}

}
