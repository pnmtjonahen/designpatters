package nl.tjonahen.prototype.elements;

public class Regel {
  private String text;

  public Regel(String text) {
    this.text = text;
  }

  public Object clone() throws CloneNotSupportedException {
    return new Regel(text);
  }

  public void print() {
    System.out.println(text);
  }
}
