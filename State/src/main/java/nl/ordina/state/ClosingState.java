package nl.tjonahen.state;

import nl.tjonahen.Door;
import nl.tjonahen.state.StateFactory.DoorStates;

public class ClosingState implements IDoorState {
	ClosingState() {
	}

	public void click(Door door) {
		door.setDoorState(StateFactory.instance().getState(DoorStates.OPENING));
	}

	public void complete(Door door) {
		door.setDoorState(StateFactory.instance().getState(DoorStates.CLOSED));

	}

	public String toString() {
		return "closing";
	}

}
