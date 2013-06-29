package nl.tjonahen.objectcompiler;

import java.io.PrintStream;

abstract public class CodeGenerator {
	protected PrintStream os;

	protected CodeGenerator(PrintStream os) {
		this.os = os;
	}

	abstract public void visit(StatementProgramNode node);
	abstract public void visit(ProgramNode node);
	abstract public void visit(ExpressionNode node);
}
