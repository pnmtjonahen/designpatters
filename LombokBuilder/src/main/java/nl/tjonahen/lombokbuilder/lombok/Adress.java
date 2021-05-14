package nl.tjonahen.lombokbuilder.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Adress {
  private final Street street;
  private final City city;
}
