package nl.tjonahen.prototype;

import nl.tjonahen.prototype.elements.Body;
import nl.tjonahen.prototype.elements.Document;
import nl.tjonahen.prototype.elements.Footer;
import nl.tjonahen.prototype.elements.Header;
import nl.tjonahen.prototype.elements.Paragraaf;
import nl.tjonahen.prototype.elements.Regel;

/**
 * Prototype.
 *
 * <p>Standaard brief die als prototype dient voor het maken van briefjes.
 */
public class Brief {

  public void setDoc(Document doc) {
    this.doc = doc;
  }

  public Object clone() throws CloneNotSupportedException {
    Brief b = new Brief();
    b.setDoc((Document) doc.clone());
    return b;
  }

  private Document doc = new Document();

  public Brief() {
    doc.setHeader(new Header());
    doc.getHeader().setRegel(new Regel("tjonahen"));

    doc.setBody(new Body());

    doc.getBody().getParagrafen().add(aanhef());
    doc.getBody().getParagrafen().add(bodytext());
    doc.getBody().getParagrafen().add(groet());

    doc.setFooter(new Footer());
    doc.getFooter().setRegel(new Regel("Copyright 2006"));
  }

  private Paragraaf aanhef() {
    Paragraaf p = new Paragraaf();
    p.getRegels().add(new Regel("Geachte heer,mevrouw"));
    p.getRegels().add(new Regel("Tiel,December 2006"));
    return p;
  }

  private Paragraaf bodytext() {
    Paragraaf p = new Paragraaf();
    p.getRegels().add(new Regel("Dit willen we u even melden"));
    return p;
  }

  private Paragraaf groet() {
    Paragraaf p = new Paragraaf();
    p.getRegels().add(new Regel("Met vriendelijkegroet,"));
    p.getRegels().add(new Regel("Ikke"));
    return p;
  }

  public void print() {
    doc.print();
  }
}
