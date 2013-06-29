package nl.tjonahen.plane.part;

public class Plane {
	private Fuselage fuselage;
	private Ski[] ski = new Ski[2];
	private JetEngine jetEngine;
	private Body body;
	private Wing[] wings = new Wing[2];
	private Tail tail;
	
	public Fuselage getFuselage() {
		return fuselage;
	}
	public void setFuselage(Fuselage fuselage) {
		this.fuselage = fuselage;
	}
	public Ski[] getSki() {
		return ski;
	}
	public void setSki(Ski[] ski) {
		this.ski = ski;
	}
	public JetEngine getJetEngine() {
		return jetEngine;
	}
	public void setJetEngine(JetEngine jetEngine) {
		this.jetEngine = jetEngine;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Wing[] getWings() {
		return wings;
	}
	public void setWings(Wing[] wings) {
		this.wings = wings;
	}
	public Tail getTail() {
		return tail;
	}
	public void setTail(Tail tail) {
		this.tail = tail;
	}
	
}
