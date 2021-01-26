package algorithm.stack;

import java.util.Scanner;

public class Stack_function {
	static int top =0;
	static int Max=1;
	static int stack[]=null;
	
	static  void push(int pushValue){	
			stack[top]=pushValue;			
			System.out.println("目前push的資料 :stack[" + top + "]=" + stack[top]);
			top++;		
	}

	 static String pop(){	
		 return "目前pop的資料 :stack[" + --top + "]=" + stack[top];
	}

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			System.out.println("請輸入stack的最大容量:");
				Max = in.nextInt();
				stack = new int[Max];
			while(true) {
				System.out.println("請輸入要執行的動作:0.exit 1.push, 2.pop");
				int select = in.nextInt();
				if(select == 0) {
					System.out.println("exit stack");
					break;
				}
				switch(select){
					case (1):						
						System.out.println("請輸入要push的值:");
						int pushValue =	in.nextInt();
						push(pushValue);
						if(top==Max) System.out.println("\n" + "*** stack容量已滿 ***");						
						break;
					case (2):
						System.out.println(pop());
						if(top == 0) System.out.println("\n" + "*** stack已沒資料 ***");
						break;
					default:
						System.out.println("\n" + "*** 請輸入正確的執行動作 ***" + "\n");
						break;						
				}
				System.out.println("stack總容量[" + Max+ "],容量還剩:" + (Max - top));
				System.out.println("\n" + "==============================================");								
			}
				in.close();					
	}	


}
