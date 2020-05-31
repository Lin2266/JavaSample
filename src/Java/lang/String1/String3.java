package Java.lang.String1;

public class String3 {

	public static void main(String[] args) {
		String str1 = new String("This is str");
		String str2 = new String("This is str");
		String str3 = "This is str";
		String str4 = "This is str";
		String str5 =str4;
		System.out.println("str1.equals(str2):" + str1.equals(str2) );//true
		System.out.println("str2.equals(str3):" + str2.equals(str3) );//true
		System.out.println("str3.equals(str4):" + str3.equals(str4) );//true
		System.out.println("==================================================");
		System.out.println("str1 == str2:" + (str1 == str2));//false
		System.out.println("str2 == str3:" + (str2 == str3));//false
		System.out.println("str3 == str4:" + (str3 == str4));//true
		
		
		
	}

}
