package algorithm.sort;

public class Exchange1 {
	//交換排序
	//交換排序是最簡單的排序方法。從第一個數開始逐一和之後的數做比較，如果大於或是小於就交換。直到判斷至資料最尾端，
	//才會回到第二個數重新和之後的數做比較。如此反覆動作後，當已經沒有可以判斷的數時，整個排序法就run完了。 
	public static int[] exchange_sort(int[] original_arr,boolean isIncrease) {//交換排序（Exchange sort）		
		//將arr陣列位址指向新複製出來的ori_arr陣列。確保原始陣列資料不會改變。
		int[] arr =original_arr.clone();
		int len=arr.length;//取得陣列長度
		for(int i=0;i<len-1;i++) {//控制比較次數
			for(int k=i+1;k<len;k++) {//從索引值1開始
				//isIncrease遞增遞減判斷
				if((isIncrease&&arr[i]>arr[k]) || (!isIncrease&&arr[i]<arr[k])) {
					int buffer=arr[i];
					arr[i]=arr[k];
					arr[k]=buffer;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {		
		int[] num = {69,81,30,38,9,2,47,61,32,79};
		int[] arry = exchange_sort(num,false);//true從小排到大，false從大排到小
		for(int sortnum:arry) {
		System.out.print(sortnum + ",");
		}

	}

}
