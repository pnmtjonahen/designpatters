package nl.tjonahen.spel;

/**
 * Flyweight. Belangrijk is dat er een pool van mogelijke objecten is. Die dus afhankelijk van hun gebruik, positie etc
 * betekenis hebben
 *
 */
public class KeysFactory {
	private Key wit = new WhiteKey();
	private Key zwart = new BlackKey();

	public Key getKey(char type) {
		switch(type) {
		case 'z' : return zwart;
		case 'w' : return wit;
		default:
			throw new RuntimeException();

		}
	}
}
