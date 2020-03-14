package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    private static final int NON_PRIME_MARKER = 0;

    public static void main(String[] args) {
        int[] finalArray = sieve(13);
        System.out.println(Arrays.toString(finalArray));
    }

    public static int[] sieve(int maximumNumber) {
        if (maximumNumber < 2) {
            return new int[0];
        }
        int[] array = createInitialArray(maximumNumber);
        int countOfNonPrimeNumbers = markNonPrimeNumbers(array);
        int countOfPrimeNumbers = array.length - countOfNonPrimeNumbers;
        return extractPrimesNumbers(array, countOfPrimeNumbers);
    }

    private static int[] createInitialArray(int size) {
        int[] array = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int markNonPrimeNumbers(int[] array) {
        int nonPrimeNumbers = 2;
        for (int i = 2; i * i <= array.length; i++) {
            if (array[i] != NON_PRIME_MARKER) {
                for (int j = i; i * j < array.length; j++) {
                    if (array[i * j] != NON_PRIME_MARKER) {
                        array[i * j] = NON_PRIME_MARKER;
                        nonPrimeNumbers++;
                    }
                }
            }
        }
        return nonPrimeNumbers;
    }

    private static int[] extractPrimesNumbers(int[] array, int countOfPrimeNumbers) {
        int[] primeNumbers = new int[countOfPrimeNumbers];
        int position = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] != NON_PRIME_MARKER) {
                primeNumbers[position++] = array[i];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return primeNumbers;
    }
}
