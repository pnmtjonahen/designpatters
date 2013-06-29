package nl.tjonahen.base;

import java.util.ArrayList;
import java.util.List;

/**
 * FactoryMethod.
 * Defines interface and let subclassing decide which class to instantiate.
 *
 *
 */
public class Application {
	private List<Document> docs = new ArrayList<Document>();
	private Document doc;
	private View view;
	/**
	 * Application start methode deze start (tussen aanhalings tekens) de applicatie
	 *
	 */
	public final void start() {
		// Creer een standaard document;
		doc = createDocument(this);
		docs.add(doc);
		view = createView(this, doc);

		view.show();
	}

	public void newDocument() {
		doc = createDocument(this);
		docs.add(doc);
		view = createView(this, doc);

		view.show();
	}

	public void newView() {
		view = createView(this, doc);
		view.show();
	}

	/**
	 * Default implementation van een factory method om een document te creeren.
	 */
	public Document createDocument(Application app) {
		return new Document(app);
	}

	/**
	 * Default implementatie van een factory method om een view te creeren.
	 */
	public View createView(Application app, Document doc) {
		return new View(app, doc);
	}

}
