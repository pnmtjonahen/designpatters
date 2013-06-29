package nl.tjonahen.objectcompiler;

import java.io.IOException;
import java.io.InputStream;

public class Scanner {
	private InputStream inputStream;

	public Scanner(InputStream is) {
		inputStream = is;
	}

	public Token scan() {
		try {
			int t = inputStream.read();
			if (t == -1)
				return null;

			String str = "";
			while (t != ' ' && t != -1) {
				str += (char) t;
				t = inputStream.read();
			}
			return new Token(str);
		} catch (IOException e) {
			throw new RuntimeException("Fout tijdens het scannen naar tokens.");
		}
	}
}
