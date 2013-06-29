package nl.tjonahen.handlers;

public class NumberHandler extends Handler {

	public NumberHandler(Handler successor) {
		super(successor);
	}

	@Override
	public void handle(String input) {
		if (input.startsWith("#")) {
			System.out.println(input.substring(1));
		} else
			super.handle(input);
	}

}
