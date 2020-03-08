package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int[] finalArray = sieve(14);
        System.out.println(Arrays.toString(finalArray));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = new int[maximumNumber + 1];
        for (int i = 0; i < maximumNumber + 1; i++) {
            array[i] = i;
        }
        for (int i = 4; i <= maximumNumber; i++) {
            for (int j = 2; j <= maximumNumber + 1; j++) {
                if (array[i] % j == 0 && array[i] != j) {
                    array[i] = 0;
                }
            }
        }
        int numberOfPrimaryNumbers = 0;
        for (int i = 0; i < maximumNumber + 1; i++) {
            if (array[i] != 0) {
                numberOfPrimaryNumbers++;
            }
        }
        int[] primeNumbersArray = new int[numberOfPrimaryNumbers];
        for (int i = 0; i < numberOfPrimaryNumbers; i++) {
            primeNumbersArray[i] = i;
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
        for (int i = 0; i < primeNumbersArray.length; i++) {
            primeNumbersArray[i] = array[i];
        }
        return primeNumbersArray;
    }
}
