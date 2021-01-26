package Java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader4 {

	public static void main(String[] args) {
		// 浮點數
		float num;
		System.out.println("請輸入浮點數字:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			num = Float.parseFloat(br.readLine());
			System.out.println("您輸入的是浮點數字 float num: " + num + " + 2 = " + (num+2) );
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
