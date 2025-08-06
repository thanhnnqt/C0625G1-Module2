package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Nguyen Nhat Thanh";
        System.out.println("Enter X");
        String x = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (x.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("number of appearances: " + count);
    }
}
