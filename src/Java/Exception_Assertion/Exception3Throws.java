
package Java.Exception_Assertion;
import java.io.IOException;
import java.sql.SQLException;

/*
 陣列索引超出
 throw new:會中斷該方法並且呼叫或傳遞一個例外，可以利用它在程式中觸發一個例外錯誤
 throws:若方法在實作中會產生某些例外錯誤，則可在宣告方法時加上throws來修飾方法，目的是讓使用此方法的人能夠
 知道呼叫這個方法可能會引發或 需要處理的例外錯誤有哪些，throws的例外類別必須是子類別或相等
 */
public class Exception3Throws {
    static int numerator = 20; //分子
    static int[] denominator = {0, 2, 4}; //分母
    static String answer; //回答/計算結果
    //calc計算，throws例外關係要比throw大
    public static void calc(int index) throws Exception, SQLException{//多加了一個例外
        double ans = 0;
        if((index == 0) || (index >= denominator.length)){
            answer = "無法計算";
            //宣告new例外訊息時，方法要加throws例外
            throw new Exception("denominator[] 的索引值不得為" + index);
//            throw new IOException("denominator[] 的索引值不得為" + index);//合法
        }
        ans = numerator / denominator[index];
        answer = String.valueOf(ans);
    }
    //呼叫方法有拋例外時，main方法也要拋例外
    public static void main(String[] args) throws Exception  {
        try {
             calc(0);
        } catch (Exception e) {
            //取得throw new Exception的錯誤字串
            System.out.println("錯誤訊息: " + e.getMessage());
        }
         System.out.println(numerator +" / " + denominator[2] +" = " + answer);
         System.out.println("計算完畢！");
  
       
    }
    
}
