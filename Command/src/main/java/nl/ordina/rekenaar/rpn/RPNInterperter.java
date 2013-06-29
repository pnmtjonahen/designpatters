package nl.tjonahen.rekenaar.rpn;

import java.util.ArrayList;
import java.util.List;

import nl.tjonahen.rekenaar.command.ICommand;

public class RPNInterperter {
	// operator := '+'|'-'|'/'|'*'
	// NUM := ^[0-9]*.[0-9]            => double
	// term : NUM operator
	// StartNum ( term )*;

	public List<ICommand> parse(String script) throws ParseException {
		List<ICommand> list = new ArrayList<ICommand>();
		StartNum sn = new StartNum();
		sn.parse(script, list);
		return list;
	}

}
