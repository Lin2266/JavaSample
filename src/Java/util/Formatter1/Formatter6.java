
package Java.util.Formatter1;

import java.math.BigDecimal;
import java.util.Date;


public class Formatter6 {

    public static void main(String[] args) {
        //%h16進制、%e科學符號
        System.out.printf("16進制:%h \n", 20);
        System.out.printf("科學符號:%e \n",new BigDecimal("10000"));
        
        //百分比,String.format
        System.out.println("浮點數百分比:" + String.format("%f%%",((10f/100f)*100f)));
        System.out.println("整數百分比:" + String.format("%d%%", 12));
        //百分比,printf
        System.out.printf("浮點數百分比:%f%% \n",((10f/100f)*100f));
        System.out.printf("整數百分比:%d%% \n",12);
        
        //換行符號
        System.out.println("String換行符號:" + String.format("%d%n", 111));
        System.out.printf("printf換行符號:%d\n",111);
        //日期/時間格式
        System.out.printf("month/day/year格式:%tD \n",new Date());
        System.out.printf("今年到現在的天數:%tj \n",new Date());
    }
    
}
