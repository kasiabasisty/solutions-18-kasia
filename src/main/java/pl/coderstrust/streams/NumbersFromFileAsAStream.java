package pl.coderstrust.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersFromFileAsAStream {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "src/main/resources/1000.txt";
        String resultFilePath = "src/main/resources/1000_result.txt";
        ReadProcessAndWriteLinesToAFile(inputFilePath, resultFilePath);
    }

    public static void ReadProcessAndWriteLinesToAFile(String inputFilePath, String resultFilePath) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(inputFilePath))) {
            List<String> stringList = stream
                    .filter(line -> line.matches("(\\s*\\d+\\s*)+"))
                    .map(line -> {
                        Stream<String> stringStream = Arrays.stream(line.trim().split("\\s+"));
                        Stream<String> stringStream1 = Arrays.stream(line.trim().split("\\s+"));
                        return ((stringStream1.reduce("", (a, b) -> a + "+" + b)) + "=" + stringStream.mapToInt(Integer::parseInt).sum()).substring(1);
                    })
                    .collect(Collectors.toList());

            Files.write(Paths.get(resultFilePath), stringList);
        }
    }
}
