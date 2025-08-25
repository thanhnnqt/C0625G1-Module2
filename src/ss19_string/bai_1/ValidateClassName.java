package ss19_string.bai_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name");
        String className = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[CAP]\\d{4}[GHIK]$");
        Matcher matcher = pattern.matcher(className);
        System.out.println(matcher.matches());
        System.out.println(matcher.matches() ? "Tên hợp lệ" : "Tên không hợp lệ");
    }
}
