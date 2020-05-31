package overloading;
//vararg可變參數
public class Vararg {
	//可依傳入不同參數，利用「+」運算子來算出傳入參數的總合
	public int calc(int x, int y){//計算
		return x+y;
	}
	public int calc(int x, int y, int z){
		return x+y+z;
	}
	//用for-each取得元素內容在把參數相加
	public int calc1(int[] c){
		int sum = 0;
		for(int i:c){
			sum+=i;
		}
		return sum;
	}
	/*
	Vararg可變參數的機制，能隨意地增長方法中的參數
	把int[]寫成int...(...為省略符號，代表很多的意思)，兩種是一樣意思，因為反組譯後int...會變成int[]，還會
	加上transient修飾字，所修飾的屬性/變數是不會被序列化的，所以超載宣告時，只能宣告一種，
	因為一個方法只能有一個省略號(...)，不然重複會編譯錯誤，
	
	(int x, int...c)正確，省略號的參數必須放在最後面
	(int... c, int x)錯誤
	(int... c, int ...x)錯誤，一個方法只能有一個省略號
	 */
	public int calc(int... a){
		int sum = 0;
		for(int i: a){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// int[] c 這種寫法必須在使用時先將傳入的參數建立成陣列，有一點麻煩
		new Vararg().calc(new int[]{1,2,3,4});
		//int...
		System.out.println(new Vararg().calc());//也可以不傳進參數
		System.out.println(new Vararg().calc(1,2));
		System.out.println(new Vararg().calc(1,2,3,4));
		//or
		Vararg v = new Vararg();
	        int a = v.calc(1,2);
	        int b = v.calc(1,2,3,4);
	        int c = v.calc(a,b);
	        System.out.println(c);
		
		

	}

}
