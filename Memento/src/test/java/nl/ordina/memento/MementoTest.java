package nl.tjonahen.memento;

import java.util.ArrayList;

import org.junit.Test;


public class MementoTest {

	@Test
	public void testMementoRollBack() {
		Originator o = new Originator();
		ArrayList<IMementoStoreable> m = new ArrayList<IMementoStoreable>();

		m.add(o.createMemento());//Checkpoint 0

		o.IBM1();
		o.IBM2();
		m.add(o.createMemento());//Checkpoint 1
		System.out.println(o.IBM2());

		o.IBM1();
		o.IBM1();
		o.IBM2();
		m.add(o.createMemento());//Checkpoint 2
		System.out.println(o.IBM2());

		o.setMemento(m.get(1));
		System.out.println(o.IBM2());
		o.IBM2();
		System.out.println(o.IBM2());







	}
}
