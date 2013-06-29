package nl.tjonahen.widgets;

public class ButtonWidget extends Widget {

	public ButtonWidget(int x, int y, int width, int height, String text) {
		super(x, y, width, height);
		BoxWidget box = new BoxWidget(x, y, width, height);
		box.add(new TextWidget(x, y, text));
		add(box);
	}
	@Override
	public void draw() {
		System.out.println("<button>");
		super.draw();
		System.out.println("</button>");
	}

}
