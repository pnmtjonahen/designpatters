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
 */package nl.tjonahen.builders;

import nl.tjonahen.GebouwenBuilder;
import nl.tjonahen.flat.FlatGebouw;
import nl.tjonahen.flat.Kamer;
import nl.tjonahen.flat.Trap;
import nl.tjonahen.flat.Verdieping;

public class FlatBuilder extends GebouwenBuilder {

    @Override
    public void buildGebouw() {
        gebouw = new FlatGebouw();
        buildVerdieping(0); // begane grond
    }

    @Override
    public void buildKamer(int opVerdieping, int kamer) {
        ((FlatGebouw) gebouw).getVerdiepingen().get(new Integer(opVerdieping)).getKamers().put(new Integer(kamer), new Kamer());
    }

    @Override
    public void buildTrap(int vanVerdieping, int naarVerdieping) {
        Verdieping onder = ((FlatGebouw) gebouw).getVerdiepingen().get(new Integer(vanVerdieping));
        Verdieping boven = ((FlatGebouw) gebouw).getVerdiepingen().get(new Integer(naarVerdieping));
        Trap trap = new Trap(onder, boven);
        onder.setTrapOmhoog(trap);
        boven.setTrapOmlaag(trap);
        ((FlatGebouw) gebouw).getTrappenhuis().add(trap);
    }
    @Override
    public void buildVerdieping(int verdieping) {
        ((FlatGebouw) gebouw).getVerdiepingen().put(new Integer(verdieping), new Verdieping());
    }
}
