package nl.tjonahen.lombokbuilder.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdressTest {
  @Test
  public void testBuilder() {
    final Adress adress =
        Adress.builder()
            .city(City.builder().name("Tiel").zipCode("4003 GB").build())
            .street(Street.builder().name("Hofstad").number(1).build())
            .build();

    assertEquals("Tiel", adress.getCity().getName());
  }
}
