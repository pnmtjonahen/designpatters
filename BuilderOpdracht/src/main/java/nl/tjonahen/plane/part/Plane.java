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
package nl.tjonahen.plane.part;

public class Plane {

  private Fuselage fuselage;
  private Ski[] ski = new Ski[2];
  private JetEngine jetEngine;
  private Body body;
  private Wing[] wings = new Wing[2];
  private Tail tail;

  public Fuselage getFuselage() {
    return fuselage;
  }

  public void setFuselage(Fuselage fuselage) {
    this.fuselage = fuselage;
  }

  public Ski[] getSki() {
    return ski;
  }

  public void setSki(Ski[] ski) {
    this.ski = ski;
  }

  public JetEngine getJetEngine() {
    return jetEngine;
  }

  public void setJetEngine(JetEngine jetEngine) {
    this.jetEngine = jetEngine;
  }

  public Body getBody() {
    return body;
  }

  public void setBody(Body body) {
    this.body = body;
  }

  public Wing[] getWings() {
    return wings;
  }

  public void setWings(Wing[] wings) {
    this.wings = wings;
  }

  public Tail getTail() {
    return tail;
  }

  public void setTail(Tail tail) {
    this.tail = tail;
  }
}
