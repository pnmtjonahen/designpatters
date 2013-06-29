package nl.tjonahen.handlers;

public class AlphaHandler extends Handler {

	public AlphaHandler(Handler successor) {
		super(successor);
	}

	@Override
	public void handle(String input) {
		if (input.startsWith("@")) {
			System.err.println(input.substring(1));
		} else
			super.handle(input);
	}

}
