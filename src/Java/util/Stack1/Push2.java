package Java.util.Stack1;

public class Push2 {

	public static void main(String[] args) {
		int top =0;
		int max =3;
		int stk[] = new int[max];
		
		stk[top]= 1;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
		top++;
		stk[top]= 3;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
		top++;
		stk[top]=5;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
	}

}
