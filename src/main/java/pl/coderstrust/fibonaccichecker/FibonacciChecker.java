package pl.coderstrust.fibonaccichecker;

import java.util.HashSet;

public class FibonacciChecker {
    HashSet<Long> fibonacciNumbers = new HashSet<>();

    public static void main(String[] args) {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean isFibonacciNumber = fibonacciChecker.isFibonacciNumber(-1);
        System.out.println(isFibonacciNumber);
    }

    public FibonacciChecker() {
        long priev = 0;
        long current = 1;
        long next = 1;
        fibonacciNumbers.add(next);
        while (next < 100000) {
            priev = current;
            current = next;
            next = priev + current;
            fibonacciNumbers.add(next);
        }
    }

    boolean isFibonacciNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fibonacci number can not be lower than zero!");
        }

        return fibonacciNumbers.contains(number);
    }
}
