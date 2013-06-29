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



import nl.tjonahen.rekenaar.command.Deel;
import nl.tjonahen.rekenaar.command.ICommand;
import nl.tjonahen.rekenaar.command.Maal;
import nl.tjonahen.rekenaar.command.Min;
import nl.tjonahen.rekenaar.command.Plus;

public class Operation {

    public String parse(String str, List<ICommand> script) throws ParseException {
        if ("".equals(str)) {
            return str;
        }
        char token = str.charAt(0);


        switch (token) {
            case '+':
                script.add(new Plus());
                break;
            case '-':
                script.add(new Min());
                break;
            case '/':
                script.add(new Deel());
                break;
            case '*':
                script.add(new Maal());
                break;
            default:
                throw new ParseException();
        }
        return str.substring(1);
    }
}
