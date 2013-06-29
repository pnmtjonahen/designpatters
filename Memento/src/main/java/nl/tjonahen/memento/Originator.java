package nl.tjonahen.memento;
/**
 * Originator. de state van de originator is alleen attrib, Zie ook State.
 *
 *
 */
public class Originator {
	private int attrib;
	private String text;

	public IMementoStoreable createMemento() {
		return new Memento(new State(this));
	}

	public void setMemento(IMementoStoreable memento) {
		if (memento instanceof Memento) {
			((Memento)memento).getState().update(this);
		}
	}
	/**
	 * Interesting Business Method nummer 1
	 *
	 */
	public void IBM1() {
		attrib++;

	}

	public String IBM2() {
		text = "aantal IBM1's =" + attrib;
		return text;
	}

	public int getAttrib() {
		return attrib;
	}

	public void setAttrib(int attrib) {
		this.attrib = attrib;
	}

}
