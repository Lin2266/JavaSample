package algorithm;

public class Ch5_12 {

	public static void main(String[] args) {
		//利用設定初值設定6科成績
		//宣告及初值設定
		int[] A = {60,70,80,85,90,100};
		int i,sum=0;
		//處理
		for(i=0;i<A.length;i++) {
			sum+=A[i];
			//輸出
			System.out.println("sum=" + sum);
		}

	}

}
