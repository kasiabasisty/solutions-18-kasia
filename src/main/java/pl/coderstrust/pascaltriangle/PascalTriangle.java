package pl.coderstrust.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<String> pascalTriangle = getPascalTriangle(5);
        printPascalTriangle(pascalTriangle);
    }

    public static List<String> getPascalTriangle(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size can't be lower or equal to zero!");
        }
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                long term = factorial(i) / (factorial(j) * factorial(i - j));
                sb.append(term + " ");
            }
            result.add(sb.toString().trim());
            sb.setLength(0);
        }
        return result;
    }

    private static long factorial(int number) {
        long result = 1;
        while (number >= 1) {
            result *= number;
            number--;
        }
        return result;
    }

    public static void printPascalTriangle(List<String> pascalTriangle) {
        pascalTriangle.forEach(s -> System.out.println(s));
    }
}
