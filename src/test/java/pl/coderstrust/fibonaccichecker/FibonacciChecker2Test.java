package pl.coderstrust.fibonaccichecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciChecker2Test {
    private FibonacciChecker2 fibonacciChecker2 = new FibonacciChecker2();

    @ParameterizedTest
    @ValueSource(longs = {5, 13, 144})
    public void shouldReturnTrueForFibonacciNumber(long number) {
        assertTrue(fibonacciChecker2.isFibonacciNumber(number));
    }

    @ParameterizedTest
    @ValueSource(longs = {16, 242, 827})
    public void shouldReturnFalseForFibonacciNumber(long number) {
        assertFalse(fibonacciChecker2.isFibonacciNumber(number));
    }

    @ParameterizedTest
    @ValueSource(longs = {-500, -1})
    public void shouldThrowExceptionForInvalidNumber(long number) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fibonacciChecker2.isFibonacciNumber(number));
        assertThat(exception.getMessage(), is("Number cannot be lower than zero."));
    }
}
