package pl.coderstrust.numbersfromfile;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {

    public String processLine(String line) {
        line = line.trim().replaceAll("(\\s+)", "+");
        String[] intParts = line.split("\\+");
        List<Integer> myInts = new ArrayList<>();

        for (String intPart : intParts) {
            myInts.add(Integer.parseInt(intPart));
        }

        int sum = myInts.stream().mapToInt(Integer::intValue).sum();
        return line + "=" + sum;
    }
}
