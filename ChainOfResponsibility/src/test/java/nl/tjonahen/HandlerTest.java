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
package nl.tjonahen;

import nl.tjonahen.handlers.AlphaHandler;
import nl.tjonahen.handlers.Handler;
import nl.tjonahen.handlers.NullHandler;
import nl.tjonahen.handlers.NumberHandler;

import org.junit.Test;

public class HandlerTest {

    @Test
    public void testChain() {
        // setup de chain
        final Handler h = new Handler(new NumberHandler(new Handler(new AlphaHandler(new Handler(new NullHandler(null))))));
        
        h.handle("Dit is een string");
        h.handle("#nummer");
        h.handle("@alpha");
    }
}
