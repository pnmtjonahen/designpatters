package nl.tjonahen.strategy;

public class SystemOutStrategy implements IStrategy {

	public void out(String input) {
		System.out.println(input);
	}

}
