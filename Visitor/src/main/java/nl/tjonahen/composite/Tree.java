package nl.tjonahen.composite;

import java.util.ArrayList;
import java.util.List;

import nl.tjonahen.Visitor;

public class Tree {
	List<Branch> branches = new ArrayList<Branch>();

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
		for (Branch b : branches) {
			b.accept(v);
		}
		
	}
}
