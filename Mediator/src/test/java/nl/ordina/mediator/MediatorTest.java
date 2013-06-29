package nl.tjonahen.mediator;

import org.junit.Test;


public class MediatorTest {
	@Test
	public void testMediator() {
		MyMediator m = new MyMediator();

		m.performIBM();
	}
}
