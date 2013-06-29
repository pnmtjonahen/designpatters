package nl.tjonahen.widgets;

public class OKCancelWidget extends Widget {

	public OKCancelWidget(int x, int y, String text) {
		super(x, y, 100, 50);

		BoxWidget bw = new BoxWidget(x, y, 100, 50);

		bw.add(new TextWidget(x+25, y+25, text));
		bw.add(new ButtonWidget(x+25, y+50, 50, 25, "OK"));
		bw.add(new ButtonWidget(x+55, y+50, 50, 25, "Cancel"));
		add(bw);
	}
	@Override
	public void draw() {
		System.out.println("<okcancel");
		super.draw();
		System.out.println("</okcancel>");
	}

}
