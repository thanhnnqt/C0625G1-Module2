package ss2_loop.bai_tap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.println("-----Menu-----\n 1. Print the rectangle \n 2. Print the square triangle bottom-left" +
                    "\n 3. Print square triangle top-left" +
                    "\n 4. Print isosceles triangle");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter a row and col");
                    int row = scanner.nextInt();
                    int col = scanner.nextInt();
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter a number");
                    int number = scanner.nextInt();
                    for (int i = 0; i <= number; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter a number");
                    int number1 = scanner.nextInt();
                    for (int i = number1; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Enter third number");
                    int number2 = scanner.nextInt();
                    for (int i = 1; i <= number2; i++) {
                        for (int j = number2; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    check = false;
            }
        }
    }
}
