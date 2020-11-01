package algorithm;

public class Ch5_20Selection {
	/*
	  選擇排序，由小排到大:
	  
	  選擇排序法的演算法(5組數字9,7,3,1,5，4回合)，由左至右
	  第1回合5組資料選取「最小資料1」和「第一個資料9」進行交換
	  第2回合4組資料選取「第二小的資料3」和「第一個資料7」進行交換
	  第3回合3組資料選取「第三小的資料5」和「第一個資料7」進行交換
	  第4回合2組資料選取「第四小的資料7」和「第一個資料9」進行交換
	 */
	
	void SelSort(int A[], int n) {
		int i,j,min,temp;
		//控制n-1個回合
		for(i=0;i < n-1;i++) {
			min=i;
			for(j=i+1;j<=n;j++) {
				if(A[j] < A[min]){
					min=j;
				}
				//相鄰兩個的資料交換位置
				temp = A[i];
				A[i] = A[min];
				A[min] = temp;
			}
		}
	}
	

	public static void main(String[] args) {
	

	}

}
