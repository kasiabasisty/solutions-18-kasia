package pl.coderstrust.pascaltriangle;

public class PascalTriangle {
    public static void main(String[] args) {
        printPascalTriangle(7);
    }

    public static void printPascalTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) System.out.printf("%3s", "");
            for (int j = 0; j <= i; j++) {
                long term = (factorial(i) / (factorial(j) * factorial(i - j)));
                System.out.printf("%6d", term);
            }
            System.out.println();
        }
    }

    private static long factorial(int number) {
        long result = 1;
        while (number >= 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
