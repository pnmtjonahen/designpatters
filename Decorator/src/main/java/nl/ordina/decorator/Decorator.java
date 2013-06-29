package nl.tjonahen.decorator;

public class Decorator implements VisualComponent{
	private VisualComponent nextComponent;
	
	public void draw() {
		nextComponent.draw();
	}
	
	public Decorator(VisualComponent next) {
		this.nextComponent = next;
	}

}
