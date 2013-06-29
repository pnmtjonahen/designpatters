package nl.tjonahen.rekenaar.command;

import java.util.Stack;

public interface ICommand {
	public void execute(Stack<Double> stack);
}
