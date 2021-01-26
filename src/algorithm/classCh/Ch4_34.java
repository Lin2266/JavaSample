package algorithm.classCh;

import java.util.Scanner;

/*
  多種選擇結構:逐一比對結構(if-else if-else)
 使用於「條件式」的情況是兩種以上時
  計算國文(chi)與英文(eng)成績兩科的平均成績(average)，並依平均成績來分等第。
  1.輸入:國文(chi)與英文(eng)成績
  2.處理:計算平均成績(average)並且依平均成績來分等第，條件如下
  (1)60分以下為:E等
  (2)60~69分為:D等
  (3)70~79分為:C等
  (4)80~89分為:B等
  (5)90(含)分以上為:A等
  3.輸出:平均成績與等第的結果 
 */
public class Ch4_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入國文成績:");
		Scanner inc = new Scanner(System.in);
		String inChi = inc.next();
		System.out.println("請輸入英文成績:");
		Scanner ine = new Scanner(System.in);
		String inEng = ine.next();
		
		int chi = Integer.parseInt(inChi);
		int eng = Integer.parseInt(inEng);
		int average = (chi+eng)/2;
		
		String result;
		if(average < 60 && average >= 0){
			result="E等";
		}
		else if(average >= 60 && average <= 69){
			result="D等";
		}
		else if(average >= 70 && average <= 79){
			result="C等";
		}
		else if(average >= 80 && average <= 89){
			result="B等";
		}
		else{
			result="A等";
		}
		
		System.out.println("國文:" + chi);
		System.out.println("英文:" + eng);
		System.out.println("平均:" + average);
		System.out.println("結果:" + result);
		

	}

}
