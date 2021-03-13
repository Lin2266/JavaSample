package algorithm;

import java.util.Calendar;

//計算國文與英文的平均成績，並依照平均成績來求顯示「及格」(含60以上)與「不及格」(60以下)
public class Algorithm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int chineseScore=61;
		int englishScore=50;
		
		//float average = (chineseScore + englishScore) / 2; 只有型態轉型則會顯示55.0
		float average = (float)(chineseScore + englishScore) / 2; //型態跟值都有轉型則會顯示55.5
		System.out.println(average);
		if(average >= 60){
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}

	}

}
