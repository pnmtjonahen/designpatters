package nl.tjonahen;

import nl.tjonahen.handlers.AlphaHandler;
import nl.tjonahen.handlers.Handler;
import nl.tjonahen.handlers.NullHandler;
import nl.tjonahen.handlers.NumberHandler;

import org.junit.Test;


public class HandlerTest {
	@Test
	public void testChain() {
		// setup de chain
		Handler h = new Handler(new NumberHandler(new Handler(new AlphaHandler(new Handler(new NullHandler(null))))));
		h.handle("Dit is een string");
		h.handle("#nummer");
		h.handle("@alpha");
	}
}
