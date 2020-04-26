package pl.coderstrust.numbersfromfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileProcessor {

    public List<String> readLinesFromFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public void writeLinesToFile(List<String> resultLines, String resultFilePath) throws IOException {
        Files.write(Paths.get(resultFilePath), resultLines);
    }
}
