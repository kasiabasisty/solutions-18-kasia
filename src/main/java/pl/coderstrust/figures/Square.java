package pl.coderstrust.figures;

public class Square implements Figure {

    private double sideLength;

    public Square(double sideLength) {
        if (sideLength < 0) {
            throw new IllegalArgumentException("Side's length can not be lower than zero.");
        } else {
            this.sideLength = sideLength;
        }
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2.0);
    }
}
