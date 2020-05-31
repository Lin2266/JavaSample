
package Java.Exception_Assertion;
//runtime Exception的ArithmeticException算術例外(不可除以0，浮點數可以)，try-catch處理
//Unchecked Exception為重大錯誤發生，建議不用例外處理，語法上的問題

import static java.lang.System.out;

public class Exception3 {
    static int numerator = 20; //分子
    static int[] denominator = {0, 2, 4}; //分母
    static String answer; //回答/計算結果
    //calc計算
    public static void calc(int index){
        double ans = 0;
        try {
             //ans = 分子20/分母{2}
            ans = numerator / denominator[index];
            //結果10.0 = 取得浮點數ans的值10轉成字串
            answer = String.valueOf(ans);
        } catch (ArithmeticException e) {//整數不得除以0
            //getMessage()取得錯誤的值
            System.out.println("產生了算術錯誤，原因是: " + e.getMessage());
            System.out.println("詳細錯誤: ");
            //顯示什麼錯誤在第幾行
            e.printStackTrace(out);
//            System.out.println(e);
            answer = "無法計算";
        } catch (ArrayIndexOutOfBoundsException e){//陣列索引超出
            //getMessage()取得錯誤的值
            System.out.println("產生了索引超出範圍，原因是: " + e.getMessage());
            System.out.println("詳細錯誤: ");
            e.printStackTrace(out);
//            System.out.println(e);
            answer = "超出範圍";
        }
       
        
    }
    public static void main(String[] args) {
        //索引值0的值是0，會發生ArithmeticException(算術例外)，除以0的例外
        //ArrayIndexOutOfBoundsException陣列索引範圍超出例外
        calc(3);//0 //索引範圍只到2
        System.out.println(numerator +" / " + denominator[1] +" = " + answer);
        
        calc(2);//4
        System.out.println(numerator +" / " + denominator[2] +" = " + answer);
        System.out.println("計算完畢！");
        
    }
    
}
