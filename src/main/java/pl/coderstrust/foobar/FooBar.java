package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {
    public static void main(String[] args) {
        printFooBar(100);
    }

    public static List<String> getFooBar(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can't be lower than zero!");
        }
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            sb.append(i);
            if (i % 3 == 0) {
                sb.append("Foo");
            }
            if (i % 5 == 0) {
                sb.append("Bar");
            }
            result.add(sb.toString());
            sb.setLength(0);
        }
        return result;
    }

    public static void printFooBar(int number) {
        List<String> fooBar = getFooBar(number);
        fooBar.forEach(s -> System.out.println(s));
    }
}
