package nl.tjonahen.tracing;

public class Trace implements ITrace {

	/* (non-Javadoc)
	 * @see nl.tjonahen.tracing.ITrace#trace(java.lang.String)
	 */
	public void trace(String traceMessage) {
		System.out.println(traceMessage);
	}
}
