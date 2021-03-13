package Java.lang.String1;

public class intern {
	/*intern()(實習生)方法，可以讓你將字串放入字串池，或者是從字串池中取得JVM所維護的字串。
	如果你呼叫它，則會使用equals()方法，比較字串池中是否有字元序列相同的字串，如果有則傳回，
	如果無則將該字串置入字串池。
	*/

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String(str1);
        System.out.println(str1 == str2.intern());//true
        
        String str3 = "Java";
        String str4 = new String("Java");
        System.out.println(str3 == str4);//false
        
        String str5 = "Java";
        String str6 = new String("Java");
        System.out.println(str5 == str6.intern());//true
    }

}
