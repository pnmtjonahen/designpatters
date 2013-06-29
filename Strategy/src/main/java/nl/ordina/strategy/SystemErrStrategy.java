package nl.tjonahen.strategy;

public class SystemErrStrategy implements IStrategy {

	public void out(String input) {
		System.err.println(input);
	}

}
