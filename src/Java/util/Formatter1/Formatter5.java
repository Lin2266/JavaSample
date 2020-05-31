
package Java.util.Formatter1;

import java.util.Formatter;


public class Formatter5 {
    //特殊格式以%index$來做指定，下列範例是將a和b對調顯示
    public static void main(String[] args) {
        //宣告變數
      int a = 10 ;
      int b = 20 ; 
      int c = 30 ;
      
      System.out.printf("%d %d %d \n",a,b,c);   //正常顯示
      
      //使用format物件
      Formatter format = new Formatter() ; 
      System.out.println(format.format("%2$d %1$d %3$d", a, b, c)) ;
      format.close();
      //%[index$][標識][最小寬度]轉換方式:第一個參數由 "1$" 引用，第二個參數由 "2$" 引用
      System.out.printf("%2$d %1$d %3$d \n",a,b,c);  //使用printf
    }
    
}
