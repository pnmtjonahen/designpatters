package nl.tjonahen.javacompiler;

import java.io.InputStream;
import java.io.PrintStream;

import nl.tjonahen.javacompiler.parser.JavaParser;
import nl.tjonahen.javacompiler.parser.Node;
import nl.tjonahen.javacompiler.parser.ParseException;

/**
 * Facade.
 * De parser/en node tree is gegenereerd met JJTree en JavaCC aan de hand van het VTransformer voorbeeld.
 * @author tjonahen
 *
 */
public class Compiler {
	public void compile(InputStream is, PrintStream os) {
		JavaParser parser = new JavaParser(is);
		try {
			Node node = parser.CompilationUnit();
			node.jjtAccept(new AddAcceptVisitor(os),null);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("Parse error");
		}
	}
}
