package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {

    @Test
    void shouldCalculateSquareArea() {
        //given
        Square square = new Square(5.0);
        double expected = 25.0;

        //when
        double result = square.calculateArea();

        //then
        assertThat(expected, is(result));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenSideLengthIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Square(-5.0));

        //then
        assertThat(exception.getMessage(), is("Side's length can not be lower than zero."));
    }
}
