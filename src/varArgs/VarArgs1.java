package varArgs;

public class VarArgs1 {
	/*使用varargs作為方法定義的參數，可以傳遞數組或參數序列。如果傳遞了一系列參數，它們將自動轉換為數組。
	此示例顯示了一個數組和一系列傳遞給printVarArgArray()方法的參數，以及它們在方法內部代碼中的相同處理方式：*/
	
	// this method will print the entire contents of the parameter passed in
	void printVarArgArray(int... x) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i] + ",");
		}
	}
	public static void main(String[] args) {
		VarArgs1 obj = new VarArgs1();
		//Using an array:
		int[] testArray = new int[] {10,20};
		System.out.print("Using an array:");
		obj.printVarArgArray(testArray);
		System.out.println();
		//Using a sequence of arguments
		System.out.print("Using a sequence of arguments:");
		obj.printVarArgArray(1,2,3);

	}

}
