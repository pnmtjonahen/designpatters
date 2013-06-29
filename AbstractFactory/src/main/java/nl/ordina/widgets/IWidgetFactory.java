package nl.tjonahen.widgets;

/**
 * Abstract factory implementatie.
 * Profide an interface for creating families of related or dependant objects without specifying their concrete classes.
 *
 * De IWidgetFactory is de abstract factory. Alle concrete factories moeten deze interface implementeren.
 *
 *
 */

public interface IWidgetFactory {
	public IWindow createWindow();
	public IScrollBar createScrollBar();
}
