package Java.lang.String1;

public class StringCompareTo {

	public static void main(String[] args) {
		/*
		 描述
		此方法有兩個變種。首先這個方法比較字符串到另一個對象，第二種方法比較兩個字符串按字典順序。
		語法
		此方法定義的語法如下:
		int compareTo(Object o)
		or
		int compareTo(String anotherString)
		參數
		這裡是參數的細節:
		o -- 進行比較的對象。
		anotherString -- 要進行比較字符串.
		返回值:
		如果參數是一個字符串按字典順序等於這個字符串返回0值，
		如果該參數是一個字符串按字典順序比這更大的字符串返回小於0的值，
		如果該參數是一個字符串按字典順序比這少的字符串大於0的值。		
		 */
		//anotherString -- 要進行比較字符串. 該比較是基於所述字符串的每個字符的Unicode值。
		  String str1 = "Strings are immutable";
		  String str2 = "Strings are immutable";
	      String str3 = "Integers are not immutable";

	      int result = str1.compareTo( str2 );//字串符一樣回傳0
	      System.out.println(result);
		  
	      result = str2.compareTo( str3 );//str2字符串比str3少，所以回傳正數
	      System.out.println(result);
		 
	      result = str3.compareTo( str1 );//str3字符串比str2多，所以回傳負數
	      System.out.println(result);

	}

}
