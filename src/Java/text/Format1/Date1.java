
package Java.text.Format1;

import java.util.Date;

/*
目前可用Date()建構子有二個(其它建構子都已經Deprecated(已過時)，不建議使用)
建構子名稱          說明
Date()              取得今天的日期/時間
Date(long date)     自Thu Jan 01 08:00:00 CST 1970的基礎日期時間再加上所設定的date毫秒(千分之一秒)
關於基礎日期/時間
若GMT(Greewich mean time 格林威治標準時間)則是January 1, 1970, 00:00:00 CST, 
若CST(Centrl Standard Time 美國中部標準時間)則是January 1, 1970, 08:00:00 CST,二者相差8小時。 
*/
public class Date1 {

    public static void main(String[] args) {
        Date d1 = new Date();//取得今天的日期/時間
        System.out.println("取得今天日期:" + d1);//Wed Feb 24 15:40:04 GMT+08:00 2016
        Date d2 = new Date(0);//取得1970年1月1日的日期/時間
        //Thu Jan 01 08:00:01 GMT+08:00 1970(基礎日期/時間 Thu Jan 01=週四1月1日)
        System.out.println("基礎日期/時間:" + d2);
        Date d3 = new Date(1000);//1000毫秒會多加1秒
        System.out.println("加1000毫秒:"+ d3 + " 多1分鐘");
        Date d4 = new Date(86400000);//86400000毫秒會多加1天
        //or Fri Jan 02 08:00:00 GMT+08:00 1970 (02 2日)
        Date d4_1 = new Date(1000*60*60*24);
        System.out.println("加86400000毫秒:"+ d4_1 + " 基礎日多1天");//1000毫秒*60秒*60分*24小時=86400000毫秒(1天)
        //setTime(long time)&getTime()
        //例如將今天(2016年02月24日星期三)再加1天:
        Date d5 = new Date();
        //setTime(long time)是從標準基礎日期來開始計算，這就是為何要加上d5.getTime()(取得今天日期)的原因了
        d5.setTime(1000*60*60*24 + d5.getTime());
        System.out.println("今天日期多加一天" + d5);
        d5.setTime(1000*60*60*24);
        System.out.println("變基礎日多加一天" + d5);
    }
    
}
