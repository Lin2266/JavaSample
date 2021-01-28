package Java.util.Arrays;

import java.util.Arrays;

public class Sort1 {
	
	public static void main(String[] args) {
		//利用Arrays帶有的排序方法快速排序
		int[] data= {5,4,2,4,9,1};
		System.out.print("排序前:");
		for(int i:data) {
		System.out.print(i+",");
		}
		System.out.println();
		
		Arrays.sort(data);//由小排到大
		System.out.print("排序後:");
		for(int i:data) {
			System.out.print(i+",");
		}

	}

}
