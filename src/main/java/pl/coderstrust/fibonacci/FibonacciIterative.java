package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static void main(String[] args) {
        long fibonacciNumber = fibonacci(5);
        System.out.println(fibonacciNumber);
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0) {
            throw new IllegalArgumentException("Fibonacci number in order cannot be lower than zero");
        }
        if (fibonacciNumberInOrder <= 1) {
            return fibonacciNumberInOrder;
        }
        long priev = 0;
        long current = 1;
        long next = 1;
        for (int i = 0; i < fibonacciNumberInOrder - 1; i++) {
            priev = current;
            current = next;
            next = priev + current;
        }
        return current;
    }
}
