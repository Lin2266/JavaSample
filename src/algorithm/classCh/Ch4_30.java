package algorithm.classCh;

import java.util.Scanner;

/*
    求成績是否及格
  1.輸入:求一個整數成績(score)
  2.處理:result=score>=60?"及格":"不及格";
  3.輸出:result
 */
public class Ch4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		Scanner in = new Scanner(System.in);
		String inscore = in.next();
		int score = Integer.parseInt(inscore);
		String result = score >=60? "及格":"不及格";
		System.out.println(result);

	}

}
