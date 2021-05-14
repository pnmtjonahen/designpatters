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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import nl.tjonahen.javacompiler.Compiler;
import org.junit.jupiter.api.Test;

public class JavaCompilerTest {

  @Test
  public void testMyJavaCompiler() {
    Compiler c = new Compiler();
    InputStream in =
        new ByteArrayInputStream("class Test { private int a; public Test() {} }".getBytes());

    c.compile(in, System.out);
  }
}
