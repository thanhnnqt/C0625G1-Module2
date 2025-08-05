package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + i + " array1");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.println("Smallest number: " + min);
    }
}
