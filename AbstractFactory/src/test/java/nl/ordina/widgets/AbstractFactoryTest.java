package nl.tjonahen.widgets;

import org.junit.Assert;
import org.junit.Test;


public class AbstractFactoryTest {

	@Test
	public void pmTest() {
		IWidgetFactory wf = new nl.tjonahen.widgets.pm.WidgetFactory();

		testWidgetFactory(wf);
	}

	@Test
	public void motifTest() {
		IWidgetFactory wf = new nl.tjonahen.widgets.motif.WidgetFactory();

		testWidgetFactory(wf);
	}

	/**
	 * Dit is de eigenlijke test methode die het gebruik van het pattern weer geeft.
	 * Hoe we aan de factory komen laat het pattern in het midden. Is geen onderdeel van het pattern.
	 * @param wf
	 */
	private void testWidgetFactory(IWidgetFactory wf) {

		Assert.assertNotNull(wf.createWindow());
		Assert.assertNotNull(wf.createScrollBar());

	}

}
