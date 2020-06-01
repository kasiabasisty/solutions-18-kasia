package pl.coderstrust.figures;

public class Triangle implements Figure {

    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        if (baseLength < 0) {
            throw new IllegalArgumentException("Base's length can not be lower than zero.");
        } else {
            this.baseLength = baseLength;
        }

        if (height < 0) {
            throw new IllegalArgumentException("Height can not be lower than zero.");
        } else {
            this.height = height;
        }
    }

    @Override
    public double calculateArea() {
        return 0.5 * baseLength * height;
    }
}
