package nl.tjonahen.prototype.elements;

import java.util.ArrayList;
import java.util.List;

public class Paragraaf {
  private List<Regel> regels = new ArrayList<Regel>();

  public Object clone() throws CloneNotSupportedException {
    List<Regel> nr = new ArrayList<Regel>();
    for (Regel regel : regels) {
      nr.add((Regel) regel.clone());
    }
    Paragraaf p = new Paragraaf();
    p.setRegels(nr);
    return p;
  }

  public List<Regel> getRegels() {
    return regels;
  }

  public void setRegels(List<Regel> regels) {
    this.regels = regels;
  }

  public void print() {
    System.out.println();
    for (Regel regel : regels) {
      regel.print();
    }
    System.out.println();
  }
}
