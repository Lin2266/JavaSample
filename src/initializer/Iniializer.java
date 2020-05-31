package initializer;

/*
實作區塊
實作區塊指的就是 {...}，若單獨放在class內就是初始實作區塊，初始化區塊可分二種:
1.instance initializer
2.static initializer
 */
public class Iniializer {
	String id;
	int birthday;
	String name;
	
	static String idd;

	Iniializer() {
		//如果建構子已對id進行初始化時，id會被設定二次，實作時要注意效率的問題
		/*複製過來
		  id="A123456789"; 
		  birthday=20050101; 
		  name="pcschool"; 
		 */
		id="B987654321";//原先在建構子的程式碼會被搬到後面，執行到這時id的值會被更改
	}

	Iniializer(int kind) {
		/*{}初始化的值會複製過來
		  id="A123456789"; 
		  birthday=20050101; 
		  name="pcschool";
		 */
	}

	// instance initializer，編譯器會在編譯時將initalizer內程式碼複製到建構子當中
	{
		id = "A123456789";
		birthday = 20050101;
		name = "pcschool";
	}
	
	//static initializer,針對static成員變數的初始，可做指派，進入類別時就會先執行
	static{
		idd="abc";
		System.out.println(idd);
		System.out.println("類別進來static就會先設定初始化\n----------------------------");
	}

	void getInfo() {
		System.out.println("id = " + id);
		System.out.println("birthday = " + birthday);
		System.out.println("name = " + name);
		idd="AAA";
		System.out.println(idd);
		idd="ABC";

	}

	public static void main(String[] args) {
		new Iniializer().getInfo();
		new Iniializer(100).getInfo();
		
		System.out.println("static initializer--------");
		System.out.println(new Iniializer().idd);

	}

}
