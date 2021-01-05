package Java.util.Arrays;

import java.util.Arrays;

public class Fill2 {

	public static void main(String[] args) {
		String[] a = new String[6];
		Arrays.fill(a,"Hello");
		for(String aa: a) {
			System.out.println(aa);
			//結果是 a[] = {Hello,Hello,Hello,Hello,Hello,Hello};
		}
		System.out.println("===================");
		//第一個引數指操作的陣列，第二個和第三個指在該陣列的某個區域內插入第四個引數
		Arrays.fill(a,3, 5,"Wold");
		for(String aa2:a) {
			System.out.println(aa2);
			//結果是 a[] = {Hello,Hello,Hello,World,World,Hello};
		}

	}

}
