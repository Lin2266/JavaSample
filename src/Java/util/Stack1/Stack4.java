package Java.util.Stack1;

public class Stack4 {

	public static void main(String[] args) {
		int top =0;
		int stk[] = new int[3];
		
		stk[top]= 1;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
		top++;
		stk[top]= 3;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
		top++;
		stk[top]=5;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
		
		
		System.out.println("pop :stk[" + top + "]=" + stk[top]);
		top--;
		System.out.println("pop :stk[" + top + "]=" + stk[top]);
		top--;
		System.out.println("pop :stk[" + top + "]=" + stk[top]);

	}

}
