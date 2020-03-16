package pl.coderstrust.christmastree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChristmasTreeTest {

    @Test
    public void shouldReturnCorrectResult() {
        //Given
        int input = 5;
        List<String> expected = Arrays.asList("    *", "   ***", "  *****", " *******", "*********", "    **");

        //When
        List<String> actual = ChristmasTree.getChristmasTree(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldThrowExceptionForInvalidSize() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ChristmasTree.getChristmasTree(-1));
        assertThat(exception.getMessage(), is("Size can't be lower than zero!"));
    }
}