package pl.coderstrust.regex;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RegexIPv4Test {

    @ParameterizedTest
    @ValueSource(strings = {"0.0.0.00", "025.00.233.25", "0.0.258.9", "abc.abc.abc.255"})
    void shouldReturnFalseIfProvidedStringIsNotIPv4Pattern(String input) {
        //given
        RegexIPv4 regexIPv4 = new RegexIPv4();

        //when
        boolean actual = regexIPv4.isIpAddress(input);

        //then
        assertThat(actual, is(false));
    }

    @Disabled
    @Test
    void shouldReturnTrueForEveryProvidedValidIPv4() {

        RegexIPv4 regexIPv4 = new RegexIPv4();

        for (int i = 0; i <= 255; i++) {
            for (int j = 0; j <= 255; j++) {
                for (int k = 0; k <= 255; k++) {
                    for (int l = 0; l <= 255; l++) {
                        //given
                        String input = i + "." + j + "." + k + "." + l;

                        //when
                        boolean actual = regexIPv4.isIpAddress(input);

                        //then
                        assertThat(actual, is(true));
                    }
                }
            }
        }
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"0.%s.0.0", "0.0.0", "0.%s.0.0", "0.%s.0.0"})
    void shouldReturnTrueForOneChangingNumberAndRestFixed() {

        RegexIPv4 regexIPv4 = new RegexIPv4();

        for (int i = 0; i <= 255; i++) {
            //given

            String format = "0.%s.0.0";

            String input = String.format(format, i);

            //when
            boolean actual = regexIPv4.isIpAddress(input);

            //then
            assertThat(actual, is(true));
        }
    }
}
//      After running such test please use @Disabled annotation to ignore it. In the annotation please provide
//      the real time it took to execute the test on you machine (it's about 30 minutes).
