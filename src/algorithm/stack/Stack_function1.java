package algorithm.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack_function1 {
	static int top =0;
	static ArrayList<Integer> stk = new ArrayList<>();
	
	static  void push(int pushValue){
			stk.add(pushValue);					
			System.out.println("push :stk[" + top + "]=" + stk.get(top));
			top++;		
	}

	 static String pop(){	
			 top--;
		 return "pop :stk[" + top + "]=" + stk.get(top);
	}

	public static void main(String[] args) {

			int stackFull;
			Scanner in = new Scanner(System.in); 
			System.out.println("請輸入stack的最大容量");
			int stackMax =	in.nextInt();
			stackFull = stackMax;
			while(true) {					
				System.out.println("請輸入1:push, 2:pop, 0:離開");
				int select = in.nextInt();				
				if(select == 0) {
					System.out.println("離開stack");
					break;
				}
				switch(select){
					case (1):
						System.out.println("請輸入要push的值:");
						int pushValue =	in.nextInt();
						push(pushValue);
						stackFull--;						
						break;
					case (2):
						System.out.println(pop());	
						stackFull++;
						break;
					default:
						break;							
				}		
				if(stackFull < 0 || stackFull > stackMax) {
					throw new ArrayIndexOutOfBoundsException("容量已超出");					
				}
					System.out.println("stack總容量[" + stackMax+ "]容量還剩:" + stackFull);
					if(stackFull==0) System.out.println("stack容量已滿");
					if(stackMax == 0) System.out.println("stack容量已空");
					System.out.println("\n" + "===================================");					
			}
					in.close();
			
	}	


}
