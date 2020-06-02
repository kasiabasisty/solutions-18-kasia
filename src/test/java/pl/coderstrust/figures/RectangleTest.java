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
        assertThat(result, is(expected));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLengthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5.0, 1.0));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenWidthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1.0, -5.0));
    }
}
