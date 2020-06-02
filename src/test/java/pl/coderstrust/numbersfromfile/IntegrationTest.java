package pl.coderstrust.numbersfromfile;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class IntegrationTest {

    @Test
    void processLine() throws IOException {
        // given
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(numbersProcessor, fileProcessor);

        // when
        processor.process("src/main/resources/1000.txt", "src/main/resources/1000_result.txt");

        // then

    }
}