package algorithm.stack;

public class Push3 {

	public static void main(String[] args) {
		int top =0;
		int max =4;
		int stk[] = new int[max];
		
		for(int i = 0;i<stk.length;i++) {
		stk[top]=i;
		System.out.println("push :stk[" + top + "]=" + stk[top]);
		top++;
		}

	}

}
