package method;

public class VarArgs2 {
	//varargs(可變參數)只能放在最後，不能放兩個
	void doSomething(int num,String...strings) {
		for(String s: strings) {
			System.out.println(num++ + "=" + s);
		}
	}

	public static void main(String[] args) {
		VarArgs2 obj = new VarArgs2();
		obj.doSomething(1,"1號","2號","3號");

	}

}
