
package Java.util.Formatter1;

import java.util.Formatter;

/*
format()與close():
format()(格式)是Formatter(格式化)所提供的格式化輸出方法
方法名稱                                回傳值      說明
format(String format, Object...args)    Formatter   將args內容根據format所對應到的轉換型態一併格式化
format(Locale locale, String format,    Formatter   將args內容根據format所對應到的轉換型態轉換，再根據locale物件的內容
                      Object...args)                一併格式化

*/
public class Formatter2 {

    public static void main(String[] args) {
       //將格式化的資料輸出至主控台(console)中
        Formatter f = new Formatter(System.out);//PrintStream物件,主控台
        f.format("圓週率 = %f", Math.PI);//%f將Math.PI的值格式化成十進制的浮點數
        System.out.println("\n"+"-----------------------");
        System.out.println(Math.PI);
    }
    
}
