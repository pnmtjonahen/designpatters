/*
 * Copyright (C) 2013 Philippe Tjon-A-Hen philippe@tjonahen.nl
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package nl.tjonahen.objectcompiler;

public class ProgramNodeBuilder {

  public ProgramNodeBuilder() {}

  public ProgramNode newVariable(String variabeleName) {
    return new VariableProgramNode(variabeleName);
  }

  public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
    return new AssigmentProgramNode(variable, expression);
  }

  public ProgramNode newReturnStatement(ProgramNode value) {
    return new ReturnStatementProgramNode(value);
  }

  public ProgramNode newCondition(
      ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
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
