package pl.coderstrust.fibonaccichecker;

import java.util.HashMap;

public class FibonacciChecker2 {
    HashMap<Long, Boolean> fibonacciNumbers = new HashMap<>();

    public static void main(String[] args) {
        FibonacciChecker2 fibonacciChecker2 = new FibonacciChecker2();
        boolean isFibonacciNumber = fibonacciChecker2.isFibonacciNumber(-15);
        System.out.println(isFibonacciNumber);
    }

    boolean isFibonacciNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fibonacci number can not be lower than zero!");
        }
        if (fibonacciNumbers.containsKey(number)) {
            return fibonacciNumbers.get(number);
        } else {
            long formula1 = 5 * (number * number) + 4;
            long formula2 = 5 * (number * number) - 4;
            boolean result = isPerfectSquare(formula1) || isPerfectSquare(formula2);
            fibonacciNumbers.put(number, result);
            return result;
        }
    }

    private static boolean isPerfectSquare(long number) {
        long temp = (long) Math.sqrt(number);
        return (temp * temp == number);
    }
}
