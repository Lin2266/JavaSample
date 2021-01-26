package algorithm.classCh;

import java.util.Scanner;

/*循序結構:
    由左至右逐一執行的拼圖程式
  1.不需進行判斷的情況
  2.沒有重複撰寫的情況
 */
//計算國文跟英文的平均分數
public class Ch4_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入國文成績");
		String st = s.next();
		System.out.println("請輸入英文成績");
		String st1 = s.next();
		
		int chi = Integer.parseInt(st);
		int eng = Integer.parseInt(st1);
		int average = (chi+eng)/2;
		
		System.out.println("國文:" + chi + "\n" + "英文:" + eng +
				"\n" + "平均:" + average);
		
		

	}

}
