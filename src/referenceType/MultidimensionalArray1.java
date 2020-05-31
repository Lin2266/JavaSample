package referenceType;
//多維陣列的初始化內容宣告
public class MultidimensionalArray1 {

	public static void main(String[] args) {
		int mutiInt[][] = new int[][]{{1,2},{1,2,3}};//new int[][]可省略
		int mutiInt1[][] = {{1,2},{1,2,3}};//分別以括號{{}}來表示不同階層的陣列
		
		int[][] m1 = new int[2][];//合法宣告
		//int[][] m2 = new int[][3];//編譯錯誤，陣列的宣告是從左至右的方式來初始陣列大小，能事先在記憶體配置空間
		
		//int[2][] m3 = new int[][3];//編譯錯誤，陣列長度的給定不可以放在變數區別宣告區，new是用來配置記 憶體大小的
		

	}

}
