package nl.tjonahen.widgets;

/**
 * Een line is een verbinding tussen twee punten
 *
 */
public class LineWidget extends Widget {
	public LineWidget(int x, int y, int x2, int y2) {
		super(x, y, 0, 0);

		add(new PointWidget(x, y));
		add(new PointWidget(x2, y2));
	}
	@Override
	public void draw() {
		System.out.println("<line>");
		super.draw();
		System.out.println("</line>");
	}


}
