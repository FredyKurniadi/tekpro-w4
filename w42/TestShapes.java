public class TestShapes {
  public static void main(String[] args) {
    // Test Shape class
    Shape shape1 = new Shape();
    System.out.println(shape1);

    Shape shape2 = new Shape("blue", false);
    System.out.println(shape2);

    // Test Circle class
    Circle circle1 = new Circle();
    System.out.println(circle1);

    Circle circle2 = new Circle(2.5, "red", true);
    System.out.println(circle2);

    // Test Rectangle class
    Rectangle rectangle1 = new Rectangle();
    System.out.println(rectangle1);

    Rectangle rectangle2 = new Rectangle(3.0, 4.0, "yellow", true);
    System.out.println(rectangle2);

    // Test Square class
    // Square square1 = new Square();
    // System.out.println(square1);

    Square square2 = new Square(5.0, "orange", true);
    System.out.println(square2);

    square2.setLength(7.0);
    System.out.println(square2);
  }
}