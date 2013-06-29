package nl.tjonahen.spel;

import org.junit.Test;


public class SpeelVeldTests {


	@Test
	public void testFlyweightSpeelveldSetup() {
		KeysFactory kf = new KeysFactory();

		SpeelVeld sp = new SpeelVeld();

		sp.add(kf.getKey('w')).add(kf.getKey('w')).add(kf.getKey('z')).add(kf.getKey('w')).add(kf.getKey('z'));

		System.out.println("Speelveld:"+sp.toString());
	}

	@Test
	public void testNotFlyweightSpeelveldSetup() {

		SpeelVeld sp = new SpeelVeld();
		sp.add(new WhiteKey()).add(new WhiteKey()).add(new BlackKey()).add(new WhiteKey()).add(new BlackKey());
		System.out.println("Speelveld:"+sp.toString());
	}

}
