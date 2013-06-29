package nl.tjonahen.widgets;

import java.util.ArrayList;
import java.util.List;


/**
 * Composite pattern.
 *
 * Key to the composite pattern is an abstract class that represents both primitives and their containers.
 *
 * Dit is dus de abstracte class. Alle afgeleide zijn dan ook primitieve of containers.
 *
 */
public class Widget {
	private int x, y, width, height;

	private List<Widget> children = new ArrayList<Widget>();

	public void add(Widget newChild) {
		children.add(newChild);
	}

	public void draw() {
// zelf tekenen
		for (Widget widget : children) {
// kinderen tekenen
			widget.draw();
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Widget(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

}
