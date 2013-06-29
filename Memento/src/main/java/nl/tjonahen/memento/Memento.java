package nl.tjonahen.memento;

public class Memento implements IMementoStoreable {
	private State state;
	public Memento(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
}
