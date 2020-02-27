package pl.coderstrust.christmas;

public class christmasTree {
    public static void main(String[] args) {
        printChristmasTree(10);
    }

    public static void printChristmasTree(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int y = 1; y < size; y++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}
