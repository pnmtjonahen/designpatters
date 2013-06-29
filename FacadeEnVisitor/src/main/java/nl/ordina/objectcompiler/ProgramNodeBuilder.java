package nl.tjonahen.objectcompiler;

public class ProgramNodeBuilder {

	public ProgramNodeBuilder() {

	}

	public ProgramNode newVariable(String variabeleName) {
		return new VariableProgramNode(variabeleName);
	}
	public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
		return new AssigmentProgramNode(variable, expression);

	}
	public ProgramNode newReturnStatement(ProgramNode value) {
		return new ReturnStatementProgramNode(value);

	}
	public ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
		return new ConditionProgramNode(condition, truePart, falsePart);
	}

	public ProgramNode newStatementProgramNode(String statement) {
		return updateNodes(new StatementProgramNode(statement));
	}

	private ProgramNode updateNodes(ProgramNode p) {
		if (node == null) {
			node = p;
		} else {
			node.add(p);
		}
		return p;
	}

	private ProgramNode node;
	public ProgramNode getRootNode() {
		return node;
	}

	public ProgramNode newApplicationProgramNode() {
		return updateNodes(new ApplicationProgramNode());
	}


}
