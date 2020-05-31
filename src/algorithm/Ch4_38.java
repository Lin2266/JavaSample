package algorithm;

import java.util.Scanner;

/*
  多種選擇結構:逐一比對結構(Switch Case)
 跟if-else結構具有相同的功能，但條件很多時，使用if-else就很容易混亂了，使用於多種還擇情況，程式較為精簡直可讀性很高。
 當switch(資料或運算式)的值符合常數1時，則執行敘述區塊1，符合常數2時，則執行敘述區塊2，直到遇到break敘述才會離開switch，
 如果所有的敘述都不能符合時，則會執行default敘述區塊。
 switch後面的運算式可以是整數或字串資料，case後面的常數可以是整數或字串資料。
 
 
 */
public class Ch4_38 {

	public static void main(String[] args) {
		// 題目如Ch4_34
		System.out.print("請輸入國文成績:");
		Scanner inChi = new Scanner(System.in);
		String chinese = inChi.next(); 
		System.out.print("請輸入英文成績:");
		Scanner inEng = new Scanner(System.in);
		String english = inEng.next();
		
		int chi = Integer.parseInt(chinese);
		int eng = Integer.parseInt(english);
		int average = (chi+eng)/2;
		String result;
		switch(average/10){//int整數不會有小數點，但小數點都包含在整數裡面做判斷
		case 10:
		case 9:
			result="A";
			break;
		case 8:
			result="B";
			break;
		case 7:
			result="C";
			break;
		case 6:
			result="D";
			break;
		default:
			result="E";
		}
		
		System.out.println("國文:" + chi);
		System.out.println("英文:" + eng);
		System.out.println("平均:" + average);
		System.out.println("結果:" + result);

	}

}
