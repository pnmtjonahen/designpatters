package nl.tjonahen.rekenaar.rpn;

import java.util.List;

import nl.tjonahen.rekenaar.command.ICommand;

public class Term {
	private final Num num = new Num();
	private final Operation op = new Operation();

	public String parse(String str, List<ICommand> script) throws ParseException {
		if ("".equals(str)) return str;


		str = num.parse(str, script);
		str = op.parse(str, script);

		return parse(str, script);

	}

}
