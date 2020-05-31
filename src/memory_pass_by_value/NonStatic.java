package memory_pass_by_value;

public class NonStatic {
	public void nonStatic(){
		System.out.println("nonstatic");
	}

	public static void main(String[] args) {
		/*
		Cannot make a static reference to the non-static method 
		nonStatic() from the type NonStatic
		不能在 static 方法裡呼叫 non-static 方法
		因為在這個情況下，你根本沒有「目前的物件的 Reference」的這個
		東西，可以當做 nonStatic() 的第一個參數，因為static在程式執行時會第一個
		先被執行到，那時候物件還沒有被建立起來，所以當然無法呼叫
		 nonStatic() 這個方法囉
		*/
		//nonStatic();

	}

}
