package Java.lang.String1;

//String與new String的差別
public class String_newString {

    public static void main(String[] args) {
//其實JVM建立了兩個String實例。這意謂著，直接使用雙引號包括字元來建立字串，以及自行用new關鍵字建立字字串是不同的,
//==運算子會比較兩個參考名稱是否參考至同一物件，上面的程式片段會印出false，也就是str1與str2是參考至不同物件。
//直接使用雙引號包括字元來建立字串，JVM會自行在記憶體中使用一個字串池（String pool）來維護，只要雙引號含括的字元內容相同
//        （序列相同，大小寫相同），無論在程式碼中出現幾次，在字串池中都只有一個實例。
        String str1 = "Java";
        String str2 = new String(str1);
        System.out.println(str1 == str2);//flase,==比參考值，equals比內容值

//程式碼片段會印出true，因為雙引號含括的內容都是Java這個字元序列，雖然程式碼中出現了兩次"Java"，但在字串池中卻只有一個實例，
//        只不過依程式碼所定義的，被str3與str4所參考著。
        String str3 = "Java";
        String str4 = "Java";
        System.out.println(str3 == str4);//true，都字串池的

//要比較字串是否相等要使用equals()方法而不是==，這個意思是指比較字串所含字元序列的相等性，而非參考名稱所參考的記憶體位置相等性。
//        下面這個程式碼會顯示true，因為str5與str6所參考之物件，其所含字元序列都相等。
        String str5 = "Java";
        String str6 = new String(str1);
        System.out.println(str5.equals(str6));//true，比內容
      
        //str6透過intern()會使用equals()方法，比較字串池中是否有字元序列相同的字串
        System.out.println(str5 == str6.intern());//true
    }

}
