package nl.tjonahen.lombokbuilder.own;

public class City {
  private final String zipCode;
  private final String name;

  private City(final String zipCode, final String name) {
    this.zipCode = zipCode;
    this.name = name;
  }

  public static class Builder {
    private String zipCode;
    private String name;

    private Builder() {}

    public Builder name(final String name) {
      this.name = name;
      return this;
    }

    public Builder zipCode(final String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    public City build() {
      return new City(zipCode, name);
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getZipCode() {
    return zipCode;
  }

  public String getName() {
    return name;
  }
}
