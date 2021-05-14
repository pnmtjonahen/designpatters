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

public class Term {

  private final Num num = new Num();
  private final Operation op = new Operation();

  public String parse(final String str, final List<Command> script) throws ParseException {
    String tmpstr = str;
    if ("".equals(tmpstr)) {
      return tmpstr;
    }

    tmpstr = num.parse(tmpstr, script);
    tmpstr = op.parse(tmpstr, script);

    return parse(tmpstr, script);
  }
}
