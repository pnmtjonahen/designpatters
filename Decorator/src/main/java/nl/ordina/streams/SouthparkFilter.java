package nl.tjonahen.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SouthparkFilter extends FilterInputStream {

	public SouthparkFilter(InputStream in) {
		super(in);
	}
	private Kenny kenny = new Kenny();

	@Override
	public int read(byte[] b, int off, int len) throws IOException {

		int k = super.read(b, off, len);
		String kennySpeak = kenny.toKenny(new String(b, 0, k));
		int maxs = kennySpeak.length();
		byte[] kb = kennySpeak.getBytes();
		for (int i = 0; i < maxs; i++) {
			b[i] = kb[i];
		}
		return kb.length;
	}

}
