package pl.coderstrust.sort;

import java.util.stream.IntStream;

public class CollectionSort implements SortingMethod {

    @Override
    public void sort(int[] array) {
        int[] sortedArray = IntStream.of(array).sorted().toArray();

        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }
}
