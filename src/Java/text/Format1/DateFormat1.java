
package Java.text.Format1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/*
DateFormat(日期格式)是一個abstract抽象類別:
public abstract class DataFormat extends Format{}
可以取得各地域的日期/時間顯示。
Locale類別中的getDefault()方法可以取得目前程式所在的地域(locale)名稱(locale是用來存放該國通用顯示格式的資訊)。
台灣地域名稱為『zh_TW』，zh指的是中文，TW指的是國家名稱，Java SE API提供了Locale.TAIWAN可以取得台灣的Locale物件，
位於java.util套件中，可透過getDateInstance()方法來取得日期格式實體，getTimeInstance()方法取得時間格式實體，
也可以利用getDateTimeInstance()方法取得日期+時間格式實體，因為DataFormat是一個抽象類別，提供了三種方法來取得需要
使用的實體，取得實體之後透過format()方法來格式化所要顯示的資訊。

date格式化的風格(style)分為:SHORT(短)、MEDIUM(中)、LONG(長)、FULL(飽滿)，用數字來表示date的資訊
1.SHORT:2016/02/21 
2.MEDIUM:2016/02/21 
3.LONG:2016年02月21日 
4.FULL:2016年02月21日 星期日 

time格式化的風格(style)分為:SHORT(短)、MEDIUM(中)、LONG(長)、FULL(飽滿)
拉丁文 上午am:ante meridiem 下午: pm:post meridiem 
1.SHORT:下午 9:05
2.MEDIUM:下午 09:05:10
3.LONG:下午 09時05分10秒
4.FULL:下午 09時05分10秒 GMT+08:00
GMT:格林威治標準時間
TST:Taiwan Standard Time台灣標準時間
CST:Central Standard Time(美國)中部標準時間
PST:Pacific Standard Time太平洋標準時間
*/
public class DateFormat1 {
    //Date預設格式:Sun Feb 21 21:30:58 GMT+08:00 2016(GMT+8:台灣比格林威治標準時間快8小時
    private static Date date = new Date();
    
    //利用日期、時間、地域做格式化
    private static void show(int dateFormat, int timeFormat, Locale locale){
        DateFormat df = DateFormat.getDateTimeInstance(dateFormat, timeFormat, locale);
        System.out.println(df.format(date));
    }
    public static void main(String[] args) {
       //利用getDateTimeInstance()方法加入date的DateFormat、time的DateFormat與Locale參數，再透過format()方法將格式化後的格式顯示出來
        //把要格式化的日期、時間、地域放到show()，taiwan會顯示繁體字
        show(DateFormat.SHORT,DateFormat.SHORT,Locale.TAIWAN);
        show(DateFormat.MEDIUM,DateFormat.MEDIUM,Locale.TAIWAN);
        show(DateFormat.LONG,DateFormat.LONG,Locale.TAIWAN);
        show(DateFormat.FULL,DateFormat.FULL,Locale.TAIWAN);
        System.out.println("----------------------");
        DateFormat df2 = DateFormat.getDateInstance();
        System.out.println(df2.format(date));
        
    }
    
}
