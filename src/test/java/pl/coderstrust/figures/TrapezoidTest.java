package pl.coderstrust.figures;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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


    @ParameterizedTest
    @MethodSource("shouldProvideDifferentSetsOfNegativeLineSegments")
    void shouldThrowIllegalArgumentExceptionWhenBaseOneLengthIsNegative(double lengthOfBaseOne, double lengthOfBaseTwo, double height) {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(lengthOfBaseOne, lengthOfBaseTwo, height));
    }

    private static Stream<Arguments> shouldProvideDifferentSetsOfNegativeLineSegments() {
        return Stream.of(Arguments.of(-5.0, 1.0, 1.0),
                Arguments.of(5.0, -1.0, 1.0),
                Arguments.of(5.0, 1.0, -5.0),
                Arguments.of(-1.0, -1.0, -1.0),
                Arguments.of(5.0, -1.0, -1.0));
    }
}
