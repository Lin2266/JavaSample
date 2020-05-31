
package Java.lang.String1;

/*
predefined character正則運算子
表示法          任何字元(character)
/d              單一數字[0~9]
/D              非單一數字[^0~9]
/s              空白字元[\t\n\x0B\f\r]
/S              非空白字元[^\s]
/w              字元[a-zA-Z_0-9]
W               非字元[^\w]
*/
public class split2 {

    public static void main(String[] args) {
        //split() v.s. predefined character
        String test = "a1b2c3";
        String[] tokens = test.split("\\d");//\d代表0~9成為字串切割的分隔符號，使用\d要加上跳脫字元"\"
        for(String s: tokens){
            System.out.println(s + " ");
        }
    }
    
}
