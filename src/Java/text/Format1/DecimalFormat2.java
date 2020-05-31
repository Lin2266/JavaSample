
package Java.text.Format1;

import java.text.DecimalFormat;


//小數跟百分比(%)、$貨幣
public class DecimalFormat2 {

    public static void main(String[] args) {
        //小數位的pattern(格式)可以用『.##』或『.00』來表示
        double value = 12345.67890;
        DecimalFormat df1 = new DecimalFormat("$####,####.##");//顯示$(錢字符號)
        DecimalFormat df2 = new DecimalFormat("0000,0000.00");
        DecimalFormat df3 = new DecimalFormat("####,####.00");
        System.out.println("df1小數點格式: " + df1.format(value));//自動四捨五入
        System.out.println("df2小數點格式: " + df2.format(value));
        System.out.println("df3小數點格式: " + df3.format(value));
        
        //百分比(%)
        double value1 = 0.123456;
        DecimalFormat df4 = new DecimalFormat(".##%");
         System.out.println("df4百分比格式: " + df4.format(value1));//自動四捨五入
    }
    
}
