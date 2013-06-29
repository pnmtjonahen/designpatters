package nl.tjonahen;

public class StdErroView implements IObserver {

	public void update(Document document) {
		System.err.println(document.getText());
	}

}
