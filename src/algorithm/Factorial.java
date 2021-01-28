package algorithm;

public class Factorial {

	public static void main(String[] args) {
		//階乘，描述1*2*3...*10的計算過程
		int result =1;
		for(int i =1;i<=10;i++){
			result = result *i;
		}
		
		System.out.println(result);
	}

}
