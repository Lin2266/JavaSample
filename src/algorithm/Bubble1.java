package algorithm;


public class Bubble1 {

	public static void main(String[] args) {
		/*
		 * 氣泡排序法:相鄰兩者相互比較對調，並不會更改其原本排列的順序，所以是穩定排序法，
		 * 只需一個額外的空間，空間複雜度為最佳。
		 */
		
		int i,j,tmp;
		int data[] = {6,5,9,7,2,8};
		
		System.out.println("氣泡排序法:");
		System.out.print("原始資料為:");
		for(i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
		
		for(i=5;i >0;i--) {//掃描次數
			for(j=0;j<i;j++) {//比較、交換次數
				//比較相鄰兩數，如第一數較大則交換
				if(data[j] > data[j+1]) {
					tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
			
			//把各次掃描後的結果印出
			System.out.print("第" + (6-i) + "次排序後的結果是:");
			for(j=0;j<data.length;j++) {
				System.out.print(data[j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n排序後結果為:");
		for(i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}

	}

}
