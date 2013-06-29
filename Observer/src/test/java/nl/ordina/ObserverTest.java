package nl.tjonahen;

import org.junit.Test;


public class ObserverTest {

	@Test
	public void testDocumentUpdate() {
		Document doc = new Document();

		doc.append("een textje");

		doc.append(" een tweede textje");

	}

	@Test
	public void testDocumentObservers() {
		Document doc = new Document();
		doc.addObserver(new StdErroView());

		doc.append("een textje");
		doc.addObserver(new StdOutView());

		doc.append(" een tweede textje");

	}
}
