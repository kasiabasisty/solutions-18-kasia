package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FigureTest {

    @Test
    void shouldCalculateCircleArea() {
        //given
        Figure figure = new Circle(5.0);
        double expected = 78.5;

        //when
        double result = figure.calculateArea();

        //then
        assertThat(expected, is(result));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenRadiusIsNegative() {
        //given

        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Circle(-5.0));

        //then
        assertThat(exception.getMessage(), is("Radius can not be lower than zero."));
    }
}
