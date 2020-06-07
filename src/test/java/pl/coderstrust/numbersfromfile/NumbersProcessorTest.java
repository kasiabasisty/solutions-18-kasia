package pl.coderstrust.numbersfromfile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumbersProcessorTest {

    @ParameterizedTest
    @MethodSource("shouldProvideCorrectLinesToProcess")
    void shouldReturnCorrectlyProcessedLine(String input, String expected) {
        //given
        NumbersProcessor numbersProcessor = new NumbersProcessor();

        //when
        String actual = numbersProcessor.processLine(input);

        //then
        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> shouldProvideCorrectLinesToProcess() {
        return Stream.of(Arguments.of("2 4 56 4323", "2+4+56+4323=4385"),
                (Arguments.of("435  204   756   23 4   ", "435+204+756+23+4=1422"))
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"2abc % fhtt4GH56 4323", "Invalid line #435  pfog204   756 !!  23 0"})
    public void shouldTrowExceptionForIncorrectLineProvided(String input) {
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        assertThrows(NumberFormatException.class, () -> numbersProcessor.processLine(input));
    }
}
