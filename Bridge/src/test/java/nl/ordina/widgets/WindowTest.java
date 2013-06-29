package nl.tjonahen.widgets;

import org.junit.Test;


public class WindowTest {
	@Test
	public void runBridgeTest() {
		Window w = new Window();

		w.draw();

		w.setWidgetType(WidgetEnum.MOTIF);

		w.draw();

		w.setWidgetType(WidgetEnum.PM);

		w.draw();
	}
}
