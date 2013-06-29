package nl.tjonahen.state;

import nl.tjonahen.Door;
import nl.tjonahen.state.StateFactory.DoorStates;

public class OpenState implements IDoorState {
	OpenState() {
	}

	public void click(Door door) {
		door.setDoorState(StateFactory.instance().getState(DoorStates.CLOSING));

	}

	public void complete(Door door) {

	}

	public String toString() {
		return "open";
	}

}
