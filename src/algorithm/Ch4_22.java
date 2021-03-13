package algorithm;

import java.util.Scanner;


/*選擇結構:
  Switch條件式(判斷及格不及格、奇數與偶數、成績等等
  1.只過濾某一種狀況
  2.執行狀況有兩種或兩種以上
  分類:單一選擇結構、雙重選擇結構、多重選擇結構
 */
public class Ch4_22 {

	//單一選擇結構(可省略兩個大括號)，若敘述不止一行時，就要用{}
	public static void main(String[] args) {
		System.out.println("請輸入成績:");
		Scanner s = new Scanner(System.in);
		String in = s.next();
		int score = Integer.parseInt(in);
		if(score >= 60)System.out.println("恭禧及格");//第1種方法
		if(score < 60){
			System.out.println("不及格");//第2種方法
		}
		
		//雙重選擇結構:條件只有二種情況
		String rain = "下雨";
		if(rain.equals("下雨")){
			System.out.println("開車上班");
		}else{
			System.out.println("騎摩托車上班");
		}
		
		
	}

}
