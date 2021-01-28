package algorithm.sort;

public class Bubble3 {
	
	public static int[] bubble_sort(int[] original_data,boolean isIncrease) {
		int temp=0,total=1;
		boolean flag=false;
		int[] data=original_data.clone();
		for(int i=data.length-1;i>0;i--) {
			flag=true;
			for(int k=0;k<i;k++) {
				if((isIncrease&&data[k]>data[k+1]) || (!isIncrease&&data[k]<data[k+1])) {
					temp = data[k];
					data[k] = data[k+1];
					data[k+1] = temp;
					flag=false;
					System.out.println("交換次數:"+total++);
				}
			}
			if(flag==true)break;
		}
		return data;
	}

	public static void main(String[] args) {
		int[] num = {69,81,30,38,9,2,47,61,32,79};
		int[] data = bubble_sort(num,true);//true從小排到大，false從大排到小
		for(int sortnum:data) {
		System.out.print(sortnum + ",");
		}

	}

}
