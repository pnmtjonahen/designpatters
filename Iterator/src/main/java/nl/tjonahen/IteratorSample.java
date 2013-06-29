package nl.tjonahen;

import java.util.Iterator;
import java.util.List;

public class IteratorSample {


	public void access(List<E> list) {
		Iterator<E> it = list.iterator();

		while (it.hasNext()) {
			E e = it.next();
			doeIetsMetE(e);
		}
	}

	private void doeIetsMetE(E e) {
		// TODO Auto-generated method stub

	}

}
