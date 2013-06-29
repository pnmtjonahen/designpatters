package nl.tjonahen.decorator;

public class BorderDecorator extends Decorator {
	public void draw() {
		super.draw();
		borderDraw();
	}
	
	private void borderDraw() {
		System.out.println(getClass().getName() + "->borderDraw");
	}
	
	public BorderDecorator(VisualComponent next) {
		super(next);
	}

}
