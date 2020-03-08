package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {-589, -621, 62, 0, -14};
        int[] sortedArray = bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] bubbleSort(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i == array.length; i++) {
            sortedArray[i] = 0;
        }
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j + 1] > sortedArray[j]) {
                    int temp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
