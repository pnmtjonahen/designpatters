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

import java.util.ArrayList;
import java.util.List;

public class ApplicationProgramNode extends ProgramNode {

    private List<StatementProgramNode> statements = new ArrayList<>();

    @Override
    public void add(ProgramNode node) {
        statements.add((StatementProgramNode) node);

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
