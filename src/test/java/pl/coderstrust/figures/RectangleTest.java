package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    void shouldCalculateRectangleArea() {
        //given
        Rectangle rectangle = new Rectangle(5.0, 5.0);
        double expected = 25.0;

        //when
        double result = rectangle.calculateArea();

        //then
        assertThat(expected, is(result));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLengthIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5.0, 1.0));

        //then
        assertThat(exception.getMessage(), is("Length can not be lower than zero."));
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
