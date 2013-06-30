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
package nl.tjonahen.base;

import java.util.ArrayList;
import java.util.List;

/**
 * FactoryMethod. Defines interface and let subclassing decide which class to instantiate.
 *
 *
 */
public class Application {

    private final List<Document> docs;
    private Document doc;
    private View view;

    public Application() {
        this.docs = new ArrayList<>();
    }
    /**
     * Application start methode deze start (tussen aanhalings tekens) de applicatie
     *
     */
    public final void start() {
        // Creer een standaard document;
        doc = createDocument(this);
        docs.add(doc);
        view = createView(this, doc);

        view.show();
    }

    public void newDocument() {
        doc = createDocument(this);
        docs.add(doc);
        view = createView(this, doc);

        view.show();
    }

    public void newView() {
        view = createView(this, doc);
        view.show();
    }

    /**
     * Default implementation van een factory method om een document te creeren.
     */
    public Document createDocument(final Application app) {
        return new Document(app);
    }

    /**
     * Default implementatie van een factory method om een view te creeren.
     */
    public View createView(final Application app, final Document doc) {
        return new View(app, doc);
    }
}
