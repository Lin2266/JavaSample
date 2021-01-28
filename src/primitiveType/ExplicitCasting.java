package primitiveType;

public class ExplicitCasting {

	public static void main(String[] args) {
		//計算國文與英文的平均成績，並依照平均成績來求顯示「及格」(含60以上)與「不及格」(60以下)
		 
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
