package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter X");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayNumber.length; i++) {
            if (number == arrayNumber[i]) {
                System.out.println("Index X: " + i);
                for (int j = i; j < arrayNumber.length - 1; j++) {
                    arrayNumber[j] = arrayNumber[j + 1];
                }
                arrayNumber[arrayNumber.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
    }
}
