package ss11_generic.bai_tap_1;

import java.util.Stack;

public class SwapArray<T> {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        Stack<Integer> mStack = new Stack<>();
        mStack.push(1);
        mStack.push(2);
        mStack.push(3);
        mStack.push(4);
        mStack.push(5);
        int size = mStack.size();
        for (int i = 0; i < size; i++) {
            wStack.push(mStack.pop());
        }
        System.out.println(wStack);
    }
}
