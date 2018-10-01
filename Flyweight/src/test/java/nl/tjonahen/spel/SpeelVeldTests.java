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
package nl.tjonahen.spel;

import org.junit.Test;

public class SpeelVeldTests {

    @Test
    public void testFlyweightSpeelveldSetup() {
        KeysFactory kf = new KeysFactory();

        SpeelVeld sp = new SpeelVeld();

        sp.add(kf.getKey('w'))
                .add(kf.getKey('w'))
                .add(kf.getKey('z'))
                .add(kf.getKey('w'))
                .add(kf.getKey('z'));

        System.out.println("Speelveld:" + sp.toString());
    }

    @Test
    public void testNotFlyweightSpeelveldSetup() {

        SpeelVeld sp = new SpeelVeld();
        sp.add(new WhiteKey())
                .add(new WhiteKey())
                .add(new BlackKey())
                .add(new WhiteKey())
                .add(new BlackKey());
        System.out.println("Speelveld:" + sp.toString());
    }
}
