package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(10);
    }

    public static void printChristmasTree(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < size; i++) {
            System.out.print(" ");
        }
        System.out.print("**");
    }
}
