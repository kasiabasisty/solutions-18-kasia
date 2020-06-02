package pl.coderstrust.figures;

public class Triangle implements Figure {

    private final double baseLength;
    private final double height;

    public Triangle(double baseLength, double height) {
        if ((baseLength <= 0) || (height <= 0)) {
            throw new IllegalArgumentException("No line segment can be lower or equal to zero.");
        } else {
            this.baseLength = baseLength;
            this.height = height;
        }
    }

    @Override
    public double calculateArea() {
        return 0.5 * baseLength * height;
    }
}
