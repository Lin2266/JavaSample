package memory_pass_by_value;
//把這個整數用個物件包起來，這樣就可以交換 main() 裡的 x 和 y 嗎
public class MyObject {
	int value;
	public MyObject(int value){
		this.value = value;
	}
	//例1這邊.value已經對物件實體內容去做修改，沒有改到記憶體
	public static void swap(MyObject x, MyObject y){
		int tmp = x.value;
		x.value = y.value;
		y.value = tmp;
	}
	//例2的x參數被新建立的實體物件做指派的動作，所以本來的地址變成新的地址
	public static void test(MyObject x){
		x = new MyObject(10);
	}
	public static void main(String[] args) {
		MyObject x = new MyObject(3);
		MyObject y = new MyObject(5);
		swap(x, y);
		
		//例1.main這邊的.value因為swap()裡面的參數有去對物件實體內容做變動，
		//所以印出來的內容會有改變，但記憶體位置還是不變
		System.out.println("main x = " + x.value + ", y = " + y.value);
		
		//例2.因為test()裡面x參數被新的地址取代，沒有改到main裡的x物件實體，
		//所以這裡的x.value沒被動到，不變
		System.out.println("x =" + x.value);
	}

}
