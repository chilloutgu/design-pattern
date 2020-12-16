package factory_method;

public class OrderList {
  private String name;
  private int size;
  private Color color;
  private Leather leather;
  private Sole sole;
  private boolean hasPattern;

  public OrderList(String name, int size, Color color, Leather leather, Sole sole, boolean hasPattern) {
    this.name = name;
    this.size = size;
    this.color = color;
    this.leather = leather;
    this.sole = sole;
    this.hasPattern = hasPattern;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  public Color getColor() {
    return color;
  }

  public Leather getLeather() {
    return leather;
  }

  public Sole getSole() {
    return sole;
  }

  public boolean getHasPattern() {
    return hasPattern;
  }

  public static class Builder {
    /* 필수 인자 */
    private String name;
    private int size;

    /* 선택 인자 */
    private Color color = Color.BLACK;
    private Leather leather = Leather.COW;
    private Sole sole = Sole.REGULAR;
    private boolean hasPattern = false;

    public Builder(String name, int size) {
      this.name = name;
      this.size = size;
    }

    public Builder withColor(Color color) {
      this.color = color;
      return this;
    }

    public Builder withLeather(Leather leather) {
      this.leather = leather;
      return this;
    }

    public Builder withSole(Sole sole) {
      this.sole = sole;
      return this;
    }

    public Builder withPattern(boolean hasPattern) {
      this.hasPattern = hasPattern;
      return this;
    }

    public OrderList build() {
      return new OrderList(this.name, this.size, this.color, this.leather, this.sole, this.hasPattern);
    }
  }
}