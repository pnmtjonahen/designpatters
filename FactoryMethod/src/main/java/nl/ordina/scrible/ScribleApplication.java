package nl.tjonahen.scrible;

import nl.tjonahen.base.Application;
import nl.tjonahen.base.Document;
import nl.tjonahen.base.View;

/**
 * Factory method implementatie voor een scrible applicatie.
 *
 */
public class ScribleApplication extends Application {

	@Override
	public Document createDocument(Application app) {
		return new ScribleDocument(app);
	}

	@Override
	public View createView(Application app, Document doc) {
		return new ScribleView(app, doc);
	}

}
