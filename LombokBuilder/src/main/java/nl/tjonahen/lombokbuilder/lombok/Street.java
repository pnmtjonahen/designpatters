package nl.tjonahen.lombokbuilder.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Street {
  private final String name;
  private final int number;
  private final String addition;
}
