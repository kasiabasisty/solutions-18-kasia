package pl.coderstrust.figures;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius can not be lower than zero.");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2.0);
    }
}
