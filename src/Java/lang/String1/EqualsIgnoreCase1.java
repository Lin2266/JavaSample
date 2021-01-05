package Java.lang.String1;

public class EqualsIgnoreCase1 {
	/*
	此方法將這個字符串比較另一個字符串，忽略大小寫因素。 兩個字符串被認為是相等（忽略大小寫），
	如果它們是相同的長度，並在兩個字符串對應的字符是相等的（忽略大小寫）。
	*/
	public static void main(String[] args) {
		  String Str1 = new String("This is really not immutable!!");
	      String Str2 = Str1;
	      String Str3 = new String("This is really not immutable!!");
	      String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
	      boolean retVal;

	      retVal = Str1.equals( Str2 );
	      System.out.println("Returned Value = " + retVal );

	      retVal = Str1.equals( Str3 );
	      System.out.println("Returned Value = " + retVal );

	      retVal = Str1.equalsIgnoreCase( Str4 );
	      System.out.println("Returned Value = " + retVal );

	}

}
