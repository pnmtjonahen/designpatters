package nl.tjonahen;

import nl.tjonahen.prototype.Brief;
import org.junit.jupiter.api.Test;

public class BriefTest {

  @Test
  public void testBriefClone() throws CloneNotSupportedException {
    Brief b = new Brief();
    b.print();

    Brief b2 = (Brief) b.clone();

    b2.print();
  }
}
