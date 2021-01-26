package algorithm.classCh;

public class Ch5_15Bubble {

	public static void main(String[] args) {
		/*利用「泡沫排序法」將數列(3,7,1,6,8)「由小到大」進行排序，由左至右，由上至下，容易浪費時間在資料交換上
		  兩個相鄰的資料相互比較，若次序不對，兩資料互換
		*/
		
		// 宣告及初值設定
		int i,j,temp;
		int NumArray1[] = {3,7,1,6,8};
		int NumArray2[] = {3,7,1,6,8};
		
		for(i=3;i >= 0;i--) {//控制「比較」次數
			for(j=0;j <= i;j++) {
				if(NumArray2[j] > NumArray2[j+1]) {//控制「交換」次數
					//進行交換過程
					temp = NumArray2[j];
					NumArray2[j] = NumArray2[j+1];
					NumArray2[j+1] = temp;
				}				
			}
		}
		
		System.out.println("排序前的資料:");
		for(i=0;i<NumArray1.length;i++) {
			System.out.print(NumArray1[i]);
		}
		
		
		System.out.println("\n排序後的資料:");
		for(i=0;i<NumArray2.length;i++) {
			System.out.print(NumArray2[i]);
		}

	}

}
