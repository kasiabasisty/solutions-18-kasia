package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        long fibonacciNumber = fibonacci(12);
        System.out.println(fibonacciNumber);

    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder <= 0) {
            System.out.println("Incorrect argument!");
            return -1;
        } else if (fibonacciNumberInOrder > 0 & fibonacciNumberInOrder < 3) {
            return 1;
        } else {
            return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
        }
    }
}
