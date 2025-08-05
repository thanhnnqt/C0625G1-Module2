package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter X");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the index to insert X");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index > arrayNumber.length - 1) {
            System.out.println("Cannot insert X");
        } else {
            for (int i = 0; i < arrayNumber.length; i++) {
                if (index == i) {
                    for (int j = arrayNumber.length - 1; j > i; j--) {
                        arrayNumber[j] = arrayNumber[j - 1];
                    }
                    arrayNumber[i] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
    }
}
