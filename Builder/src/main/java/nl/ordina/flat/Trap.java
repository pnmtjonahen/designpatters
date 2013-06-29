package nl.tjonahen.flat;


public class Trap {
	private Verdieping onder;
	private Verdieping boven;
	public Trap(Verdieping onder, Verdieping boven) {
		this.onder = onder;
		this.boven = boven;
	}
	public Verdieping getBoven() {
		return boven;
	}
	public Verdieping getOnder() {
		return onder;
	}
}
