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
package nl.tjonahen.widgets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test different AbstractFactory implementations.
 *
 * @author Philippe Tjon-A-Hen philippe@tjonahen.nl
 */
public class AbstractFactoryTest {

    @Test
    public void pmTest() {
        final WidgetFactory widgetFactory = new nl.tjonahen.widgets.pm.WidgetFactoryImpl();
        testWidgetFactory(widgetFactory);
    }

    @Test
    public void motifTest() {
        final WidgetFactory widgetFactory = new nl.tjonahen.widgets.motif.WidgetFactoryImpl();
        testWidgetFactory(widgetFactory);
    }

    /**
     * This is the actual test code using the AbstractFactory. How we get the concrete implementation is not part of the
     * pattern.
     *
     * @param widgetFactory -
     */
    private void testWidgetFactory(final WidgetFactory widgetFactory) {

        Assert.assertNotNull(widgetFactory.createWindow());
        Assert.assertNotNull(widgetFactory.createScrollBar());

    }
}
