package Java.util.Stack1;

public class Stack2 {

	static void push(int data) {
		int top=0;
		int max=1;
		int stk[] = new int[max];
		stk[top]=data;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
	}

	public static void main(String[] args) {
		
		push(10);

	}
}
