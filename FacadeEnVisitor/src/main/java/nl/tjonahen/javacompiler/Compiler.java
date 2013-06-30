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
package nl.tjonahen.javacompiler;

import java.io.InputStream;
import java.io.PrintStream;

import nl.tjonahen.javacompiler.parser.JavaParser;
import nl.tjonahen.javacompiler.parser.Node;
import nl.tjonahen.javacompiler.parser.ParseException;

/**
 * Facade. De parser/en node tree is gegenereerd met JJTree en JavaCC aan de hand van het VTransformer voorbeeld.
 *
 * @author tjonahen
 *
 */
public class Compiler {

    public void compile(InputStream is, PrintStream os) {
        JavaParser parser = new JavaParser(is);
        try {
            Node node = parser.CompilationUnit();
            node.jjtAccept(new AddAcceptVisitor(os), null);
        } catch (ParseException e) {
            throw new RuntimeException("Parse error", e);
        }
    }
}
