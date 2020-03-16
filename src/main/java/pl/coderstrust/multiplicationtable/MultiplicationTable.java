package pl.coderstrust.multiplicationtable;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = getMultiplicationTable(5);
        printMultiplicationTable(multiplicationTable);
    }

    public static int[][] getMultiplicationTable(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size can't be lower than zero!");
        }
        int[][] multiplicationTable = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }
        return multiplicationTable;
    }

    public static void printMultiplicationTable(int[][] multiplicationTable) {
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();
        }
    }
}

