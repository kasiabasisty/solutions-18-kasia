package pl.coderstrust.sort;

import java.util.Arrays;

public class QuickSort implements SortingMethod {

    public static void main(String[] args) {

        int[] array = {-589, -621, 62, 0, -14};
        int[] sortedArray = new QuickSort().sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = array.clone();
        int low = 0;
        int high = sortedArray.length - 1;
        if (low < high) {
            int pi = partition(sortedArray, low, high);
            quickSort(sortedArray, low, pi - 1);//left
            quickSort(sortedArray, pi + 1, high); //right
        }
        return sortedArray;
    }

    private static void quickSort(int sortedArray[], int low, int high) {
        if (low < high) {
            int pi = partition(sortedArray, low, high);
            quickSort(sortedArray, low, pi - 1); //left
            quickSort(sortedArray, pi + 1, high); //right
        }
    }

    private static int partition(int sortedArray[], int low, int high) {
        int pivot = sortedArray[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (sortedArray[j] < pivot) {
                i++;
                swap(sortedArray, i, j);
            }
        }
        swap(sortedArray, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] sortedArray, int a, int b) {
        int temp = sortedArray[a];
        sortedArray[a] = sortedArray[b];
        sortedArray[b] = temp;
    }
}
