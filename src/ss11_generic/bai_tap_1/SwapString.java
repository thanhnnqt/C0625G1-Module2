package ss11_generic.bai_tap_1;

import java.util.Stack;

public class SwapString<T> {
    public static void main(String[] args) {
        Stack<Character> mStack = new Stack<>();
        String str = "NguyeNhaThanh";
        for (char c : str.toCharArray()) {
            mStack.push(c);
        }
        int size = mStack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(mStack.pop());
        }
    }
}
