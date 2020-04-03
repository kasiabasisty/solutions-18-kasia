package pl.coderstrust.fibonaccichecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciCheckerTest {
    private FibonacciChecker fibonacciChecker = new FibonacciChecker();

    @ParameterizedTest
    @ValueSource(longs = {5, 13, 144})
    public void shouldReturnTrueForFibonacciNumber(long number) {
        assertTrue(fibonacciChecker.isFibonacciNumber(number));
    }

    @ParameterizedTest
    @ValueSource(longs = {16, 242, 827})
    public void shouldReturnFalseForFibonacciNumber(long number) {
        assertFalse(fibonacciChecker.isFibonacciNumber(number));
    }

    @ParameterizedTest
    @ValueSource(longs = {-500, -1})
    public void shouldThrowExceptionForTooLowNumber(long number) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fibonacciChecker.isFibonacciNumber(number));
        assertThat(exception.getMessage(), is("Number cannot be lower than zero."));
    }

    @ParameterizedTest
    @ValueSource(longs = {100001, 555555})
    public void shouldThrowExceptionForTooBigNumber(long number) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fibonacciChecker.isFibonacciNumber(number));
        assertThat(exception.getMessage(), is("Number cannot be greater than one hundred thousand."));
    }
}
