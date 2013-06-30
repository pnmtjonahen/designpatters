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
package nl.tjonahen.mediator;

/**
 * Mediator.
 *
 * Definieert de mediator methode die door colleagues kunnen worden aangeroepen.
 *
 * De implementatie is niet echt duidelijk omdat de verschillende colleaques eigenlijk zoveel onafhankelijk moeten
 * kunnen werken De voorbeelden in het boek over een fontdialoog zijn denk ik dan ook duidelijker
 *
 *
 */
public interface Mediator {
    // A method

    public void performAMethod();
    // a Interesting Business Method

    public void performIBM();
}
