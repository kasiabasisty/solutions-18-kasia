package pl.coderstrust.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersFromFileAsAStream {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "src/main/resources/1000.txt";
        ReadProcessAndWriteLinesToAFile(inputFilePath);
    }

    public static void ReadProcessAndWriteLinesToAFile(String inputFilePath) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(inputFilePath))) {
            stream
                    .filter(line -> line.matches("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        }
    }
}

   /* The easy way which is proven to work is as follows:
        1) Use Files.lines() to read file as stream
        2) Filter out lines which are not matching pattern "only whitespaces and numbers"
        3) Use map operation which will inside split the line by whitespace and convert that to stream (Arrays.stream() can be useful, then use reduce operation to get numbers concatenated with "+", then use the same trick as above to calculate the sum of numbers and concatenate it with above string)
        4) Write each line to a file - just using PrintWriter and forEach or use Files.write() method
    */