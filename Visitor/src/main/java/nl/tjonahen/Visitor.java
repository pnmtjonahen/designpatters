package nl.tjonahen;

import nl.tjonahen.composite.Branch;
import nl.tjonahen.composite.Flower;
import nl.tjonahen.composite.Leaf;
import nl.tjonahen.composite.Tree;

public interface Visitor {

	void visit(Leaf leaf);

	void visit(Branch branch);

	void visit(Flower flower);

	void visit(Tree tree);

}
