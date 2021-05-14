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
import nl.tjonahen.rekenaar.command.Addition;
import nl.tjonahen.rekenaar.command.Command;
import nl.tjonahen.rekenaar.command.Dvivider;
import nl.tjonahen.rekenaar.command.Multiplier;
import nl.tjonahen.rekenaar.command.Substractor;

public class Operation {

  public String parse(final String str, final List<Command> script) throws ParseException {
    if ("".equals(str)) {
      return str;
    }
    final char token = str.charAt(0);

    switch (token) {
      case '+':
        script.add(new Addition());
        break;
      case '-':
        script.add(new Substractor());
        break;
      case '/':
        script.add(new Dvivider());
        break;
      case '*':
        script.add(new Multiplier());
        break;
      default:
        throw new ParseException();
    }
    return str.substring(1);
  }
}
