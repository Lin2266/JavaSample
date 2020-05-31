
package Java.text.Format1;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;




//parse()分析
public class DateFormat3 {

    public static void main(String[] args) {
        Date d = null;
        String ds = "今天是:2016年2月24日 星期三";//想像char[]陣列
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.TAIWAN);
        //parse()方法傳入二個參數不會丟出ParseException,所以不用try-catch，不過若無法parse指定字串的時候會回傳null，ds中第4個位置開始parse字串資料，可以把ds字串想像是一個char[]陣列，因此第4個位置就是陣列維度4的位置，也就是『2』，因此最後parse()方法所分析的是『2016年2月24日 星期三』，前面的『今天是:』(維度0~3)則會忽略不分析
        
        d = df.parse(ds, new ParsePosition(4));//ParsePosition分析位置(4)(2016..)
        System.out.println(d);
        System.out.println(df.format(d));
    }
    
}
