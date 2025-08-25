package ss19_string.bai_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{2}-0\\d{9}");
        System.out.println("Enter phone number");
        String number = scanner.nextLine();
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.matches());
        System.out.println(matcher.matches() ? "Số điện thoại hợp lệ" : "Số điện thoại không hợp lệ");
    }
}
