package algorithm.sort;

public class Selection2 {
	
	public static int[] selection_sort(int[] original_data,boolean isIncrease) {
		int temp=0;
		int[] data=original_data.clone();
		for(int i=0;i<data.length-1;i++) {
			temp=i;
			for (int k=i+1;k < data.length;k++) {
				if((isIncrease&&data[temp]>data[k]) || (!isIncrease&&data[temp]<data[k])) {
					temp=k;
				}
			}
			//比較完拿到最小或最大值在做一次交換，交換次數比範例1少
			if(temp!=i) {
				int buffer=data[i];
				data[i]=data[temp];
				data[temp]=buffer;
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
