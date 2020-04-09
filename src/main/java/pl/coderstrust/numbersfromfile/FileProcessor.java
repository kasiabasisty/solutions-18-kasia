package pl.coderstrust.numbersfromfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileProcessor {

    //(responsible for read/write operations on file),
    List<String> list = readLinesFromFile("src/test/resources/1000.txt");


    public List<String> readLinesFromFile(String fileName) throws IOException {
        File file = new File("src/test/resources/1000.txt");

        BufferedReader in = new BufferedReader(new FileReader(file));

        int i;
        while ((i = in.read()) != -1) {
            System.out.print((char) i);
        }
        

        return null;
    }

//                // read line by line
//                String line;
//                while ((line = br.readLine()) != null) {
//                    System.out.println(line);
//                }
//
//            } catch (IOException e) {
//                System.err.format("IOException: %s%n", e);
//            }
//        }
//
//    }


    public void writeLinesToFile(List<String> resultLines, String resultFileName) {


    }
}
