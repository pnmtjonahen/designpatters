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
package nl.tjonahen.rekenaar.command;

import java.util.ArrayList;
import java.util.List;
import nl.tjonahen.rekenaar.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void plusTest() {
        final Calculator r = new Calculator();


        final List<Command> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, +
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Addition());
        final Pop pop = new Pop();
        script.add(pop);
        r.execute(script);

        assertEquals(20.0, pop.getValue().doubleValue(), 0.0);
    }

    @Test
    public void minTest() {
        final Calculator r = new Calculator();


        final List<Command> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, -
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Substractor());
        final Pop pop = new Pop();
        script.add(pop);
        r.execute(script);
        assertEquals(0.0, pop.getValue().doubleValue(), 0.0);
    }

    @Test
    public void maalTest() {
        final Calculator r = new Calculator();


        final List<Command> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, *
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Multiplier());
        final Pop pop = new Pop();
        script.add(pop);
        r.execute(script);
        assertEquals(100.0, pop.getValue().doubleValue(), 0.0);

    }

    @Test
    public void deelTest() {
        final Calculator r = new Calculator();


        final List<Command> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, /
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Dvivider());
        final Pop pop = new Pop();
        script.add(pop);
        r.execute(script);
        assertEquals(1.0, pop.getValue().doubleValue(), 0.0);

    }
}
