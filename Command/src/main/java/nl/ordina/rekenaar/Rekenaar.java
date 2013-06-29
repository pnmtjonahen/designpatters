package nl.tjonahen.rekenaar;

import java.util.List;
import java.util.Stack;

import nl.tjonahen.rekenaar.command.ICommand;

public class Rekenaar {


	public void execute(List<ICommand> script) {
		Stack<Double> stack = new Stack<Double>();
		for (ICommand command : script) {
			command.execute(stack);
		}
	}
}
