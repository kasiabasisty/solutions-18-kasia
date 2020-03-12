package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {-589, -621, 62, 0, -14};
        int[] sortedArray = sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 0; i < sortedArray.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] > sortedArray[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(sortedArray, maxIndex, i);
        }
        return sortedArray;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
