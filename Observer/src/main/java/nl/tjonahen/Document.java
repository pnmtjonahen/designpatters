package nl.tjonahen;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private String text = "";
	private List<IObserver> observers = new ArrayList<IObserver>();

	private void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update(this);
		}
	}
	public void addObserver(IObserver o) {
		observers.add(o);
	}

	public void append(String text) {
		this.text += text;
		// voer wijzigingen op het document door
		notifyObservers();
	}


	public String getText() {
		return text;
	}
}
