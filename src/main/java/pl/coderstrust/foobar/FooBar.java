package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {
    public static void main(String[] args) {
        printFooBar(100);
    }

    public static List<String> getFooBar(int number) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            String line = "";
            line += i;
            if (i % 3 == 0) {
                line += "Foo";
            }
            if (i % 5 == 0) {
                line += "Bar";
            }
            result.add(line);
        }
        return result;
    }

    public static void printFooBar(int number) {
        List<String> fooBar = getFooBar(number);
        fooBar.forEach(s -> System.out.println(s));
    }
}
