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

import nl.tjonahen.builders.BungalowBuilder;
import nl.tjonahen.builders.BunkerBuilder;
import nl.tjonahen.builders.FlatBuilder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Client deel van het builder pattern.
 *
 *
 */
public class GebouwenBuilderTest {

    @Test
    public void testFlatGebouw() {
        /*
         * Client creeert een Aannemer (director) en configureert het met een builder (concrete builder)
         */
        GebouwenBuilder concreteBuilder = new FlatBuilder();

        Aannemer kees = new Aannemer(concreteBuilder);
        kees.construct();

        Assert.assertNotNull(concreteBuilder.getGebouw());

    }

    @Test
    public void testBugalow() {
        GebouwenBuilder concreteBuilder = new BungalowBuilder();

        Aannemer kees = new Aannemer(concreteBuilder);
        kees.construct();

        Assert.assertNotNull(concreteBuilder.getGebouw());
    }

    @Test
    public void testBunker() {
        GebouwenBuilder concreteBuilder = new BunkerBuilder();

        Aannemer kees = new Aannemer(concreteBuilder);
        kees.construct();

        Assert.assertNotNull(concreteBuilder.getGebouw());
    }
}
