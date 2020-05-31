
package Java.util.Formatter1;

import java.util.Date;


public class PrintfDate1 {
    //時間格式化
    public static void main(String[] args) {
        Date d = new Date();
        System.out.printf("現在是%tp%tl點%n",d,d);//現在是下午6點
    }
    
}
