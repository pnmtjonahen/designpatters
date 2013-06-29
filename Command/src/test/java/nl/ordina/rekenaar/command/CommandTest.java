package nl.tjonahen.rekenaar.command;

import java.util.ArrayList;
import java.util.List;

import nl.tjonahen.rekenaar.Rekenaar;
import nl.tjonahen.rekenaar.command.ICommand;
import nl.tjonahen.rekenaar.command.Plus;
import nl.tjonahen.rekenaar.command.Pop;
import nl.tjonahen.rekenaar.command.Push;

import org.junit.Test;

public class CommandTest {

	@Test
	public void plusTest() {
		Rekenaar r = new Rekenaar();


		List<ICommand> script = new ArrayList<ICommand>();
// RPN Reverse Polish Notation
// 10, 10, +
		script.add(new Push(new Double(10)));
		script.add(new Push(new Double(10)));
		script.add(new Plus());
		script.add(new Pop());
		r.execute(script);
	}

	@Test
	public void minTest() {
		Rekenaar r = new Rekenaar();


		List<ICommand> script = new ArrayList<ICommand>();
// RPN Reverse Polish Notation
// 10, 10, +
		script.add(new Push(new Double(10)));
		script.add(new Push(new Double(10)));
		script.add(new Min());
		script.add(new Pop());
		r.execute(script);
	}
	@Test
	public void maalTest() {
		Rekenaar r = new Rekenaar();


		List<ICommand> script = new ArrayList<ICommand>();
// RPN Reverse Polish Notation
// 10, 10, +
		script.add(new Push(new Double(10)));
		script.add(new Push(new Double(10)));
		script.add(new Maal());
		script.add(new Pop());
		r.execute(script);
	}

	@Test
	public void deelTest() {
		Rekenaar r = new Rekenaar();


		List<ICommand> script = new ArrayList<ICommand>();
// RPN Reverse Polish Notation
// 10, 10, +
		script.add(new Push(new Double(10)));
		script.add(new Push(new Double(10)));
		script.add(new Deel());
		script.add(new Pop());
		r.execute(script);
	}

}
