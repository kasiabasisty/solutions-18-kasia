package pl.coderstrust.sort;

public class BubbleSort implements SortingMethod {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    Swapper.swap(array, j + 1, j);
                }
            }
        }
    }
}

