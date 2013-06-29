package nl.tjonahen.base;

public class Document {
	private Application parent;

	public Document(Application app) {
		parent = app;
	}

	protected Document() {

	}

	protected Application getApplication() {
		return parent;
	}
}
