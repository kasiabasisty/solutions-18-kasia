package pl.coderstrust.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort implements SortingMethod {
    public static void main(String[] args) {

        int[] array = {-589, -621, 62, 0, -14};
        int[] sortedArray = new CollectionSort().sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
    }

    @Override
    public int[] sort(int[] array) {
        List<> list = Arrays.asList(array);
        Collections.sort(list);
        return array;
    }
}