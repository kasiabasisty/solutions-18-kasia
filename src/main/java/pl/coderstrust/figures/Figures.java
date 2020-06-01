package pl.coderstrust.figures;

public class Figures {
    public static void main(String[] args) {

        Figure circle = new Circle(5.0);
        Figure rectangle = new Rectangle(5.0, 5.0);
        Figure square = new Square(5.0);
        Figure trapezoid = new Trapezoid(5.0, 5.0, 5.0);
        Figure triangle = new Triangle(5.0, 5.0);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());
        System.out.println(trapezoid.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
