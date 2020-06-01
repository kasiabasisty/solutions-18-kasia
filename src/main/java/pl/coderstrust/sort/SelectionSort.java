package pl.coderstrust.sort;

public class SelectionSort implements SortingMethod {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            Swapper.swap(array, minIndex, i);
        }
    }
}
