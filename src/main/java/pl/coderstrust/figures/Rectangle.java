package pl.coderstrust.figures;

public class Rectangle implements Figure {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if ((length <= 0) || (width <= 0)) {
            throw new IllegalArgumentException("No line segment can be lower or equal to zero.");
        } else {
            this.length = length;
            this.width = width;
        }
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
