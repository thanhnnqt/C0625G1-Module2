package luyen_tap;

import case_study.entity.Employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern regexId = Pattern.compile("\\d{9}|\\d{12}");
        Pattern regexName = Pattern.compile("^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$");
        Matcher matcher = regexId.matcher("123456789");
        System.out.println(matcher.matches());
    }
}
