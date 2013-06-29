package nl.tjonahen.widgets;

public class TextWidget extends Widget {
	private String text;
	public TextWidget(int x, int y, String text) {
		super(x, y,0,0);
		this.text = text;
	}


	@Override
	public void draw() {
		System.out.println("<text>"+text+"</text>");
	}

}
