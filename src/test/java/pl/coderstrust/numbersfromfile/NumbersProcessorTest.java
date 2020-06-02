package pl.coderstrust.numbersfromfile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NumbersProcessorTest {

    @ParameterizedTest
    @MethodSource("shouldProvideLinesToRead")
    void shouldReturnProcessedLine(String input, String expected) {
        //given
        NumbersProcessor numbersProcessor = new NumbersProcessor();

        //when
        String actual = numbersProcessor.processLine(input);

        //then
        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> shouldProvideLinesToRead() {
        return Stream.of(Arguments.of("2 4 56 4323", "2+4+56+4323=4385"),
                (Arguments.of("435  204   756   23 0   ", "435+204+756+23+0=1418"))
        );
    }
}
