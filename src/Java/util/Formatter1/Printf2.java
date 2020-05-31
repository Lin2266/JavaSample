
package Java.util.Formatter1;

import java.util.Calendar;

//與日期相關的:System.out.printf()改成呼叫System.out.format()也會得到相同的結果
public class Printf2 {

    public static void main(String[] args) {
        //取得日期實體
        Calendar now = Calendar.getInstance();
        System.out.println("(01):" + now);
        
        //%tA 星期幾完整顯示， %ta 星期幾精簡顯示
        System.out.printf("(02): %tA , %ta %n",now,now);//星期四 , 星期四
        //%tB 月份完整顯示， %tb 月份精簡顯示
        System.out.printf("(03): %tB , %tb %n",now,now);//三月 , 三月 
        //%tC 世紀
        System.out.printf("(04): %tC 世紀 %n",now);//20 世紀
        //%tc 完整的時間與日期
        System.out.printf("(05): %tc %n",now);//星期四 三月 03 20:10:27 GMT+08:00 2016 
        //%tD 短暫字的日期  
        System.out.printf("(06): %tD %n",now);// 03/03/16 而非2005
        //%td 日，從01~31
        System.out.printf("(07): %td %n",now);//03日
        //%te 日，從1~31
        System.out.printf("(08): %te %n",now);//3日
        //全部串聯 (<)代表跟前面一樣使用同一種參數
        System.out.printf("(09): Right now is %tr on %<tA, %<tB, %<te, %<tY. %n",now);
       
    }
    
}
