package algorithm.sort;

public class Selection1 {
	//選擇排序
	//選擇排序法也是很簡單的排序方法，跟交換排序法類似。不過它的陣列資料交換次數比交換排序法還要少很多。
	//它的作法同樣是從[索引0]開始向右判斷之後索引的值。與交換排序法不同的是，選擇排序法是取出其右段的最小值或最大值
	//(視遞增遞減而定)和[索引0]的值互相對換。
	public static int[] selection_sort(int[] original_data,boolean isIncrease) {
		int[] data=original_data.clone();
		int len = data.length;
		for(int i=0;i<len-1;i++) {
			int temp=i;//儲存最大或是最小值所指向的索引位置
			for(int k=i+1;k<len;k++) {
				if((isIncrease&&data[temp]>data[k]) || (!isIncrease&&data[temp]<data[k])) {
					//將要交換的索引值指給temp
					temp=k;
				}
				if(i!=temp) {//若索引未改變，則交換陣列值
					//交換的temp值(最小或最大)，跟arr[i]交換，最小或最大就跟前面的交換
					//邊比較邊交換
					int buffer=data[i];
					data[i]=data[temp];
					data[temp]=buffer;
				}
			}
		}
		return data;
	}
	public static void main(String[] args) {
		int[] num = {69,81,30,38,9,2,47,61,32,79};
		int[] data = selection_sort(num,true);//true從小排到大，false從大排到小
		for(int sortnum:data) {
		System.out.print(sortnum + ",");
		}
	}

}
