package pl.coderstrust.numbersfromfile;

import java.util.ArrayList;

public class NumbersProcessor {

    public String processLine(String line) {
        line = line.trim().replaceAll("(\\s+)", "+");
        String[] intParts = line.split("\\+");
        ArrayList<Integer> myInts = new ArrayList<>();

        for (String intPart : intParts) {
            myInts.add(Integer.parseInt(intPart, 10));
        }
        int sum = myInts.stream().mapToInt(Integer::intValue).sum();
        line = line + "=" + sum;
        return line;
    }
}
