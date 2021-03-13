package algorithm;

public class Ch5_5 {

	public static void main(String[] args) {
		//宣告
		int[] a = new int[5];
		//處理
		for(int i=0;i<=4;i++){//利用「迴圈結構」+「陣列」可以快速的「輸入」資料
			//輸入
			a[i]=i*2+1;
		}
	
		for(int i=0;i<=4;i++){//利用「迴圈結構」+「陣列」可以快速的「輸出」資料
			//輸出
			System.out.println(a[i]);
		}

	}

}
