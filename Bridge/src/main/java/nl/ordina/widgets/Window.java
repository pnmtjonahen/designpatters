package nl.tjonahen.widgets;

public class Window implements IWindow{
	IWindow impl;

	public void setWidgetType(WidgetEnum type) {
		switch (type) {
		case MOTIF:
			impl = new nl.tjonahen.widgets.motif.Window();
			break;
		case PM:
			impl = new nl.tjonahen.widgets.pm.Window();
			break;
		}

	}

	public void draw() {
		if (impl != null) impl.draw();

	}

}
