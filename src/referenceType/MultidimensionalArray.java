package referenceType;
//多維陣列
public class MultidimensionalArray {
/*
 Java中所謂的多維陣列(Multidimensional Array)就是陣列中的陣列(array of array)，利用多個一維陣列來模擬多維陣列的
 情境，也因此在多維陣列中每一個維度(大小size)可以不相同。
 
 *陣列不被允許重新定義大小，如果要在程式中調整陣列大小，必須再用new關鍵字重新創造陣列，重新宣告後，原來的陣列仍會
  保留在記憶體中，只是物件參考值會指向新new出來的物件陣列實體，而舊的陣列物件實體將會被「資源回收機制」所回收。
 
 Java中以陣列中的陣列所模擬出的多維陣列可分為對稱型陣列和非對稱型陣列二種型態。
 
 *[]怎麼放？[]只要不要放在型態前面跟=後面，兩者之間[]怎麼放都可以，int型態([]分開或一起都可以)= 等於 new..
 */
	public static void main(String[] args) {
		//對稱型陣列,合法宣告的3x3二維陣列
		int i21[][] = new int[3][3];
		int[] i22[] = new int[3][3];
		int[][]i23 = new int[3][3];
		
		//2X3二維陣列
		int i24 [][] = new int[2][3];
		
		//2X3X5三維陣列
		int i31[][][] = new int[2][][];//多維陣列第一個[]一定要宣告長度，後面可以不宣告
		int[] i32[][] = new int[2][3][];
		int[][] i33[] = new int[2][3][5];
		int[][][] i3 = new int[2][3][5];
		
		//非對稱型陣列(Non-Rectangular)
		int in1[][] = new int[2][];
		//一維陣列的維度[0]跟[1]要各自在宣告第二維時各自給的長度不一樣時第二維可以不宣告長度
		in1[0]=new int[3];
		in1[1]=new int[1];
		
		//設定第一維索引[0]裡的第二維索引[0]的值
		in1[0][0]=1;
		//陣列不被允許重新定義大小，要更改大小，必須要用new重新定義大小，會建立新的記憶體跟參考值，舊的會被回收
		in1[1]=new int[4];
		System.out.println(in1[1].length);
	}

}
