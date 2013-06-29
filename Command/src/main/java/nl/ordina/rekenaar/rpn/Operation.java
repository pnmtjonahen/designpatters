package nl.tjonahen.rekenaar.rpn;

import java.util.List;



import nl.tjonahen.rekenaar.command.Deel;
import nl.tjonahen.rekenaar.command.ICommand;
import nl.tjonahen.rekenaar.command.Maal;
import nl.tjonahen.rekenaar.command.Min;
import nl.tjonahen.rekenaar.command.Plus;

public class Operation {

	public String parse(String str, List<ICommand> script) throws ParseException {
		if ("".equals(str)) return str;
		char token = str.charAt(0);


		switch (token) {
			case '+':
				script.add(new Plus());
				break;
			case '-':
				script.add(new Min());
				break;
			case '/':
				script.add(new Deel());
				break;
			case '*':
				script.add(new Maal());
				break;
			default:
				throw new ParseException();
		}
		return str.substring(1);
	}

}
