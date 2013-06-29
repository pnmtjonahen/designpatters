package nl.tjonahen.rekenaar.command;

import java.util.Stack;

public class Push implements ICommand {
	private Double val;
	public Push(Double i) {
		val = i;
	}

	public void execute(Stack<Double> stack) {
		stack.push(val);
	}


}
