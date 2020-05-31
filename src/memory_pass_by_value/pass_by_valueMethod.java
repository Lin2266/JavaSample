package memory_pass_by_value;
//方法的pass by value
public class pass_by_valueMethod {
	
	static void Method(String[] s){
		for(String ss:s)
		System.out.println(ss);
	}

	public static void main(String[] args) {
		String[] obj = {"Java","SCJP 5.0"};
		Method(obj);
		/*
		 當呼叫Method(obj)時，表示將obj物件變數的statck的內容值"0xabc"傳給Method()方法參數列中的s物件變數，
		 所以Method()方法的s物件變數與main()方法的obj物件變數維護同一個參考值的String[]
		 */

	}

}
