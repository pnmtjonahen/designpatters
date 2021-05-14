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
package nl.tjonahen.widgets;

/** Een box bestaat uit 4 lines */
public class BoxWidget extends Widget {

  public BoxWidget(int x, int y, int width, int height) {
    super(x, y, width, height);

    // construct the lines

    add(new LineWidget(x, y, x, y + width));
    add(new LineWidget(x, y, x + height, y));
    add(new LineWidget(x + height, y, x + height, y + width));
    add(new LineWidget(x, y + width, x + height, y + width));
  }

  @Override
  public void draw() {
    System.out.println("<box>");
    super.draw();
    System.out.println("</box>");
  }
}
