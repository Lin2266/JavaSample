package flowControl_if_for;

import java.util.Scanner;


public class If_else3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = new String("你輸入的是正數或0");
		
		System.out.println("請輸入一個整數：");
		int i = Integer.parseInt(sc.nextLine());
		if (i<0) 
			s1 = "你輸入的是負數";	//多利用同變數設值
		System.out.println(s1);
		
	}

}
