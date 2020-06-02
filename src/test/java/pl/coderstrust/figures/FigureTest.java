package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

class FigureTest {

    @Test
    void shouldCalculateCircleArea() {
        //given
        Figure figure = new Circle(5.0);
        double expected = 78.54;

        //when
        double result = figure.calculateArea();

        //then
        assertThat(result, closeTo(expected, 0.02));
    }
}
