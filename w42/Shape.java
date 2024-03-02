public class Shape {
  // instance variables
  private String color;
  private boolean filled;

  // Constructors
  public Shape() {
    color = "green";
    filled = true;
  }

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  // Getters and setters
  public String isColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  // toString method
  @Override
  public String toString() {
    return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
  }
}