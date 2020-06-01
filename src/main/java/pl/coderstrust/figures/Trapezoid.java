package pl.coderstrust.figures;

public class Trapezoid implements Figure {

    private double lengthOfBaseOne;
    private double lengthOfBaseTwo;
    private double height;

    public Trapezoid(double lengthOfBaseOne, double lengthOfBaseTwo, double height) {
        if ((lengthOfBaseOne < 0) || (lengthOfBaseTwo < 0)) {
            throw new IllegalArgumentException("Base's length can not be lower than zero.");
        } else {
            this.lengthOfBaseOne = lengthOfBaseOne;
            this.lengthOfBaseTwo = lengthOfBaseTwo;
        }

        if (height < 0) {
            throw new IllegalArgumentException("Height can not be lower than zero.");
        } else {
            this.height = height;
        }
    }

    @Override
    public double calculateArea() {
        return 0.5 * (lengthOfBaseOne + lengthOfBaseTwo) * height;
    }
}
