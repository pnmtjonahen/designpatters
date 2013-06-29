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
package nl.tjonahen.flat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import nl.tjonahen.IGebouw;

/**
 * Flat gebouw bestaat uit.
 *
 * Verdiepingen met kamers en een trap omhoog en of en trap omlaag.
 *
 */
public class FlatGebouw implements IGebouw {

    private final Map<Integer, Verdieping> verdiepingen;
    private final Set<Trap> trappenhuis;

    public FlatGebouw() {
        this.verdiepingen = new HashMap<>();
        this.trappenhuis = new HashSet<>();
    }

    
    
    public Map<Integer, Verdieping> getVerdiepingen() {
        return verdiepingen;
    }

    public Set<Trap> getTrappenhuis() {
        return trappenhuis;
    }
}
