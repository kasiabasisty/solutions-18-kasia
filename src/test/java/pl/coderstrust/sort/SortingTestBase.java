package pl.coderstrust.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class SortingTestBase {
    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() {
        // Given
        int[] given = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        // When
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortEmptyArray() {
        // Given
        int[] given = new int[]{};
        int[] expected = new int[]{};

        // When
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortOneElementArray() {
        // Given
        int[] given = new int[]{1};
        int[] expected = new int[]{1};

        // When
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortTwoElementArray() {
        // Given
        int[] given = new int[]{1, 1};
        int[] expected = new int[]{1, 1};

        // When
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortSortedArray() {
        // Given
        int[] given = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        // When
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortBigArray() {
        // Given
        int[] given = createRandomArray(20000);
        int[] expected = given.clone();
        Arrays.sort(expected);

        // When
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // Then
        assertArrayEquals(expected, result);
    }

    private int[] createRandomArray(int size) {

        int[] array = new int[size];
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = generator.nextInt();
        }
        return array;
    }
}
