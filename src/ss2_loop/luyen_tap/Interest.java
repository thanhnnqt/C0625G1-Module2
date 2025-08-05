package ss2_loop.luyen_tap;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money");
        double money = scanner.nextDouble();
        System.out.println("Enter rate (%)");
        double rate = scanner.nextDouble();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest += money * (rate / 100) * month;
        }
        System.out.println(interest);
    }
}
