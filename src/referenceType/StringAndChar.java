package referenceType;
//String跟char
public class StringAndChar {
	/*
	 char為基本型態使用單引號'A'，16bits Unicode， 用==做比較，內容值可變動。
	 String為參考型別使用雙引號"A"，是一個類別，用equals()或==做比較，內容不可變
	 */

	public static void main(String[] args) {
		//基本型態的stack內容值為A，參考型別的stack內容存的是參考值(記憶體地址)
		char c ='A';
		char c1 ='A';
		System.out.println(c==c1);//true，因為==比較的是stack的內容值
		
		System.out.println("String literal比對:");
		/*
		 java 1.4版後針對String的儲存應用做了修改，為了提升String的使用與效能，在heap中為String物件建造了一個虛擬的
		 String pool來存放String。若要將所宣告的String放入String pool中，可以使用String literal(字串字面值)的方式
		 來宣告:
		 */
		String s1 ="Java";//String literal宣告所建立的實體會放在 String pool，字串內容值是不可變動
		String s2 ="Java";
		System.out.println(s1==s2);//true 都指向String pool裡的Java，因為只有一個，所以都共用
		
		
		//字串內容是不可變動的
		String s ="Java"; //Java內容不變
		s=s+"SCJP"; //Java + SCJP時會在記憶體中另外開一塊新空間來存放新字串JavaSCJP，然後在給s變數參考使用
		System.out.println(s);
		
		System.out.println("new String比對:");
		//當String加上new關鍵字時，會各自在heap中擷取一塊記憶體來存放字串內容，所以stack的變數內容值參照不同的記憶體
		String s3 = new String("Java");
		String s4 = new String("Java");
		String s5 = new String("JAVA");
		System.out.println(s3==s4);//false 因為stack的內容值不一樣
		System.out.println(s3.equals(s4));//true String的equals有改寫，所以比的是實體內容
		System.out.println("不分大小寫比對:" + s4.equalsIgnoreCase(s5));
	}

}
