package nl.tjonahen.logging;

import java.util.logging.Logger;

import nl.tjonahen.tracing.ITrace;
/**
 * Adapter zodat de applicatie middels de trace interface gebruik kan maken van het log meganisme
 *
 */
public class LoggingTrace implements ITrace {


	public void trace(String traceMessage) {
		Logger.getLogger(getClass().getName(), traceMessage);
	}

}
