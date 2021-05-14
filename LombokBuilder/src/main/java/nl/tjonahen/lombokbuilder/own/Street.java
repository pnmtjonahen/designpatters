package nl.tjonahen.lombokbuilder.own;

public class Street {
  private final String name;
  private final int number;
  private final String addition;

  private Street(final String name, final int number, final String addition) {
    this.name = name;
    this.number = number;
    this.addition = addition;
  }

  public static class Builder {
    private String name;
    private int number;
    private String addition;

    private Builder() {}

    public Builder name(final String name) {
      this.name = name;
      return this;
    }

    public Builder number(int number) {
      this.number = number;
      return this;
    }

    public Builder addition(final String addition) {
      this.addition = addition;
      return this;
    }

    public Street build() {
      return new Street(name, number, addition);
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public String getAddition() {
    return addition;
  }
}
