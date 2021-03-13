package algorithm;

import java.util.Scanner;

/*
 判斷「奇數或偶滿教」的程式
 1.輸入某一個整數資料
 2.處理:判斷此整數除以2，餘數是否為0
 3.輸出:當餘數為0時，則顯示「偶數」，否則顯示「奇數」
 */
public class Ch4_27 {

	public static void main(String[] args) {
		// 輸入
		System.out.println("請輸入一個整數:");
		Scanner in = new Scanner(System.in);
		String number = in.next();
		//處理
		int num = Integer.parseInt(number);
		String result;
		if(num%2==0)
			result="偶數";
		else
			result="奇數";
		//輸出
		System.out.println("整數:" + num +" 為" + result);	
	}

}
