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

public class Term {

    private final Num num = new Num();
    private final Operation op = new Operation();

    public String parse(String str, List<ICommand> script) throws ParseException {
        if ("".equals(str)) {
            return str;
        }


        str = num.parse(str, script);
        str = op.parse(str, script);

        return parse(str, script);

    }
}
