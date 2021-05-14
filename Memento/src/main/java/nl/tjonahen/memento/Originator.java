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
package nl.tjonahen.memento;

/** Originator. de state van de originator is alleen attrib, Zie ook State. */
public class Originator {

  private int attrib;
  private String text;

  public MementoStoreable createMemento() {
    return new Memento(new State(this));
  }

  public void setMemento(MementoStoreable memento) {
    if (memento instanceof Memento) {
      ((Memento) memento).getState().update(this);
    }
  }

  /** Interesting Business Method nummer 1 */
  public void IBM1() {
    attrib++;
  }

  public String IBM2() {
    text = "aantal IBM1's =" + attrib;
    return text;
  }

  public int getAttrib() {
    return attrib;
  }

  public void setAttrib(int attrib) {
    this.attrib = attrib;
  }
}
