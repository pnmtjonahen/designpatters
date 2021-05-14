package nl.tjonahen.prototype.elements;

import java.util.ArrayList;
import java.util.List;

public class Body {

  private List<Paragraaf> paragrafen = new ArrayList<Paragraaf>();

  public Object clone() throws CloneNotSupportedException {
    List<Paragraaf> np = new ArrayList<Paragraaf>();
    for (Paragraaf paragraaf : paragrafen) {
      np.add((Paragraaf) paragraaf.clone());
    }
    Body b = new Body();
    b.setParagrafen(np);
    return b;
  }

  public List<Paragraaf> getParagrafen() {
    return paragrafen;
  }

  public void setParagrafen(List<Paragraaf> paragrafen) {
    this.paragrafen = paragrafen;
  }

  public void print() {
    for (Paragraaf p : paragrafen) {
      p.print();
    }
  }
}
