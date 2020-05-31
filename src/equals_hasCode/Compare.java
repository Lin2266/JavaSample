package equals_hasCode;
/*
 ==是比較兩個字串的references是不是指向同一物件。而java.lang.String.equals()未覆寫時，
 預設的equals函式執行動作，將比較兩個變數所在的記憶體位置是否相同
當使用String literals(一串被雙引號括住的字元)時，使用 '=='運算子和使用equals
method 的結果會是一樣的。所有的String literals都是指向同一個String 類別的
instances。系統中有一個pool，當有新的String literals出現時，系統會先去檢查pool
之中，是不是已經存在一個和這個新的String literals有相同內容的物件。如果存在，
則會傳回一個指向這個此物件的reference。若不存在，則會將此String literals放到
pool中，然後傳回這個物件的reference。

當字串是由"new"這個關鍵字所造出來的時候，則不是這麼一回事。
傳用"new"這個關鍵字時，會造出兩個不同的物件，所以會有兩個不同的references，即
使在底層的string literal是一樣的。在上面的例子中，'=='運算子傳回false，因為兩
個references是不同的。而equals method則傳回true，因為String(Integer)的equals被改寫了，直接比較物件內容值
 */
public class Compare {
	public String s;
	public Compare(String s){
		this.s=s;
	}
	
	public void abc(){
		System.out.println("this" + this);
	}
	
	
		
public static void main(String [] args){
	int x1 =3;
	int x2 =3;
	System.out.println("Primitive ==:" + (x1 == x2));//true 比stack的內容
	Compare c = new Compare("嗨");
	Compare cc = new Compare("嗨");
	System.out.println(" c.equals(cc)" + c.equals(cc));//false
	c.abc();
	cc.abc();
	
	//new String建立起記憶體時，指定的內容會先到字串池找，有就複製，沒有就在字串池建立一個
	//在複製過來
	String str1 = new String("HelloWorld");
	String str2 = new String("HelloWorld");
	String str3 = "HelloWorld";
	String str4 = "HelloWorld";
	String str5 = "Hello" + "World";//字串相加就跟"HelloWorld"是一樣的
	
	System.out.println("new Strine ==:" + (str1 == str2));//false 參考值不一樣
	System.out.println("new Strine equals:" + str1.equals(str2));//true 比型態跟參考值
	System.out.println("new Strine & String: ==:" + (str2 == str3));//false
	System.out.println("new Strine & String; equals:" + str2.equals(str3));//true
	System.out.println("Strine ==:" + (str3 == str4));//true 字串無法更改，只會從字串池裡撈一樣的值
	System.out.println("Strine equals:" + str3.equals(str4));//true 字串池的內容
	System.out.println("Strine+ ==:" + (str3 == str5));//true
	System.out.println("Strine+ equals:" + str3.equals(str5));//true
	
}
}
