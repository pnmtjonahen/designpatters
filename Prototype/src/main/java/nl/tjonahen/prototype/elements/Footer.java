package nl.tjonahen.prototype.elements;

public class Footer {
  private Regel regel = new Regel("");

  public Object clone() throws CloneNotSupportedException {
    Footer f = new Footer();
    f.setRegel((Regel) regel.clone());
    return f;
  }

  public Regel getRegel() {
    return regel;
  }

  public void setRegel(Regel regel) {
    this.regel = regel;
  }

  public void print() {
    System.out.println();
    regel.print();
  }
}
