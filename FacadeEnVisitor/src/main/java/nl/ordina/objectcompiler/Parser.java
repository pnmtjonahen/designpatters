package nl.tjonahen.objectcompiler;
/*
 * Parser maak een parse tree aan die de input representeerd.
 *
 * begin
 * a = 1
 * print a
 * return a
 * end
 */
public class Parser {
	public void parse(Scanner scanner, ProgramNodeBuilder builder) {

		Token t = scanner.scan();

		while (t != null) {
			if ("begin".equals(t.value())) {
				builder.newApplicationProgramNode();
			}
			if ("print".equals(t.value())) {
				builder.newStatementProgramNode(t.value());
			}

			t = scanner.scan();
		}

	}
}
