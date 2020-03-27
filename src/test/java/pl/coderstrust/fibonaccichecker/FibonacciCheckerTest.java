package pl.coderstrust.fibonaccichecker;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciCheckerTest {
    private FibonacciChecker fibonacciChecker = new FibonacciChecker();

    @Test
    public void shouldSayIfNumberIsFibonacciNumber() {
        //Given
        int input = 5;
        boolean expected = true;

        //When
        boolean actual = fibonacciChecker.isFibonacciNumber(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldThrowExceptionForInvalidNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fibonacciChecker.isFibonacciNumber(-1));
        assertThat(exception.getMessage(), is("Fibonacci number can not be lower than zero!"));
    }
}