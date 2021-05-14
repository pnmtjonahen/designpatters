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
package nl.tjonahen.application;

import nl.tjonahen.widgets.ScrollBar;
import nl.tjonahen.widgets.WidgetFactory;
import nl.tjonahen.widgets.Window;

/** Application that uses a AbstractFactory to create widgets. */
public class WidgetApplication {

  public static void main(String[] args) {
    final WidgetFactory widgetFactory = determineWidgetFactory(args);
    final WidgetApplication widgetApplication = new WidgetApplication(widgetFactory);
    widgetApplication.startApplication();
  }

  private final WidgetFactory widgetFactory;

  /**
   * Constructor.
   *
   * @param widgetFactory -
   */
  WidgetApplication(final WidgetFactory widgetFactory) {
    this.widgetFactory = widgetFactory;
  }

  /** simulate the start of an application. */
  void startApplication() {

    final Window window = widgetFactory.createWindow();
    window.draw();

    final ScrollBar scrollBar = widgetFactory.createScrollBar();
    scrollBar.draw();
  }

  private static WidgetFactory determineWidgetFactory(String[] args) {
    // TODO: Implement construction of the correct WidgetFactory.
    return null;
  }
}
