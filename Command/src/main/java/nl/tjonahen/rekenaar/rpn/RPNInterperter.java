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

import java.util.ArrayList;
import java.util.List;

import nl.tjonahen.rekenaar.command.ICommand;

public class RPNInterperter {
    // operator := '+'|'-'|'/'|'*'
    // NUM := ^[0-9]*.[0-9]            => double
    // term : NUM operator
    // StartNum ( term )*;

    public List<ICommand> parse(String script) throws ParseException {
        List<ICommand> list = new ArrayList<ICommand>();
        StartNum sn = new StartNum();
        sn.parse(script, list);
        return list;
    }
}
