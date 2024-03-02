public class Square extends Rectangle {

  // Constructors
  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  // Override toString method
  @Override
  public String toString() {
    return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
  }

  public double getArea() {
    return super.getArea();
  }

  public double getPerimeter() {
    return super.getPerimeter();
  }

  // Override setLength and setWidth methods
  @Override
  public void setLength(double side) {
    setWidth(side);
    super.setLength(side);
  }

  @Override
  public void setWidth(double side) {
    setLength(side);
    super.setWidth(side);
  }
}
