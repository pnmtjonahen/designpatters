package nl.tjonahen.widgets.motif;

import nl.tjonahen.widgets.IScrollBar;
import nl.tjonahen.widgets.IWidgetFactory;
import nl.tjonahen.widgets.IWindow;

public class WidgetFactory implements IWidgetFactory {

	public IScrollBar createScrollBar() {
		return new ScrollBar();
	}

	public IWindow createWindow() {
		return new Window();
	}

}
