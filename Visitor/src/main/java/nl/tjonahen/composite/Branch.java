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
package nl.tjonahen.composite;

import java.util.ArrayList;
import java.util.List;
import nl.tjonahen.Visitor;

public class Branch {

  private List<Branch> branches = new ArrayList<>();
  private List<Flower> flowers = new ArrayList<>();
  private List<Leaf> leafs = new ArrayList<>();

  public List<Branch> getBranches() {
    return branches;
  }

  public void setBranches(List<Branch> branches) {
    this.branches = branches;
  }

  public List<Flower> getFlowers() {
    return flowers;
  }

  public void setFlowers(List<Flower> flowers) {
    this.flowers = flowers;
  }

  public List<Leaf> getLeafs() {
    return leafs;
  }

  public void setLeafs(List<Leaf> leafs) {
    this.leafs = leafs;
  }

  public void accept(Visitor v) {
    v.visit(this);

    for (Branch b : branches) {
      b.accept(v);
    }

    for (Flower f : flowers) {
      f.accept(v);
    }

    for (Leaf f : leafs) {
      f.accept(v);
    }
  }
}
