public class Cylinder extends Circle { // Save as "Cylinder.java"
  private double height; // private variable

  // Constructor with default color, radius, and height
  public Cylinder() {
    super(); // call superclass no-arg constructor Circle()
    height = 1.0;
  }

  // Constructor with default radius, color but given height
  public Cylinder(double height) {
    super(); // call superclass no-arg constructor Circle()
    this.height = height;
  }

  // Constructor with default color, but given radius, height
  public Cylinder(double radius, double height) {
    super(radius); // call superclass constructor Circle(r)
    this.height = height;
  }

  // A public method for retrieving the height
  public double getHeight() {
    return height;
  }

  @Override
  public double getArea() {
    // Calculate surface area of the cylinder
    // Surface Area = 2π×radius×height + 2×base-area
    return 2 * Math.PI * getRadius() * getHeight() + 2 * super.getArea(); // super.getArea() will call the superclass' getArea() method
  }

  // A public method for computing the volume of cylinder
  public double getVolume() {
  // Volume = base-area * height
  return super.getArea() * height; // Using the overridden getArea() method
  }

  // Override toString() method to provide a custom string representation
  @Override
  public String toString() {
    return "Cylinder: subclass of " + super.toString() // use Circle's toString()
    + " height=" + height;
  }
}
