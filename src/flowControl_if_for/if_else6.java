package flowControl_if_for;

import java.util.Scanner;

import Java.lang.String1.Tntern;
import Modifier.Final;
import Modifier.Static;

public class if_else6 {

	public static void main(String[] args) {
		//設計一個猜數字遊戲，由使用者輸入的猜測數字，予與回覆是否為
		//正確答案或數字太大，太小。
		int answer = (int)(Math.random() *100+1);
		Scanner scanner = new Scanner(System.in);
		
		
		for (;; ) {
			String string = "答對了";
			System.out.println("請輸入數字猜猜看:");
			int number = Integer.parseInt(scanner.nextLine());
				if (number != answer) {
					string = number > answer?"你猜的數字太大":"你猜的數字太小";
					System.out.println(string);
					continue;
				}
			System.out.println(string);
				break;
		}
				
		
	}

}
