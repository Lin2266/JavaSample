package Java.util.Stack1;


public class Stack5 {
	

	public static void main(String[] args) {
			int top =0;
			int max =4;
			int stk[] = new int[max];

			
			for(int i = 0;i<stk.length;i++) {
			stk[top]=i;
			System.out.println("push :stk[" + top + "]=" + stk[top]);
			top++;
			}

		

			 for(int i = 0;i<stk.length;i++) {
				 top--;
				System.out.println("pop :stk[" + top + "]=" + stk[top]);
				
			}


	}

}
