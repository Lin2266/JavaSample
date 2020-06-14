package method;

public class Function1 {	
	public int a(int num1,int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		Function1 function1 = new Function1();
		int a = function1.a(10,2);
		System.out.println(a);
		System.out.println(function1.a(10,2));

	}

}
