package nl.tjonahen.widgets;

public class PointWidget extends Widget {

	public PointWidget(int xStart, int yStart) {
		super(xStart, yStart, 1, 1);
	}

	@Override
	public void draw() {

		System.out.println("<point x='"+getX()+"' y='"+getY()+"' />");
	}

}
