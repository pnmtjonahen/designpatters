package nl.tjonahen.objectcompiler;

import java.io.PrintStream;

public class MyCodeGenerator extends CodeGenerator {
	protected MyCodeGenerator(PrintStream os) {
		super(os);
	}

	@Override
	public void visit(StatementProgramNode node) {
		if ("print".equals(node.getStatement())) {
			os.println("System.out.println");

		}

	}

	@Override
	public void visit(ExpressionNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ProgramNode node) {
		os.println("Start van procedure.");

	}

}
