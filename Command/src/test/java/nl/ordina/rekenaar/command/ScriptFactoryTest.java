package nl.tjonahen.rekenaar.command;

import nl.tjonahen.rekenaar.Rekenaar;
import nl.tjonahen.rekenaar.rpn.ParseException;

import org.junit.Test;


public class ScriptFactoryTest {

	@Test
	public void scriptTest() throws ParseException {
		Rekenaar r = new Rekenaar();

		r.execute(ScriptFactory.instance().create("10 10 + 10 *"));
	}

}
