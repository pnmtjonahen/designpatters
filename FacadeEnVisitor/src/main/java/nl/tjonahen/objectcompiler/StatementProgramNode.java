package nl.tjonahen.objectcompiler;

public class StatementProgramNode extends ProgramNode{
	private String statement;
	public StatementProgramNode(String statement) {
		this.statement = statement;
	}

	@Override
	public void add(ProgramNode node) {
		// TODO Auto-generated method stub

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
	}

	public String getStatement() {
		return statement;
	}

}
