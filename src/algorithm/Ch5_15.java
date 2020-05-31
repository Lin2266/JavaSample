package algorithm;

//利用「泡沫排序法」將數列(3,7,1,6,8)「由小到大」進行排序，由左至右，由上至下，容易浪費時間在資料交換上

public class Ch5_15 {

	public static void main(String[] args) {
		// 宣告及初值設定
		int sum, i, j;
		int[] number1 = { 3, 7, 1, 8, 6 };
		int[] number2 = { 3, 7, 1, 8, 6 };

		for (j = 3; j >= 0; j--) {//控制「比較」次數(4,3,2,1)
			for (i = 0; i <=j; i++) {//控制「交換」次數(3+[i]+1)=4
				if (number1[i] > number1[i + 1]) {
					//進行交換過程,兩筆資料透過暫存去做交換動作
					sum = number1[i];//[0]給暫存
					number1[i] = number1[i + 1];//[1]指派給[0]
					number1[i + 1] = sum;//暫存的在指派給[1]
				}
			}
		}
		System.out.println("排序後的資料:");
		for (i = 0; i <= 4; i++) {
			System.out.print(number1[i]);
		}
		System.out.println();
		System.out.println("排序前的資料:");
		for (i = 0; i <= 4; i++) {
			System.out.print(number2[i]);
		}

	}

}
