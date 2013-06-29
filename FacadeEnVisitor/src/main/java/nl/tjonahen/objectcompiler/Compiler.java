package nl.tjonahen.objectcompiler;

import java.io.InputStream;
import java.io.PrintStream;

public class Compiler {

	public void compile(InputStream is, PrintStream os) {
		Scanner scanner = new Scanner(is);

		ProgramNodeBuilder builder = new ProgramNodeBuilder();

		Parser parser = new Parser();
		parser.parse(scanner, builder);

		MyCodeGenerator generator = new MyCodeGenerator(os);
		ProgramNode tree = builder.getRootNode();

		tree.traverse(generator);

	}
}
