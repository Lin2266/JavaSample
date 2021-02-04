package method;

public class VarArgsError {
	//Compile time error (multiple varargs )
	//void method1(String... a, int... b , int c){} 
	
	//Compile time error (varargs must be the last argument 
	//void method2(int... a, String b){} 
	public static void main(String[] args) {
		// varargs必須放在最後一個

	}

}
