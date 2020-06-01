package pl.coderstrust.numbersfromfile;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProcessorTest {

    @Mock
    NumbersProcessor numbersProcessor;

    @Mock
    FileProcessor fileProcessor;

    @InjectMocks
    Processor processor;

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException {
        // given
        when(fileProcessor.readLinesFromFile("file.txt")).thenReturn(Arrays.asList("1 2 3", "4 5 6"));
        when(numbersProcessor.processLine("1 2 3")).thenReturn("1+2+3=6");
        when(numbersProcessor.processLine("4 5 6")).thenReturn("4+5+6=15");

        // when
        processor.process("file.txt", "result.txt");

        // then
        verify(fileProcessor).readLinesFromFile("file.txt");
        verify(numbersProcessor).processLine("1 2 3");
        verify(numbersProcessor).processLine("4 5 6");
        verify(fileProcessor).writeLinesToFile(Arrays.asList("1+2+3=6", "4+5+6=15"), "result.txt");
    }
}


// For test purpose you should use Mockito framework (for mocking dependencies and unit testing particular
// classes in isolation) and JUnitParams library (for providing more than one different input data to your tests
// without duplicating tests). In our case you should mock NumbersProcessor and FileProcessor.

//Once you have the unit tests then please also write an integration test which is checking the full flow
// of application - getting the input file and returning the processed output file.