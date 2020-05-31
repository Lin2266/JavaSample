package Java.text.Format1;

import java.text.DecimalFormat;

/*
 NumberFormat是一個abstract類別，其實作子類別:ChoiceFormat(選擇格式)與DecimalFormat(十進制格式)
 public abstract class DecimalFormat extends NumberFormat{}
 java.text套件中提供許多格式的類別，常用的格式轉換有:貨幣、日期、message訊息格式…等。
 如果要設定日期、時間、數值、貨幣等的顯示格式，可利用java.text套件中的NumberFormat類別來實現。
 
 假設:
 蘋果96元*每箱986顆*867箱=82066752元。

 這樣的數字直接顯示在電腦螢幕上不易閱讀，所以希望能改成以下這樣的方式輸出，以提供可讀性。
 82,066,752(加上千分號) 英文以千做區段，國際化的關係
 或
 8206,6752(加上萬分號)  中文以萬分做區分

DecimalFormat()的建構子也提供自訂格式化pattern的設計，相關符號有:
#:預告一個數字，若該位置沒有數值時則不顯示。
0:預告一個數字，若該位置沒有數值時則顯示0。
$:貨幣符號。
%:百分比符號

DecimalFormat十進制格式:可讓程式跑出來的數字內容更容易閱讀
 */
public class DecimalFormat1 {
//#跟0的差別
    public static void main(String[] args) {
        int apple = 96;
        int total = apple * 986 * 867;
        System.out.println("總共: " + total + "元.");
        DecimalFormat df = new DecimalFormat();
        //透過format()方法並使用default(預設)格式化(千分號)來格式化total的內容值
        System.out.println("總共: " + df.format(total) + "元.");
        System.out.println("--------------------------------");

        //自行設定,#跟0的差別在於pattern(格式)的位置若沒有數值時是否要顯示0
        DecimalFormat df1 = new DecimalFormat("###,####");//或"000,0000"
        System.out.println("總共: " + df1.format(total) + "元.");
        System.out.println("----------------------------------");

        //預設可以存放12位數的資料(實際值若超過也可以,總共:8206,6752元.
        DecimalFormat df2 = new DecimalFormat("###,###,####");
        System.out.println("總共: " + df2.format(total) + "元.");
        //跟#的差別在，實際值不足則補0,總共:00,8206,6752元.
        DecimalFormat df3 = new DecimalFormat("000,000,0000");
        System.out.println("總共: " + df3.format(total) + "元.");
    }

}
