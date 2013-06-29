package nl.tjonahen.handlers;

public class Handler {
	private Handler successor;

	public Handler(Handler successor) {
		this.successor = successor;
	}

	public void handle(String input) {
		if (successor != null) successor.handle(input);
	}

}
