package pl.coderstrust.numbersfromfile;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.util.List;

class NumbersProcessorTest {

    @ParameterizedTest
    @MethodSource("")
    void shouldReturnProcessedLine() {
        //given
        File file = new File("sample.txt");

        try {
            List<String> contents = FileUtils.readLines(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //when

        //then

    }
}