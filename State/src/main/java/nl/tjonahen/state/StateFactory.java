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
package nl.tjonahen.state;

/**
 * Factory to create different states
 *
 * @author Philippe Tjon-A-Hen philippe@tjonahen.nl
 */
public class StateFactory {

    public enum DoorStates {

        OPEN, OPENING, CLOSED, CLOSING
    };
    private DoorState open = new OpenState();
    private DoorState closed = new ClosedState();
    private DoorState closing = new ClosingState();
    private DoorState opening = new OpeningState();

    private StateFactory() {
    }

    public DoorState getState(final DoorStates state) {
        switch (state) {
            case OPEN:
                return open;
            case CLOSED:
                return closed;
            case OPENING:
                return opening;
            case CLOSING:
                return closing;
        }
        return null;
    }
    private static StateFactory instance = null;

    public static final synchronized StateFactory instance() {
        if (instance == null) {
            instance = new StateFactory();
        }
        return instance;

    }
}
