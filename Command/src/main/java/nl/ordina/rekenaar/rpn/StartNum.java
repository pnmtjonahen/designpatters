package nl.tjonahen.rekenaar.rpn;

import java.util.List;

import nl.tjonahen.rekenaar.command.ICommand;
import nl.tjonahen.rekenaar.command.Pop;

public class StartNum extends Num {
	private final Term term = new Term();
	public String parse(String str, List<ICommand> script) throws ParseException {
		str = term.parse(super.parse(str, script), script);
		script.add(new Pop());
		return str;
	}

}
