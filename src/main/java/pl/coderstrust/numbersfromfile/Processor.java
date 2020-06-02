package pl.coderstrust.numbersfromfile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {
    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String filePath, String resultFilePath) throws IOException {
        List<String> linesFromFile = fileProcessor.readLinesFromFile(filePath);
        List<String> resultLines = new ArrayList<>();
        for (String line : linesFromFile) {
            try (Scanner scanner = new Scanner(line)) {
                if (line.matches("(\\s*\\d+\\s*)+")) {
                    resultLines.add(numbersProcessor.processLine(line));
                }
            }
        }
        fileProcessor.writeLinesToFile(resultLines, resultFilePath);
    }
}
