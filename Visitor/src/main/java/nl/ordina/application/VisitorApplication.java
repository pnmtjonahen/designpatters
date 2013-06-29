package nl.tjonahen.application;

import nl.tjonahen.Visitor;
import nl.tjonahen.composite.Branch;
import nl.tjonahen.composite.Flower;
import nl.tjonahen.composite.Leaf;
import nl.tjonahen.composite.Tree;

public class VisitorApplication {

	public static void main(String[] args) {
		Tree t =  buildTree();
		Visitor v = null;
		t.accept(v);
	}

	private static Tree buildTree() {
		Tree t = new Tree();
		Branch b = new Branch();
		b.getFlowers().add(new Flower());
		
		t.getBranches().add(b);
		
		b = new Branch();
		b.getFlowers().add(new Flower());
		b.getLeafs().add(new Leaf());
		t.getBranches().add(b);
		
		
		return t;
	}
}
