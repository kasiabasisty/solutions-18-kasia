package pl.coderstrust.figures;

public class Rectangle implements Figure {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0) {
            throw new IllegalArgumentException("Length can not be lower than zero.");
        } else {
            this.length = length;
        }
        if (width < 0) {
            throw new IllegalArgumentException("Width can not be lower than zero.");
        } else {
            this.width = width;
        }
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
