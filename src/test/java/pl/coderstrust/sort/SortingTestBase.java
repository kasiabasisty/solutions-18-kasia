package pl.coderstrust.sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    @ParameterizedTest
    @MethodSource("parametersForSortTests")
    public void shouldSortGivenArray(int[] given, int[] expected) {
        // Given

        // When
        sortAndMeasureTime(given);

        // Then
        assertThat(given, is(expected));
    }

    private static Stream<Arguments> parametersForSortTests() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{2, -2}, new int[]{-2, 2}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {10000, 20000, 100000})
    public void shouldSortBigArray(int ints) {
        // Given
        int[] given = createRandomArray(ints);
        int[] expected = given.clone();
        Arrays.sort(expected);

        // When
        sortAndMeasureTime(given);

        // Then
        assertThat(given, is(expected));
    }

    private void sortAndMeasureTime(int[] given) {
        long startTime = System.currentTimeMillis();
        getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime);
    }

    private static int[] createRandomArray(int size) {

        int[] array = new int[size];
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = generator.nextInt();
        }
        return array;
    }
}
