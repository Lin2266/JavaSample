
package Java.util.regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//replaceAll()取代所有字串:取代所比對成功的部份
public class Matcher_replaceAll {

    public static void main(String[] args) {
        String str = "How many cake could a good cook cook" +//一個好廚師可以做多少蛋糕
                     "If a good cook could cook cake? A" +   //如果一個好的廚師可以做蛋糕嗎?A
                     "good cook could cook as much cake" +   //好的廚師可以做出盡可能多的蛋糕
                     "as a good cook who could cook cake.";  //作為一個好的廚師誰可以做蛋糕。
        Pattern ptn = Pattern.compile("cake",Pattern.CASE_INSENSITIVE);
        Matcher mch = ptn.matcher(str);
        String newStr = mch.replaceAll("pies");//replaceAll將pies(餡餅)取代成比對的cake(蛋糕)
        System.out.println(newStr);
    }
    
}
