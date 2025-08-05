package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array1");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter length array2");
        int n2 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        int[] array3 = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element " + i + " array1");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element " + i + " array2");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }
        for (int i = n1; i < n1 + n2; i++) {
            array3[i] = array2[i - n1];
        }
        System.out.println("array1:");
        System.out.println(Arrays.toString(array1));
        System.out.println("array2:");
        System.out.println(Arrays.toString(array2));
        System.out.println("array3:");
        System.out.println(Arrays.toString(array3));
    }
}
