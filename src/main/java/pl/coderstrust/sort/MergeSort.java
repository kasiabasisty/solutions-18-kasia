package pl.coderstrust.sort;

import java.util.Arrays;

public class MergeSort implements SortingMethod {

    public static void main(String[] args) {

        int[] array = {-589, -621, 62, 0, -14};
        int[] sortedArray = new MergeSort().sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = array.clone();
        if (sortedArray.length == 1 || sortedArray.length == 0) {
            return sortedArray;
        }
        int midpoint = sortedArray.length / 2;

        int[] left = new int[midpoint];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = sortedArray[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = sortedArray[midpoint + j];
        }

        left = sort(left);
        right = sort(right);

        sortedArray = merge(left, right);

        return sortedArray;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
