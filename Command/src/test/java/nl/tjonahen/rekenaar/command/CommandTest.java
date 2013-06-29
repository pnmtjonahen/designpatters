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

import nl.tjonahen.rekenaar.Rekenaar;

import org.junit.Test;

public class CommandTest {

    @Test
    public void plusTest() {
        Rekenaar r = new Rekenaar();


        List<ICommand> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, +
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Plus());
        script.add(new Pop());
        r.execute(script);
    }

    @Test
    public void minTest() {
        Rekenaar r = new Rekenaar();


        List<ICommand> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, +
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Min());
        script.add(new Pop());
        r.execute(script);
    }

    @Test
    public void maalTest() {
        Rekenaar r = new Rekenaar();


        List<ICommand> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, +
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Maal());
        script.add(new Pop());
        r.execute(script);
    }

    @Test
    public void deelTest() {
        Rekenaar r = new Rekenaar();


        List<ICommand> script = new ArrayList<>();
// RPN Reverse Polish Notation
// 10, 10, +
        script.add(new Push(new Double(10)));
        script.add(new Push(new Double(10)));
        script.add(new Deel());
        script.add(new Pop());
        r.execute(script);
    }
}
