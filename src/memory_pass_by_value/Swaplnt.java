package memory_pass_by_value;
//參數交換
//把x和y用物件包起來做交換的測試在MyObject
public class Swaplnt {
	int i = 1;
	static String ss = new String("大");
	public static void swap(int x,int y){
		int tmp = x;
		System.out.println(tmp);
		x = y;
		System.out.println(x);
		y = tmp;
		System.out.println(y);
	}
	public static void swap1(String ss){
		String s1 = "小";
		ss=s1;
		System.out.println("swap1的ss " + ss);
	}
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		swap(x, y);
		System.out.println("x = " + x + ", y = " + y);
		
		String ss = new String();//這個字串會new一個新的記憶體，跟成員變數的字串無關
		swap1(ss);
		//pass by value只能對參數的值做更改，永遠改不到main裡面的原始變數
		//要使用到這個 類別的成員變數，就要用類別new一個物件，或在成員變數加上類別名稱
		System.out.println("main String = " + Swaplnt.ss);

	}

}
