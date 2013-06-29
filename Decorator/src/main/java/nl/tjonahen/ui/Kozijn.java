package nl.tjonahen.ui;

public class Kozijn implements Paint {
	private Paint next;
	
	public Kozijn(Paint next) {
		this.next = next;
	}
	public void paint() {
		System.out.println("Voor kozijn");
		next.paint();
		System.out.println("Na kozijn");
	}

}
