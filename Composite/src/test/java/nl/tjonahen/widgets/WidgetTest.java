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

import org.junit.jupiter.api.Test;



public class WidgetTest {

    @Test
    public void drawOKCancelWidgetsTest() {
        OKCancelWidget ok = new OKCancelWidget(10, 10, "En werkt het?");

        ok.draw();
    }

    @Test
    public void drawBoxWidget() {
        BoxWidget b = new BoxWidget(12, 33, 100, 200);

        b.draw();
    }
}
