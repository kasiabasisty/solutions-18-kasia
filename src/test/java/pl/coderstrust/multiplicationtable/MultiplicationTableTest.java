package pl.coderstrust.multiplicationtable;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MultiplicationTableTest {

    @Test
    public void shouldReturnCorrectResult() {
        //Given
        int input = 5;
        int[][] expected = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};

        //When
        int[][] actual = MultiplicationTable.getMultiplicationTable(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldTrowExceptionForInvalidSize() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MultiplicationTable.getMultiplicationTable(-1));
        assertThat(exception.getMessage(), is("Size can't be lower than zero!"));
    }
}
