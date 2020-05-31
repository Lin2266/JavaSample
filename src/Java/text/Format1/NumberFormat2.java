
package Java.text.Format1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class NumberFormat2 {
    //顯示多國的幣值(Currency)符號與各種數字
    public static void main(String[] args) {
        int num = 10;
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("",Locale.CANADA.getCountry()));
        System.out.println("取得加拿大貨幣簡寫:"+ nf1.format(10.01));
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println("取得加拿大貨幣符號:"+ nf2.format(num));
        
        //大10進位自訂
        BigDecimal b1 = new BigDecimal("10.50");
        NumberFormat nf3 = new DecimalFormat("#,###.00");
        System.out.println("自訂10進位浮點數: " + nf3.format(b1));
        
        //大10進位百分比 %
        BigDecimal b2 = new BigDecimal(0.3);
        NumberFormat nf4 = NumberFormat.getPercentInstance();
        System.out.println(nf4.format(b2));
    }
    
}
