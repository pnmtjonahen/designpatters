package nl.tjonahen.objectcompiler;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.junit.Test;


public class CompilerTest {

	@Test
	public void testCompiler() {
		Compiler c = new Compiler();

		InputStream in = new StringBufferInputStream("begin print ditte");

		c.compile(in, System.out);
	}
}
