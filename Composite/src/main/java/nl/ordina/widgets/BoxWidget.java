package nl.tjonahen.widgets;

/**
 * Een box bestaat uit 4 lines
 *
 *
 */
public class BoxWidget extends Widget {
	public BoxWidget(int x, int y, int width, int height) {
		super(x,y,width, height);

		// construct the lines

		add(new LineWidget(x, y, x, y+width));
		add(new LineWidget(x, y, x+height, y));
		add(new LineWidget(x+height, y, x+height, y+width));
		add(new LineWidget(x, y+width, x+height, y+width));
	}

	@Override
	public void draw() {
		System.out.println("<box>");
		super.draw();
		System.out.println("</box>");
	}


}
