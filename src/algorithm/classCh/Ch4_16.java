package algorithm.classCh;

import java.util.Scanner;

//循序結構
//攝氏轉換華氏:轉換公式 F=C*9/5+32
public class Ch4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入攝氏C:");
		String in = s.next();
		
		int c = Integer.parseInt(in);
		int f = c*9/5+32;
		System.out.println("攝氏:" + c + "\n" + "華氏" + f);
		
	}

}
