
package Java.text.Format1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat7 {
    //解析日期或是時間，假設某公司的人資員工生日為20141101，但是在網頁上希望可以加上/符號，方便人員瀏覽
    public static void main(String[] args) {
        String pattern = "yyyyMMdd";
        String inputDate = "20160228" ; 
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        try {
            Date date = simpleDateFormat.parse(inputDate);
            DateFormat birthDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            System.out.println(birthDateFormat.format(date));
            
        } catch (ParseException e) {
            System.out.println(e.toString());
        }
    }
    
}
