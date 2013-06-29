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
package nl.tjonahen.car.part;

import nl.tjonahen.Machine;

public class CarBuilder implements Machine {

    private Car car;

    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
    }

    @Override
    public void buildEngine() {
        // TODO Auto-generated method stub
    }

    @Override
    public void buildFrame() {
        // TODO Auto-generated method stub
    }

    @Override
    public void buildWheels() {
        // TODO Auto-generated method stub
    }

    public Car getCar() {
        return car;
    }
}
