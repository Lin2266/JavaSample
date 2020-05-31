package memory_pass_by_value;

public class ArrayMemory {
	
	public static void addbyOne(int [] y){
		int [] z = {1,1,1};
		//y=z;//參考值被改變時，main的x不會改變
		
		y[0] = y[0] +1;//物件的實體內容被改變時,main的x實體內容會被改變
		y[1] = y[1] +1;
		y[2] = y[2] +1;
		System.out.println("y[0] = " + y[0]);
		System.out.println("y[1] = " + y[1]);
		System.out.println("y[2] = " + y[2]);
	}

	public static void main(String[] args) {
		int [] x = {1,2,3};
		
		addbyOne(x);//陣列傳的是參考值
		
		//addbyOne的Y修改會影響到X的值，因為傳遞的是參考值
		System.out.println("x[0] = " + x[0]);
		System.out.println("x[1] = " + x[1]);
		System.out.println("x[2] = " + x[2]);
	}

}
