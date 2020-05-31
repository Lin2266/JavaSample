
package Java.lang.String1;

import java.util.StringTokenizer;

public class StringTokenizer3 {

    public static void main(String[] args) {
        String text = "POST http://safe.ie.sogou.com/SecurQuery?"+
               "h=79C5973A4A55EABCC8E743CD3DB0649C&r=0000&v=4.0.2.5906 HTTP/1.1";
        StringTokenizer tk = new StringTokenizer(text);
        String str = "";
        while(tk.hasMoreTokens()){
            str = tk.nextToken();
            System.out.println(str);
        } 
//        例2:
//        String text = "POST|GET";
//        StringTokenizer tk = new StringTokenizer(text,"|");
//        String str = "";
//        while(tk.hasMoreTokens()){
//            str = tk.nextToken();
//            System.out.println(str);
//        }
    }
    
}
