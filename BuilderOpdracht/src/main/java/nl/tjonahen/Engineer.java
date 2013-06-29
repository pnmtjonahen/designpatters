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
 * Dit is de director uit het pattern boek. De engineer bepaald de logica om middels een Machine iets te fabriceren.
 */
public class Engineer {

    private Machine machine;

    public Engineer(Machine machine) {
        this.machine = machine;
    }

    /**
     * Dit is de business logica.
     */
    public void construct() {
        machine.buildFrame();
        machine.buildWheels();
        machine.buildEngine();
        machine.buildBody();
    }
}