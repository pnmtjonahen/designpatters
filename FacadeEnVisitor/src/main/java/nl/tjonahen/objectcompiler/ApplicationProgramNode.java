package nl.tjonahen.objectcompiler;

import java.util.ArrayList;
import java.util.List;

public class ApplicationProgramNode extends ProgramNode {
	private List<StatementProgramNode> statements = new ArrayList<StatementProgramNode>();
	@Override
	public void add(ProgramNode node) {
		statements.add((StatementProgramNode)node);

	}

	@Override
	public void getSourcePosition(int line, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(ProgramNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverse(CodeGenerator codeGenerator) {
		codeGenerator.visit(this);

		for (StatementProgramNode pn : statements) {
			codeGenerator.visit(pn);

		}
	}

}
