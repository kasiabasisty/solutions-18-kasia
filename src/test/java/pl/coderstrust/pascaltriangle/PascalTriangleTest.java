package pl.coderstrust.pascaltriangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PascalTriangleTest {

    @Test
    public void shouldReturnCorrectResult() {
        //Given
        int input = 6;
        List<String> expected = Arrays.asList("1", "1 1", "1 2 1", "1 3 3 1", "1 4 6 4 1", "1 5 10 10 5 1");

        //When
        List<String> actual = PascalTriangle.getPascalTriangle(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldTrowExceptionForInvalidSize() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> PascalTriangle.getPascalTriangle(-1));
        assertThat(exception.getMessage(), is("Size can't be lower or equal to zero!"));
    }
}
