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
package nl.tjonahen.rekenaar.rpn;

import java.util.List;

import nl.tjonahen.rekenaar.command.ICommand;
import nl.tjonahen.rekenaar.command.Push;

public class Num {

    public String parse(String str, List<ICommand> script) throws ParseException {
        str = str.trim();
        if ("".equals(str)) {
            return str;
        }

        String nummer = str.substring(0, str.indexOf(' '));

        Double d;
        try {
            d = Double.parseDouble(nummer.trim());
        } catch (NumberFormatException nfe) {
            System.err.println("Parse error " + nummer);
            throw new ParseException();
        }

        script.add(new Push(d));

        return str.substring(str.indexOf(' ') + 1);

    }
}
