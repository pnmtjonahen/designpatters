package nl.tjonahen.flat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import nl.tjonahen.IGebouw;
/**
 * Flat gebouw bestaat uit.
 *
 * Verdiepingen met kamers en een trap omhoog en of en trap omlaag.
 *
 */
public class FlatGebouw implements IGebouw {
	private Map<Integer, Verdieping> verdiepingen = new HashMap<Integer, Verdieping>();
	public Map<Integer, Verdieping> getVerdiepingen() {
		return verdiepingen;
	}
	private Set<Trap> trappenhuis = new HashSet<Trap>();
	public Set<Trap> getTrappenhuis() {
		return trappenhuis;
	}

}
