package nl.tjonahen.lombokbuilder.own;

public class Adress {

  private final Street street;
  private final City city;

  private Adress(final Street street, final City city) {
    this.street = street;
    this.city = city;
  }

  public static class Builder {
    private Street street;
    private City city;

    private Builder() {}

    public Builder street(final Street street) {
      this.street = street;
      return this;
    }

    public Builder city(final City city) {
      this.city = city;
      return this;
    }

    public Adress build() {
      return new Adress(street, city);
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  public Street getStreet() {
    return street;
  }

  public City getCity() {
    return city;
  }
}
