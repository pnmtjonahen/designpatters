package nl.tjonahen.rekenaar.command;

import java.util.List;

import nl.tjonahen.rekenaar.rpn.ParseException;
import nl.tjonahen.rekenaar.rpn.RPNInterperter;

public class ScriptFactory {
	private RPNInterperter rpn = new RPNInterperter();
	private static ScriptFactory instance = null;
	synchronized public static ScriptFactory instance() {
		if (instance == null) {
			instance = new ScriptFactory();
		}
		return instance;

	}

	public List<ICommand> create(String script) throws ParseException{
		return rpn.parse(script);
	}
}
