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
package nl.tjonahen;

/**
 * Director classe in het builder pattern. Deze stuurt de builder aan in een bepaalde volgorde om te builden.
 *
 */
public class Aannemer {

    private final GebouwenBuilder builder;

    public Aannemer(final GebouwenBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildGebouw();
        builder.buildKamer(0, 1);
        builder.buildKamer(0, 2);
        builder.buildKamer(0, 3);
        builder.buildKamer(0, 4);

        builder.buildVerdieping(1);
        builder.buildTrap(0, 1);
        builder.buildKamer(1, 5);
        builder.buildKamer(1, 6);
        builder.buildKamer(1, 7);
        builder.buildKamer(1, 8);

        builder.buildVerdieping(2);
        builder.buildTrap(1, 2);
        builder.buildKamer(2, 10);
        builder.buildKamer(2, 11);
        builder.buildKamer(2, 12);
        builder.buildKamer(2, 13);

        builder.buildVerdieping(3);
        builder.buildKamer(3, 14);
        builder.buildKamer(3, 15);
        builder.buildKamer(3, 16);
        builder.buildKamer(3, 17);

    }

    public IGebouw createGebouw(final GebouwenBuilder builder) {
        builder.buildGebouw();
        builder.buildKamer(0, 1);
        builder.buildKamer(0, 2);
        builder.buildKamer(0, 3);
        builder.buildKamer(0, 4);

        return builder.getGebouw();
    }
}
