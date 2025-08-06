package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai6 {
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
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int total = 0;
        System.out.println("Enter column to sum");
        int c = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < col; i++) {
            total += array[i][c];
        }
        System.out.println("Sum column " + c + ": " + total);
    }
}
