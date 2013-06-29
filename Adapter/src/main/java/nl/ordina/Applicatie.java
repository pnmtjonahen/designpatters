package nl.tjonahen;

import nl.tjonahen.logging.LoggingTrace;
import nl.tjonahen.tracing.ITrace;

public class Applicatie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ITrace tracer = new LoggingTrace();


		tracer.trace("Start applicatie.");

// Doe iets

		tracer.trace("Doe iets.");

// Doe nog iets (maar dan wat anders)

		tracer.trace("Stop applicatie.");
	}
}
