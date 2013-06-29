package nl.tjonahen;

import nl.tjonahen.context.Context;
import nl.tjonahen.strategy.SevereLevelLogStrategy;
import nl.tjonahen.strategy.SystemErrStrategy;
import nl.tjonahen.strategy.SystemOutStrategy;

import org.junit.Test;


public class StrategyTest {

	@Test
	public void testStdOutStrategy() {
		nl.tjonahen.context.Context c = new Context(new SystemOutStrategy());

		c.ibm();
	}

	@Test
	public void testStdErrStrategy() {
		nl.tjonahen.context.Context c = new Context(new SystemErrStrategy());

		c.ibm();
	}

	@Test
	public void testSevereLevelStrategy() {
		nl.tjonahen.context.Context c = new Context(new SevereLevelLogStrategy());

		c.ibm();
	}

}
