package ss11_generic.bai_option_1;

import java.util.Scanner;
import java.util.Stack;

public class ChangeStack<T> {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            int du = number % 2;
            wStack.push(du);
            number /= 2;
        }
        int size = wStack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(wStack.pop());
        }
    }
}
