package nl.tjonahen.spel;

import java.util.ArrayList;
import java.util.List;

public class SpeelVeld {
	private List<Key> keys = new ArrayList<Key>();

	public SpeelVeld add(Key newKey) {
		keys.add(newKey);
		return this;
	}

	@Override
	public String toString() {
		String str = "";
		for (Key key: keys) {
			str = str + key.toString();
		}
		return str;
	}
}
