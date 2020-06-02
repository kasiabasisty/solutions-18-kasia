package pl.coderstrust.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIPv4 {

    private static final Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])$");

    boolean isIpAddress(String input) {

        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
