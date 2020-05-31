
package Java.text.Format1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;


/*
使用parse()解析
欲將文字字串轉換成Data物件，可以使用parse()方法，所輸入的字串必須符合以下幾種style:
Locale.US
1.SHORT:7/22/05(月/日/西元末二位)
2.MEDIUM:Jul 22, 2005
3.LONG:July 22, 2005
4.FULL:Firday, July 22, 2005 AD
西元前BC,西元後AD

Locale.TAIWAN
1.SHORT:2005/7/22(西元(4位數)/月/日)
2.MEDIUM:2005/7/22(與SHORT的格式相同
3.LONG:2005年7月22日
4.FULL:2005年7月22日 星期五

parse()是一個覆載方法
方法名稱                                        回傳值      說明
parse()(String source)throws ParseException     Date        傳入的source字串來parse(分析)一個Date物件，該方法的修飾
                                                            定義會丟出java.text.ParseException例外
parse()(String source,ParsePosiion pos)         Date        是abstract方法，傳入的source字串與pos所指定的位置來parse
                                                            (分析)成為一個Date物件，在使用該方法不會丟出例外，所以若
                                                            無法parse指定字串source時，會回傳null

*/
public class DateFormat2 {

    public static void main(String[] args){
       Date d = null;
       String ds = "2016年2月22日";//要分析什麼樣的style就要對應他的格式去做分析
       DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.TAIWAN);
        try {//parse()傳入一個參數會拋出例外
            //parse(ds)以DateFormat.LONG,Locale.TAIWAN為style來分析2016年2月22日字串並產生Date物件實體
            d = df.parse(ds);//long的日期格式，在用parse來分析成d顯示出來的格式
        } catch (ParseException e) {
            System.out.println("Unable to parse " + ds);
        }
        //Mon Feb 22 00:00:00 GMT+08:00 2016 週一 二月 22日
        System.out.println(d);
        System.out.println(df.format(d));//台灣的年月日
    }
    
}
