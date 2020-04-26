package pl.coderstrust.figures;

public class Square implements Figure {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2.0);
    }
}
