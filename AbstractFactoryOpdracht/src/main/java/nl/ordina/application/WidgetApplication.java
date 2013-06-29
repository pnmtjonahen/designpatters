package nl.tjonahen.application;

import nl.tjonahen.widgets.IScrollBar;
import nl.tjonahen.widgets.IWidgetFactory;
import nl.tjonahen.widgets.IWindow;

/**
 * Applicatie die gebruikmakend van een AbstractFactory widget maakt en aanroept.
 * 
 *
 */
public class WidgetApplication {

	public static void main(String[] args) {
		IWidgetFactory wf = bepaalWidgetFactory(args);

		maakWidgets(wf);
	}
	
	
	private static void maakWidgets(IWidgetFactory wf) {
		
		IWindow w = wf.createWindow();
		w.draw();
		
		IScrollBar sb = wf.createScrollBar();
		sb.draw();
	}
	
	
	private static IWidgetFactory bepaalWidgetFactory(String[] args) {
		// implementeer hier de keuze van AbstractFactory implementatie.
		return null;
	}

}
