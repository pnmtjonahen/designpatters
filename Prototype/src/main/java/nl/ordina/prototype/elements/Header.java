package nl.tjonahen.prototype.elements;

public class Header {
	private Regel regel = new Regel("");
	public Object clone() throws CloneNotSupportedException {
		Header h = new Header();
		h.setRegel((Regel)regel.clone());
		return h;
	}
	public Regel getRegel() {
		return regel;
	}
	public void setRegel(Regel regel) {
		this.regel = regel;
	}
	public void print() {
		regel.print();
		System.out.println();
	}

}
