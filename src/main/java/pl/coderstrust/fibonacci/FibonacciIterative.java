package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static void main(String[] args) {
        long fibonacciNumber = fibonacci(11);
        System.out.println(fibonacciNumber);
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        long priev = 1;
        long current = 1;
        if (fibonacciNumberInOrder <= 0) {
            System.out.println("Incorrect argument!");
            return -1;
        } else if (fibonacciNumberInOrder > 0 & fibonacciNumberInOrder < 3) {
            return 1;
        } else {
            for (int i = 0; i < fibonacciNumberInOrder; i++) {
                long next = priev + current;
                priev = current;
                current = next;
            }
            return current;
        }
    }
}
