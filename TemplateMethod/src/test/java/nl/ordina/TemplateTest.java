package nl.tjonahen;

import nl.tjonahen.template.ConcreteProcess;
import nl.tjonahen.template.PreProcess;
import nl.tjonahen.template.ProcessTemplate;

import org.junit.Test;


public class TemplateTest {

	@Test
	public void testConcreteTemplate() {
		ProcessTemplate pt = new ConcreteProcess();

		pt.templateMethod();
	}
	@Test
	public void testenPreProcess() {
		ProcessTemplate pt = new PreProcess();

		pt.templateMethod();
	}
}
