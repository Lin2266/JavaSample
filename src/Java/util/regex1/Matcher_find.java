
package Java.util.regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
find()方法將從輸入的字串中上一次比對結束的地方繼續與樣式進行比對，比對成功傳回true，反之則傳回flase。
可以從Matcher所提供的start()方法與end()方法得知比對成功字串的所在位置，start()會傳回比對成功部份的起始字元位置，
end()則傳回比對成功部份的結束字元位置+1。
*/
public class Matcher_find {

    public static void main(String[] args) {
        //要比對的字串，跟style
        Pattern ptn = Pattern.compile("saw", Pattern.CASE_INSENSITIVE);
        //要跟比對匹配的字串
        Matcher mch = ptn.matcher("I saw a saw");//我看見一把鋸子
        while(mch.find()){
            //2-4為saw比對I (saw) a saw第1句saw的位置，8-10為比對I saw a (saw)第2句saw的位置
            System.out.println(mch.start() + "-" + (mch.end()-1));//2-4,8-10
            /*
                I saw a saw 
                01234567890 元素位置
            */
        }
    }
    
}
