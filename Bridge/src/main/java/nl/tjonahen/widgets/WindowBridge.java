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

public class WindowBridge implements Window {

    private Window impl;

    public void setWidgetType(final WidgetEnum type) {
        switch (type) {
            case MOTIF:
                impl = new nl.tjonahen.widgets.motif.WindowImpl();
                break;
            case PM:
                impl = new nl.tjonahen.widgets.pm.WindowImpl();
                break;
        }

    }

    @Override
    public void draw() {
        if (impl != null) {
            impl.draw();
        }
    }
}
