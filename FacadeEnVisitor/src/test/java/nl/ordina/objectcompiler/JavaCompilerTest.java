package nl.tjonahen.objectcompiler;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import nl.tjonahen.javacompiler.Compiler;

import org.junit.Test;


public class JavaCompilerTest {
	@Test
	public void testMyJavaCompiler() {
		Compiler c = new Compiler();
		InputStream in = new StringBufferInputStream("class Test { private int a; public Test() {} }");

		c.compile(in, System.out);

	}

}
