package pl.coderstrust.christmastree;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        List<String> christmasTree = getChristmasTree(5);
        printChristmasTree(christmasTree);
    }

    public static List<String> getChristmasTree(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size can't be lower than zero!");
        }
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                sb.append("*");
            }
            result.add(sb.toString());
            sb.setLength(0);
        }
        for (int i = 1; i < size; i++) {
            sb.append(" ");
        }
        sb.append("**");
        result.add(sb.toString());
        sb.setLength(0);
        return result;
    }

    public static void printChristmasTree(List<String> christmasTree) {
        christmasTree.forEach(s -> System.out.println(s));
    }
}
