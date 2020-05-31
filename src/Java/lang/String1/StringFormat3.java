
package Java.lang.String1;

import java.util.Date;


public class StringFormat3 {
//format(String format, Object... args) 使用指定的格式字串和參數返回一個格式化字串。
    public static void main(String[] args) {
       long now = System.currentTimeMillis();
       String s = String.format("%tR", now);
        System.out.println("時間24小時制:"+ s);
       //Current當前 month/day/year
       Date d = new Date(now);
       s = String.format("%tD", d);
        System.out.println("日期格式:"+ s);
       s = String.format("%,d", Integer.MAX_VALUE);
        System.out.println("Integer的最大值"+ s);
       s = String.format("%05d", 123);
        System.out.println("5位數(沒滿前面補0"+ s);
      
    }
    
}
