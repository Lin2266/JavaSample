package Java.util.Stack1;

public class Stack3 {

	int stk[] = new int[1];
	 void push(int data) {
		
		for(int i = 0;i<stk.length;i++) {
		stk[i]=data;
		System.out.println("push :stk[" + i + "]=" + stk[i]);
		}
	}
	
	 void pop() {
		 for(int i = 0;i<stk.length;i++) {
			System.out.println("pop :stk[" + i + "]=" + stk[i]);
		}
	}
	public static void main(String[] args) {
		Stack3 stack = new Stack3();
		stack.push(10);
		stack.pop();

	}

}
