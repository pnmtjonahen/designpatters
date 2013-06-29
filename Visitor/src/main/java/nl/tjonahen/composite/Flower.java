package nl.tjonahen.composite;

import nl.tjonahen.Visitor;

public class Flower {

	public void accept(Visitor v) {
		v.visit(this);
	}

}
