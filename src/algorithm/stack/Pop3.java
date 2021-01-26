package algorithm.stack;

public class Pop3 {

	public static void main(String[] args) {
		int top =2;
		int stk[] = {1,3,5};
		for(int i = 0;i<stk.length;i++) {			 
			System.out.println("pop :stk[" + top + "]=" + stk[top]);
			top--;
		}
	}

}
