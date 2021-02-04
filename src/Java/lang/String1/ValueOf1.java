
package Java.lang.String1;


/*
(1)Java的函式隸屬於某一個類別，函式擁有屬於自己的名稱，除非透過多載(overload)技術，否則不允許宣告兩個相同名稱的函式。
(2)函式內宣告的變數為『區域變數』，換句話說，在不同函式內可以使用相同的變數名稱，因為該變數只會在該函式中生效。

*/
public class ValueOf1 {
 //Java的函式與數學函數類似，在數學函數中，我們會規定該數學函數的定義域範圍，例如：x,y為任意正數
    public static void main(String[] args) {
        /*
        數學函數:
        z = f(x,y)     (x,y)輸入參數
        z是f(x,y)的輸出
        */
        //Java的函式:
        //我們也必須限制Java函式輸入引數的資料型態，例如：i必須為int型態
        int i = 100; 
        String str;
        str = String.valueOf(i); //i為輸入引數
        //str是valueOf()的回傳值
    }
    
}
