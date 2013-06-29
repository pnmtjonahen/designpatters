package nl.tjonahen;

import nl.tjonahen.state.IDoorState;

public class Door {
	public IDoorState state = null;


	public Door(IDoorState initial) {
		state = initial;
	}

	public void setDoorState(IDoorState newState) {
		state = newState;
	}

	public void click() {
		state.click(this);
	}

	public void complete() {
		state.complete(this);
	}

	public String getCurrentPosition() {
		return state.toString();
	}
}
