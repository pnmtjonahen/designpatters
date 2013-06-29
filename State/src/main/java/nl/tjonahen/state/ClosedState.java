package nl.tjonahen.state;

import nl.tjonahen.Door;
import nl.tjonahen.state.StateFactory.DoorStates;

public class ClosedState implements IDoorState {
	ClosedState() {
	}

	public void click(Door door) {
		door.setDoorState(StateFactory.instance().getState(DoorStates.OPENING));

	}

	public void complete(Door door) {

	}

	public String toString() {
		return "closed";
	}
}
