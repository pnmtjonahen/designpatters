package nl.tjonahen.composite;

import java.util.ArrayList;
import java.util.List;

import nl.tjonahen.Visitor;

public class Branch {
	private List<Branch> branches = new ArrayList<Branch>();
	
	private List<Flower> flowers = new ArrayList<Flower>();
	
	private List<Leaf> leafs = new ArrayList<Leaf>();

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public List<Leaf> getLeafs() {
		return leafs;
	}

	public void setLeafs(List<Leaf> leafs) {
		this.leafs = leafs;
	}

	public void accept(Visitor v) {
		v.visit(this);
		
		for (Branch b: branches) {
			b.accept(v);
		}
		
		for (Flower f : flowers) {
			f.accept(v);
		}
		
		for (Leaf f : leafs) {
			f.accept(v);
		}
		
	}
	
	
}
