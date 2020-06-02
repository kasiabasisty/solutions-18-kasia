package pl.coderstrust.figures;

public class Trapezoid implements Figure {

    private final double lengthOfBaseOne;
    private final double lengthOfBaseTwo;
    private final double height;

    public Trapezoid(double lengthOfBaseOne, double lengthOfBaseTwo, double height) {
        if ((lengthOfBaseOne <= 0) || (lengthOfBaseTwo <= 0) || (height <= 0)) {
            throw new IllegalArgumentException("No line segment can be lower or equal to zero.");
        } else {
            this.lengthOfBaseOne = lengthOfBaseOne;
            this.lengthOfBaseTwo = lengthOfBaseTwo;
            this.height = height;
        }
    }

    @Override
    public double calculateArea() {
        return 0.5 * (lengthOfBaseOne + lengthOfBaseTwo) * height;
    }
}
