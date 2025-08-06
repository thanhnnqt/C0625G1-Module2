package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai7 {
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
        int total = 0;
        for (int i = 0; i < row; i++) {
            total += array[i][i];
        }
        for (int i = 0; i < col; i++) {
            total += array[array.length - 1 - i][i];
        }
        if (row % 2 != 0) {
            total -= array[(array.length - 1) / 2][(array.length - 1) / 2];
        }
        System.out.println("sum array = " + total);
    }
}
