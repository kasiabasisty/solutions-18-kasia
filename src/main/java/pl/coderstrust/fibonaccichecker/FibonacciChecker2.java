package pl.coderstrust.fibonaccichecker;

import java.util.HashMap;
import java.util.Map;

public class FibonacciChecker2 {
    private Map<Long, Boolean> cache = new HashMap<>();

    public static void main(String[] args) {
        FibonacciChecker2 fibonacciChecker2 = new FibonacciChecker2();
        boolean isFibonacciNumber = fibonacciChecker2.isFibonacciNumber(-15);
        System.out.println(isFibonacciNumber);
    }

    boolean isFibonacciNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be lower than zero.");
        }
        if (cache.containsKey(number)) {
            return cache.get(number);
        }
        long formula1 = 5 * (number * number) + 4;
        long formula2 = 5 * (number * number) - 4;
        boolean result = isPerfectSquare(formula1) || isPerfectSquare(formula2);
        cache.put(number, result);
        return result;
    }

    private static boolean isPerfectSquare(long number) {
        long temp = (long) Math.sqrt(number);
        return (temp * temp == number);
    }
}
