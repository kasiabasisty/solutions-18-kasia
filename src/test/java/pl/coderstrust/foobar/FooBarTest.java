package pl.coderstrust.foobar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FooBarTest {

    @Test
    public void shouldReturnCorrectResult() {
        //Given
        int input = 15;
        List<String> expected = Arrays.asList("0FooBar", "1", "2", "3Foo", "4", "5Bar", "6Foo", "7", "8", "9Foo",
                "10Bar", "11", "12Foo", "13", "14", "15FooBar");
        //When
        List<String> actual = FooBar.getFooBar(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldTrowExceptionForInvalidSize() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FooBar.getFooBar(-1));
        assertThat(exception.getMessage(), is("Number can't be lower than zero!"));
    }
}
