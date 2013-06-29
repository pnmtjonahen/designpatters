package nl.tjonahen.objectcompiler;

public class Token {
	private String b;

	public Token(String b) {
		this.b = b;
	}

	public String value() {
		return b;
	}
}
