package pl.coderstrust.sort;

public class MergeSort implements SortingMethod {

    @Override
    public void sort(int[] array) {
        if (array.length >= 2) {
            int midpoint = array.length / 2;

            int[] left = new int[midpoint];
            int[] right;

            right = (array.length % 2 == 0 ? new int[midpoint] : new int[midpoint + 1]);

            for (int i = 0; i < midpoint; i++) {
                left[i] = array[i];
            }

            for (int j = 0; j < right.length; j++) {
                right[j] = array[midpoint + j];
            }

            sort(left);
            sort(right);

            int[] sortedArray = merge(left, right);
            System.arraycopy(sortedArray, 0, array, 0, array.length);
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

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
