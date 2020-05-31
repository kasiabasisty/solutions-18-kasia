package pl.coderstrust.sort;

public class QuickSort implements SortingMethod {

    @Override
    public void sort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        
        quickSort(array, low, high);
    }

    private static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                Swapper.swap(array, i, j);
            }
        }
        Swapper.swap(array, i + 1, high);
        return i + 1;
    }
}
