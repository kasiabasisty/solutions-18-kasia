package pl.coderstrust.numbersfromfile;

import java.io.IOException;

public class NumbersFromFile {

    public static void main(String[] args) throws IOException {

        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(numbersProcessor, fileProcessor);

        processor.process("src/main/resources/1000.txt", "src/main/resources/1000_result.txt");
    }
}
