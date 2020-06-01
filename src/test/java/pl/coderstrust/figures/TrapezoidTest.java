package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TrapezoidTest {

    @Test
    void shouldCalculateTrapezoidArea() {
        //given
        Trapezoid trapezoid = new Trapezoid(5.0, 5.0, 5.0);
        double expected = 25.0;

        //when
        double result = trapezoid.calculateArea();

        //then
        assertThat(expected, is(result));
    }

    @Test
    @MethodSource("shouldProvide")
    void shouldThrowIllegalArgumentExceptionWhenBaseLengthIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Trapezoid(-5.0, 1.0, 1.0));

        //then
        assertThat(exception.getMessage(), is("Base's length can not be lower than zero."));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenWidthIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(1.0, -5.0));

        //then
        assertThat(exception.getMessage(), is("Width can not be lower than zero."));
    }
}
