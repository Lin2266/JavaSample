
package Java.text.Format1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DateFormat6 {
    //顯示英國區域今天的日期
    public static void main(String[] args) {
       //預設
        Locale locale = new Locale("cy","GB");//類別
        DateFormat cyDateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT, locale);//抽象類別
        System.out.println("預設英國地區日期/時間:" + cyDateTimeFormat.format(new Date()));
        
        //自訂格式
        Locale locale2 = new Locale("cy","GB");
        DateFormat cySimpleDateTimeFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss EEEEEZ", locale2);
        System.out.println("自訂英國地區日期/時間:" + cySimpleDateTimeFormat.format(new Date()));
    }
    
}
