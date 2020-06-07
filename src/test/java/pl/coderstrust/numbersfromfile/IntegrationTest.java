package pl.coderstrust.numbersfromfile;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IntegrationTest {

    @Test
    void shouldReadProcessAndWrite() throws IOException {
        // given
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(numbersProcessor, fileProcessor);
        List<String> expected = new ArrayList<>();
        expected.add("0+5+76+23525+2346+2+56=26010");
        expected.add("2+3+5+7+11+13+17+19+23+29=129");

        // when
        processor.process("src/test/resources/1000.txt", "src/test/resources/1000_result.txt");

        // then
        List<String> actual = fileProcessor.readLinesFromFile("src/test/resources/1000_result.txt");
        assertThat(actual, is(expected));
    }
}
