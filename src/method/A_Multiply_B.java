package method;

public class A_Multiply_B {	
	public int Multiply(int num1,int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		A_Multiply_B function1 = new A_Multiply_B();
		int a = function1.Multiply(10,2);
		System.out.println(a);
		System.out.println(function1.Multiply(10,2));

	}

}
