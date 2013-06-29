package nl.tjonahen.decorator;

public class TextView implements VisualComponent{
	public void draw() {
		System.out.println(getClass().getName() + "->draw");
	}
}
