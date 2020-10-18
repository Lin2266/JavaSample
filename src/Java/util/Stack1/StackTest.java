package Java.util.Stack1;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		System.out.println("stack:"+stack.push(1));
		System.out.println("stack:"+stack.push(2));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
