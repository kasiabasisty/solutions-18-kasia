package pl.coderstrust.fibonaccichecker;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciChecker2Test {
    private FibonacciChecker2 fibonacciChecker2 = new FibonacciChecker2();

    @Test
    public void shouldReturnTrueForFibonacciNumber() {
        //Given
        int input = 5;
        boolean expected = true;

        //When
        boolean actual = fibonacciChecker2.isFibonacciNumber(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnFalseForNonFibonacciNumber() {
        int input = 10;
        boolean expected = false;

        //When
        boolean actual = fibonacciChecker2.isFibonacciNumber(input);

        //Then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldThrowExceptionForInvalidNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fibonacciChecker2.isFibonacciNumber(-1));
        assertThat(exception.getMessage(), is("Fibonacci number can not be lower than zero!"));
    }
}
