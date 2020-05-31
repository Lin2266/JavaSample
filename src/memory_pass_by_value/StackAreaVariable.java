package memory_pass_by_value;
//記憶體區域變數
public class StackAreaVariable {
	static void function1(){
		System.out.println("Inside function1");
	}
	static void function2(){
		System.out.println("Inside function2");
	}
	static void function3(){
		System.out.println("Inside function3");
		function1();
		function2();
		System.out.println("End of function3");
	}

	public static void main(String[] args) {
		function1();
		function2();
		function3();
		function2();
		function1();

	}

}
