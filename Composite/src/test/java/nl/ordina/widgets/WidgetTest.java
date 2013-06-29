package nl.tjonahen.widgets;

import org.junit.Test;


public class WidgetTest {

	@Test
	public void drawOKCancelWidgetsTest() {
		OKCancelWidget ok = new OKCancelWidget(10, 10, "En werkt het?");

		ok.draw();
	}

	@Test
	public void drawBoxWidget() {
		BoxWidget b = new BoxWidget(12,33, 100, 200);

		b.draw();
	}
}
