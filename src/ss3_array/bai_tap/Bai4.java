package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter col");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter row " + i + " and col " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max <= array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Largest number: " + max);
    }
}
