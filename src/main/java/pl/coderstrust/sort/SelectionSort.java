package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {-589, -621, 62, 0, -14};
        int[] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i == array.length; i++) {
            sortedArray[i] = 0;
        }
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] > sortedArray[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = sortedArray[maxIndex];
            sortedArray[maxIndex] = sortedArray[i];
            sortedArray[i] = temp;
        }
        return sortedArray;
    }
}
