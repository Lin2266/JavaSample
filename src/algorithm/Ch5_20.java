package algorithm;

/*選擇排序法的演算法(5組數字9,7,3,1,5，4回合)，由左至右
  第1回合5組資料選取「最小資料1」和「第一個資料9」進行交換
  第2回合4組資料選取「第二小的資料3」和「第一個資料7」進行交換
  第3回合3組資料選取「第三小的資料5」和「第一個資料7」進行交換
  第4回合2組資料選取「第四小的資料7」和「第一個資料9」進行交換
 */
public class Ch5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,7,3,1,5};
		int i, j, min, temp, len = arr.length;
		for (i = 0; i < len - 1; i++) {
			min = i;//未排序序列中最小数据数组下标
			for (j = i + 1; j < len; j++)//在未排序元素中继续寻找最小元素，并保存其下标
				if (arr[min] > arr[j]){
					min = j;
					}
			temp = arr[min]; //将最小元素放到已排序序列的末尾
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println();
		for(i = 0;i < arr.length;i++){
			System.out.print(arr[i]);
		}

	}

}
