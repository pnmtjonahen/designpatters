package nl.tjonahen.objectcompiler;

abstract public class ProgramNode {
	protected ProgramNode() {}

	abstract public void getSourcePosition(int line, int index);
	abstract public void add(ProgramNode node);
	abstract public void remove(ProgramNode node);
	abstract public void traverse(CodeGenerator codeGenerator);

}
