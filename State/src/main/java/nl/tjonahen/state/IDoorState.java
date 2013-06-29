package nl.tjonahen.state;

import nl.tjonahen.Door;

public interface IDoorState {
	public void click(Door door);

	public void complete(Door door);

}
