
package Java.util.Formatter1;

import java.util.Date;


public class PrintfDate2 {

    public static void main(String[] args) {
        Date date = new Date();
        String template = "大家好! 今天是%tF, %tp %tR%n";
        System.out.printf(template, date, date, date);
        //大家好! 今天是2016-03-02, 下午 18:54
    }
    
}
