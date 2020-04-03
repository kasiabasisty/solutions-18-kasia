package pl.coderstrust.fibonaccichecker;

import pl.coderstrust.fibonacci.FibonacciIterative;

import java.util.HashSet;
import java.util.Set;

public class FibonacciChecker {
    private Set<Long> fibonacciNumbers = new HashSet<>();

    public static void main(String[] args) {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean isFibonacciNumber = fibonacciChecker.isFibonacciNumber(0);
        System.out.println(isFibonacciNumber);
    }

    public FibonacciChecker() {
        for (int i = 0; i <= 100000; i++) {
            fibonacciNumbers.add(FibonacciIterative.fibonacci(i));
        }
    }

    boolean isFibonacciNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be lower than zero.");
        }
        if (number > 100000) {
            throw new IllegalArgumentException("Number cannot be greater than one hundred thousand.");
        }
        return fibonacciNumbers.contains(number);
    }
}
