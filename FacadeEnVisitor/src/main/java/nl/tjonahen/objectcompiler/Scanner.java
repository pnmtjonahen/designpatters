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
      if (t == -1) {
        return null;
      }

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
