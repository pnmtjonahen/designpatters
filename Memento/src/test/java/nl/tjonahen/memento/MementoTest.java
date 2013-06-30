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

import java.util.ArrayList;

import org.junit.Test;

public class MementoTest {

    @Test
    public void testMementoRollBack() {
        Originator o = new Originator();
        ArrayList<MementoStoreable> m = new ArrayList<>();

        m.add(o.createMemento());//Checkpoint 0

        o.IBM1();
        o.IBM2();
        m.add(o.createMemento());//Checkpoint 1
        System.out.println(o.IBM2());

        o.IBM1();
        o.IBM1();
        o.IBM2();
        m.add(o.createMemento());//Checkpoint 2
        System.out.println(o.IBM2());

        o.setMemento(m.get(1));
        System.out.println(o.IBM2());
        o.IBM2();
        System.out.println(o.IBM2());

    }
}
