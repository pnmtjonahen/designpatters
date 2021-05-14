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

import java.util.ArrayList;
import java.util.List;

public class Document {

  private String text = "";
  private List<Observer> observers = new ArrayList<>();

  private void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }

  public void addObserver(Observer o) {
    observers.add(o);
  }

  public void append(String text) {
    this.text += text;
    // voer wijzigingen op het document door
    notifyObservers();
  }

  public String getText() {
    return text;
  }
}
