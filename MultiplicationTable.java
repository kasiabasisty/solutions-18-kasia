package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(8);
    }

    public static void printMultiplicationTable(int size) {

        System.out.print("      ");

        for (int i = 1; i <= size; i++) {
            if (i >= 10) {
                System.out.print(i);
                System.out.print("     ");
            } else {
                System.out.print(i);
                System.out.print("      ");
            }
        }

        System.out.println();

        for (int i = 1; i <= size; i++) {

            if (i < 10) {
                System.out.print(i + "     ");
            } else {
                System.out.print(i + "    ");
            }

            for (int j = 1; j <= size; j++) {
                if (i * j >= 100) {
                    System.out.print(j * i + "    ");
                } else if (i * j < 100 && i * j >= 10) {
                    System.out.print(j * i + "     ");
                } else {
                    System.out.print(j * i + "      ");
                }
            }
            System.out.println();
        }
    }
}