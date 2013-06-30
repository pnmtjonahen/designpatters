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
package nl.tjonahen.spel;

/**
 * Flyweight. Belangrijk is dat er een pool van mogelijke objecten is. Die dus afhankelijk van hun gebruik, positie etc
 * betekenis hebben
 *
 */
public class KeysFactory {

    private Key wit = new WhiteKey();
    private Key zwart = new BlackKey();

    public Key getKey(final char type) {
        switch (type) {
            case 'z':
                return zwart;
            case 'w':
                return wit;
            default:
                throw new RuntimeException();

        }
    }
}
