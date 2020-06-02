package pl.coderstrust.sort;

public final class Swapper {

    private Swapper() throws Exception {
        throw new IllegalAccessException();
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
