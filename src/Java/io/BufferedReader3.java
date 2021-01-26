package Java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader3 {

	public static void main(String[] args) {
		//整數
		int num;
		System.out.println("請輸入整數 數字:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			num = Integer.parseInt(br.readLine());			
			System.out.println("您輸入的是數字 int num: "+num+"+2 = "+(num+2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
