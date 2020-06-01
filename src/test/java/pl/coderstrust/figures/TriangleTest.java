package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleTest {

    @Test
    void shouldCalculateTriangleArea() {
        //given
        Triangle triangle = new Triangle(5.0, 5.0);
        double expected = 12.5;

        //when
        double result = triangle.calculateArea();

        //then
        assertThat(expected, is(result));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenBaseLengthIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Triangle(-5.0, 1.0));

        //then
        assertThat(exception.getMessage(), is("Base's length can not be lower than zero."));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenHeightIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Triangle(1.0, -5.0));

        //then
        assertThat(exception.getMessage(), is("Height can not be lower than zero."));
    }
}
