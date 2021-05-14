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

public class OKCancelWidget extends Widget {

  public OKCancelWidget(int x, int y, String text) {
    super(x, y, 100, 50);

    BoxWidget bw = new BoxWidget(x, y, 100, 50);

    bw.add(new TextWidget(x + 25, y + 25, text));
    bw.add(new ButtonWidget(x + 25, y + 50, 50, 25, "OK"));
    bw.add(new ButtonWidget(x + 55, y + 50, 50, 25, "Cancel"));
    add(bw);
  }

  @Override
  public void draw() {
    System.out.println("<okcancel");
    super.draw();
    System.out.println("</okcancel>");
  }
}
