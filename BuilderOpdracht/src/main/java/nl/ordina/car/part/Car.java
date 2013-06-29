package nl.tjonahen.car.part;

public class Car {
	private Frame frame;
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;
	private Body body;
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public Wheel[] getWheels() {
		return wheels;
	}
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
}
