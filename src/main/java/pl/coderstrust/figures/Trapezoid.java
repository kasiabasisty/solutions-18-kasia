package pl.coderstrust.figures;

public class Trapezoid implements Figure {

    private double baseOne;
    private double baseTwo;
    private double height;

    public Trapezoid(double baseOne, double baseTwo, double height) {
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }
}
