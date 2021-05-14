package nl.tjonahen.lombokbuilder.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
class City {
  private final String zipCode;
  private final String name;
}
