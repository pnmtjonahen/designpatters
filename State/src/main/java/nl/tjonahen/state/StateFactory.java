package nl.tjonahen.state;

public class StateFactory {
	public enum DoorStates {
		OPEN, OPENING, CLOSED, CLOSING
	};

	private IDoorState open = new OpenState();

	private IDoorState closed = new ClosedState();

	private IDoorState closing = new ClosingState();

	private IDoorState opening = new OpeningState();

	private StateFactory() {
	}

	public IDoorState getState(DoorStates state) {
		switch (state) {
		case OPEN:
			return open;
		case CLOSED:
			return closed;
		case OPENING:
			return opening;
		case CLOSING:
			return closing;
		}
		return null;
	}

	private static StateFactory instance = null;

	public static final synchronized StateFactory instance() {
		if (instance == null) {
			instance = new StateFactory();
		}
		return instance;

	}
}
