package algorithm;

import java.util.Scanner;

/*
 求絕對值
 1.輸入:某一個整數資料
 2.處理:判斷此整數是否大於0，當小於0時，則該數乘於-1，否則就會直接顯示
 3.輸出:正整數
 */
public class Ch4_28 {

	public static void main(String[] args) {
		System.out.println("請輸入一個整數:");
		Scanner in = new Scanner(System.in);
		String number = in.next();
		int num = Integer.parseInt(number);
		if(num<0)
			num=(-1)*num;
		else
			num=num;
		System.out.println(number + "=" + num);

	}

}
