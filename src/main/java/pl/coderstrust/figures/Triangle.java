package pl.coderstrust.figures;

public class Triangle implements Figure {

    private double lengthOfTheBase;
    private double height;

    public Triangle(double lengthOfTheBase, double height) {
        this.lengthOfTheBase = lengthOfTheBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * lengthOfTheBase * height;
    }
}
