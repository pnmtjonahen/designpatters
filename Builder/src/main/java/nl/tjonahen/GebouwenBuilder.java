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
 * Builder. Deze abstracte classe bepaald war er gebouwd kan worden. Hoe dit gebouwd word en of er
 * iets gebouwd wordt is afhankelijk van de concrete builder classe.
 */
public abstract class GebouwenBuilder {

  protected Gebouw gebouw;

  public final Gebouw getGebouw() {
    return gebouw;
  }

  public void buildGebouw() {}

  public void buildVerdieping(int verdieping) {}

  public void buildKamer(int opVerdieping, int kamer) {}

  public void buildTrap(int vanVerdieping, int naarVerdieping) {}
}
