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
