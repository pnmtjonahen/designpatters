package nl.tjonahen.rekenaar.command;

import java.util.Stack;

public class Plus implements ICommand {

	public void execute(Stack<Double> stack) {
		stack.push(stack.pop() + stack.pop());
	}


}
