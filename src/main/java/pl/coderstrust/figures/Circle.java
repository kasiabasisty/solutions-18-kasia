package pl.coderstrust.figures;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2.0);
    }
}
