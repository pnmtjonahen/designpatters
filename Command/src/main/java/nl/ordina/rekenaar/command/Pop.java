package nl.tjonahen.rekenaar.command;

import java.util.Stack;

public class Pop implements ICommand {
	public void execute(Stack<Double> stack) {
		System.out.println(stack.pop().toString());
	}

}
