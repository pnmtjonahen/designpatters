package nl.tjonahen;

public class StdOutView implements IObserver {

	public void update(Document document) {
		System.out.println(document.getText());
	}

}
