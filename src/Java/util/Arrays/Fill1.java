package Java.util.Arrays;

import java.util.Arrays;

public class Fill1 {

	public static void main(String[] args) {
		/* 
		public static void fill(Object[] a,  int fromIndex,  
				 int toIndex,   Object val)
		 將指定的 Object 引用分配給指定 Object 陣列指定範圍中的每個元素。
		 填充的範圍從索引 fromIndex（包括）一直到索引 toIndex（不包括）。
		 （如果 fromIndex==toIndex，則填充範圍為空。）
		 
		 引數：
		a - 要填充的陣列
		fromIndex - 要使用指定值填充的第一個元素的索引（包括）
		toIndex - 要使用指定值填充的最後一個元素的索引（不包括）
		val - 要儲存在陣列的所有元素中的值
		丟擲：
		IllegalArgumentException - 如果 fromIndex > toIndex
		ArrayIndexOutOfBoundsException - 如果 fromIndex < 0 或 toIndex > a.length
		ArrayStoreException - 如果指定值不是可儲存在指定陣列中的執行時型別
		 */
		
		boolean[] a = new boolean[5];
		Arrays.fill(a, true);
		for(boolean aa: a) {
			System.out.println(aa);
			//結果 a1[] = {true,true,true,true,true};
		}

	}

}
