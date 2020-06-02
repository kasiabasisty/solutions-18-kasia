package pl.coderstrust.figures;

public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("No line segment can be lower or equal to zero.");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
