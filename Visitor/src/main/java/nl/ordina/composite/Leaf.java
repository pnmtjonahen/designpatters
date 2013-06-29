package nl.tjonahen.composite;

import nl.tjonahen.Visitor;

public class Leaf {

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
