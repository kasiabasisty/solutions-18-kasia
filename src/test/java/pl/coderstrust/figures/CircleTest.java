package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    @Test
    void shouldCalculateCircleArea() {
        //given
        Circle circle = new Circle(5.0);
        double expected = 78.54;

        //when
        double result = circle.calculateArea();

        //then
        assertThat(result, closeTo(expected, 0.02));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenRadiusIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-5.0));
    }
}
