package algorithm;

import java.util.Scanner;

public class ThanSize {
	
	public static void main(String[] args) {
		//比大小
		int a;
		int b;
		System.out.println("請輸入兩個數值比較大小:");
		Scanner	in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		if(a>b)System.out.printf("a(%d)比b(%d)大",a,b);
		else if (a<b) System.out.printf("b(%d)比a(%d)大",b,a);
		else System.out.println("a跟b相等");

	}

}
