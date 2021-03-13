
package final_static;

/*
1.static：靜態，用於內部類別、方法(methods)與變數。
non-static可以存取non-static跟static成員
static只可以存取static,要存取non-static必須要宣告跟建立物件來存取
static不會傳有參考值(this參考)，也不需要建構子
*/
public class Static {

	private Integer a = 0;

	// static的區域變數不需要是static，但調用屬性必須成員屬性必須要是static，或是要用new關鍵字
	public static void test(Integer a) {
		System.out.println(a++);
	}

	// 靜態不可呼叫非靜態方法，除非要new，非靜態可直接呼叫靜態方法
	void aMethod() {
		cMethod();
		dMethod();
	}

	void bMethod() {
		
	}

	static void cMethod() {
		// aMethod();不行
		dMethod();// 可以，因為是static
	}

	static void dMethod() {
		// sataic要呼叫非靜態方法時，要用new
		new Static().aMethod();
	}

	public static void main(String[] args) {
		// 編譯錯誤，static方法要調用成員屬性時，成員屬性必須要是static，或是要用new關鍵字
		// test(a);
		test(new Static().a);// 合法，static方法用new調用a成員屬性
	}

}
