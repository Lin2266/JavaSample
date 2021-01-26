package algorithm.classCh;

public class Ch5_11 {

	public static void main(String[] args) {
		// 如何把整個陣列的資料都指定為10
		int[] a = new int[10];
		for(int i =0;i < a.length;i++){
			//必須需用迴圈來控制，使數值10逐一的存到陣列中
			a[i] = 10;
			System.out.println("索引值[" + i +"] = " + a[i]);
		}

	}

}
