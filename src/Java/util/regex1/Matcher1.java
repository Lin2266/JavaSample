
package Java.util.regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Matcher比對器:
使用Pattern物件中的matcher()方法將可以建立出Matcher比對物件，並透過Matcher物件所提供的三種比對動作:
matches()、find()、lookingAt()方法來判定比對是否成功。
matches()是比對輸入的字串與樣式，只進行完整字串與樣式一次的比對，比對成功傳回true，反之則傳回false
*/
public class Matcher1 {

    public static void main(String[] args) {
        //Java這4個字元加上[EMS]中任意二個字元{2}，最後的.*是加上任意(.)多個字元(*)，CASE_INSENSITIVE忽略大小寫
       Pattern ptn = Pattern.compile("Java [EMS]{2}.*", Pattern.CASE_INSENSITIVE);//注意Java跟[EMS]{2}.*間的空格
       Matcher mch1 = ptn.matcher("Java SE 7.0");
       Matcher mch2 = ptn.matcher("Java eE 1.4.2");
       Matcher mch3 = ptn.matcher("Java me 1.0");
       Matcher mch4 = ptn.matcher("Java S 9.0");
       Matcher mch5 = ptn.matcher("Java AB 8.0");
       
       System.out.println(mch1.matches());
       System.out.println(mch2.matches());
       System.out.println(mch3.matches());
       System.out.println(mch4.matches());
       System.out.println(mch5.matches());
    }
    
}
