package nl.tjonahen.rekenaar.rpn;

import java.util.List;

import nl.tjonahen.rekenaar.command.ICommand;
import nl.tjonahen.rekenaar.command.Push;

public class Num {

	public String parse(String str, List<ICommand> script) throws ParseException {
		str = str.trim();
		if ("".equals(str)) return str;

		String nummer = str.substring(0, str.indexOf(' '));

		Double d;
		try {
			d = Double.parseDouble(nummer.trim());
		} catch (NumberFormatException nfe) {
			System.err.println("Parse error " + nummer);
			throw new ParseException();
		}

		script.add(new Push(d));

		return str.substring(str.indexOf(' ')+1);

	}

}
