package algorithm.classCh;

import java.util.Scanner;

/*
 依照平均成績判斷是「及格」與「不及可」兩種情況
 1.輸入:國文及英文成績
 2.處理:計算平均分數，並依平均分數判斷「及格」或「不及格」
 3.輸出:顯示兩種成績、平均成績及公佈結果
 */
public class Ch4_26 {

	public static void main(String[] args) {
		// 輸入
		System.out.println("請輸入國文成績:");
		Scanner in = new Scanner(System.in);
		String chiScore = in.next();
		System.out.println("請輸入英文成績:");
		String engScore = in.next();
		//處理
		int chi = Integer.parseInt(chiScore);
		int eng = Integer.parseInt(engScore);
		int average = (chi+eng)/2;
		String result;
		if(average >=60)
			result="及格";
		else
			result="不及格";
		//輸出
		System.out.println("國文:"+chi);
		System.out.println("英文:"+eng);
		System.out.println("平均"+average);
		System.out.println("結果:"+result);

	}

}
