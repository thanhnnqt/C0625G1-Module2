package ss11_generic.bai_option_2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckString<T> {
    public static void main(String[] args) {
        Stack<Character> stackString = new Stack<>();
        Queue<Character> queueString = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stackString.push(str.charAt(i));
        }
        System.out.println(stackString);
        for (int i = 0; i < str.length(); i++) {
            queueString.add(str.charAt(i));
        }
        System.out.println(queueString);
        boolean check = true;
        while (!stackString.empty()) {
            if (!stackString.pop().equals(queueString.poll())) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Chuỗi vừa nhập là Palindome" : "Chuỗi vừa nhập không phải Palindome");
    }
}
