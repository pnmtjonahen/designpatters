package nl.tjonahen.state;

import nl.tjonahen.Door;
import nl.tjonahen.state.StateFactory.DoorStates;

public class OpeningState implements IDoorState {
	OpeningState() {
	}

	public void click(Door door) {
		door.setDoorState(StateFactory.instance().getState(DoorStates.CLOSING));

	}

	public void complete(Door door) {
		door.setDoorState(StateFactory.instance().getState(DoorStates.OPEN));

	}

	public String toString() {
		return "opening";
	}

}
