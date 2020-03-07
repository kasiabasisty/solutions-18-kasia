package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        long fibonacciNumber = fibonacci(5);
        System.out.println(fibonacciNumber);

    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0) {
            throw new IllegalArgumentException("Fibonacci number in order cannot be lower than zero");
        }
        if (fibonacciNumberInOrder <= 1) {
            return fibonacciNumberInOrder;
        }
        {
            return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
        }
    }
}
