package algorithm.classCh;

import java.util.Scanner;

/*
  條件運算子結構:
  求某數的絕對值
  1.輸入:某一個整數資料(num)
  2.處理:result=num<0?-num:num;
  3.輸出:result
 */
public class Ch4_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		Scanner in = new Scanner(System.in);
		String num = in.next();
		int number = Integer.parseInt(num);
		int result = number < 0? -number:number;
		System.out.println(result);
		
		

	}

}
