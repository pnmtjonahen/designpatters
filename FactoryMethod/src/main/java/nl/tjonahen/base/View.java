package nl.tjonahen.base;

public class View {
	private Application parent;
	private Document doc;
	public View(Application app, Document doc) {
		parent = app;
		this.doc = doc;
	}

	protected View() {

	}
	public void show() {

	}

	protected Application getApplication() {
		return parent;
	}

	protected Document getDocument() {
		return doc;
	}

}
