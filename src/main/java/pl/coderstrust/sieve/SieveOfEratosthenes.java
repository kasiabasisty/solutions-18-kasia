package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int[] finalArray = sieve(13);
        System.out.println(Arrays.toString(finalArray));
    }

    public static int[] sieve(int maximumNumber) {
        if (maximumNumber < 2) {
            return new int[0];
        }
        int[] array = createInitialArray(maximumNumber);
        int countOfNonPrimeNumbers = markNonePrimeNumbers(array);
        int countOfPrimeNumbers = array.length - countOfNonPrimeNumbers;
        return extractPrimesNumbers(array, countOfPrimeNumbers);
    }

    private static int[] createInitialArray(int maximumNumber) {
        int[] array = new int[maximumNumber + 1];
        for (int i = 0; i < maximumNumber + 1; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int markNonePrimeNumbers(int[] array) {
        for (int i = 4; i <= array.length - 1; i++) {
            for (int j = 2; j <= array.length; j++) {
                if (array[i] % j == 0 && array[i] != j) {
                    array[i] = 0;
                }
            }
        }
        int countOfNonPrimeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countOfNonPrimeNumbers++;
            }
        }
        return countOfNonPrimeNumbers;
    }

    private static int[] extractPrimesNumbers(int[] array, int countOfPrimeNumbers) {
        int[] primeNumbersArray = new int[countOfPrimeNumbers];
//        for (int i = 0; i < countOfPrimeNumbers; i++) {
//        primeNumbersArray[i] = i;
//    }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < primeNumbersArray.length; i++) {
            primeNumbersArray[i] = array[i];
        }
        return primeNumbersArray;
    }
}
