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
package nl.tjonahen.application;

import nl.tjonahen.Engineer;
import nl.tjonahen.car.part.Car;
import nl.tjonahen.car.part.CarBuilder;
import nl.tjonahen.plane.part.Plane;
import nl.tjonahen.plane.part.PlaneBuilder;

public class BuilderApplicatie {

  /** @param args */
  public static void main(String[] args) {

    if ("car".equals(args[0])) {
      CarBuilder carBuilder = new CarBuilder();

      Engineer engineer = new Engineer(carBuilder);
      engineer.construct();

      Car car = carBuilder.getCar();
      car.toString();
    }
    if ("plane".equals(args[0])) {
      PlaneBuilder planeBuilder = new PlaneBuilder();

      Engineer engineer = new Engineer(planeBuilder);
      engineer.construct();

      Plane plane = planeBuilder.getPlane();
      plane.toString();
    }
  }
}
