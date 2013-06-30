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

import nl.tjonahen.rekenaar.command.Command;
import nl.tjonahen.rekenaar.command.Push;

public class Num {

    public String parse(final String str, final List<Command> script) throws ParseException {
        final String tmpstr = str.trim();
        if ("".equals(tmpstr)) {
            return tmpstr;
        }

        final String nummer = tmpstr.substring(0, tmpstr.indexOf(' '));

        Double d;
        try {
            d = Double.parseDouble(nummer.trim());
        } catch (NumberFormatException nfe) {
            System.err.println("Parse error " + nummer);
            throw new ParseException();
        }

        script.add(new Push(d));

        return tmpstr.substring(tmpstr.indexOf(' ') + 1);

    }
}
