package nl.tjonahen.handlers;

public class NullHandler extends Handler {

	@Override
	public void handle(String input) {

		System.out.println("Drop-off.");
	}

	public NullHandler(Handler successor) {
		super(successor);
	}

}
