
package Java.text.Format1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat5 {
    //預設跟自訂輸出模式，顯示今天日期西元年-月-日 小時:分:秒，使用格式
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);//結果跟呼叫toString()一樣
        System.out.println(d.toString());//預設date的日期輸出格式
        System.out.println(d.toGMTString());//格林威治標準時間
        
        //自訂模式
        DateFormat df = new SimpleDateFormat( "YYYY-MM-dd hh:mm:ss");
        System.out.println(df.format(d));
        
    }
    
}
