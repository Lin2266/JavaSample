package algorithm;

public class Ch5_8 {

	public static void main(String[] args) {
		// 輸入3筆資料到A陣列中(10，20，30)
		int[] a = new int[3];
		for(int i =0;i<a.length;i++){
			a[i] = (i+1)*10;
			System.out.print(a[i] + ",");
		}
		
	}

}
