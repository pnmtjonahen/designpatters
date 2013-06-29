package nl.tjonahen.memento;

public class State {
	int attrib;

	public State(Originator originator) {
		attrib = originator.getAttrib();
	}

	public void update(Originator originator) {
		originator.setAttrib(attrib);
	}

}
