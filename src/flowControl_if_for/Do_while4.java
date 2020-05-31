package flowControl_if_for;

import java.util.Scanner;

public class Do_while4 {
//如何應用，"猜猜我的年齡"
	public static void main(String[] args) {
		int answerOfAge = 18;//年齡回答
		//宣告Scanner並建立輸入輸出(I/O)物件
		Scanner s = new Scanner(System.in);//System.in代表輸入裝置是鍵盤，.out是輸出其預設裝置是螢幕
		System.out.println("請猜猜我的年齡？");
		do{
			System.out.println("請輸入一個數字");
			int guessOfAge = s.nextInt();//猜猜年齡
			if(guessOfAge == answerOfAge){
				System.out.println("恭喜你答對了！");
				break;
			}else if(guessOfAge > answerOfAge){
				System.out.println("你猜得太大囉！");
				
			}else{
				System.out.println("你猜太小囉！");
			}
			
		}while(true);

	}

}
