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

import java.util.List;

import nl.tjonahen.rekenaar.rpn.ParseException;
import nl.tjonahen.rekenaar.rpn.RPNInterperter;

public class ScriptFactory {

    private RPNInterperter rpn = new RPNInterperter();
    private static ScriptFactory instance = null;

    synchronized public static ScriptFactory instance() {
        if (instance == null) {
            instance = new ScriptFactory();
        }
        return instance;

    }

    public List<ICommand> create(String script) throws ParseException {
        return rpn.parse(script);
    }
}
