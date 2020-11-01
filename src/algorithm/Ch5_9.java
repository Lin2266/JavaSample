package algorithm;

//依序輸入6位同學的成績到陣列中，並計算及輸出「總和」
public class Ch5_9 {

	public static void main(String[] args) {
		// 宣告
		int num = 0;
		int[] a = new int[6];
		a[0] = 60;
		a[1] = 70;
		a[2] = 80;
		a[3] = 85;
		a[4] = 90;
		a[5] = 100;
		//處理
		num += a[0] + a[1] + a[2] + a[3] + a[4] + a[5];
		//輸出
		System.out.println("6位同學的總和:" + num);
	}

}
