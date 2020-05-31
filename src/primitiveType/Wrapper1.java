
package primitiveType;
/*
primitive wrapper classes(基本資料外包類別):
外包類別可以將基本資料型別物件化外，也提供許多好用的方法來操作這些物件化後的實體，又稱之為工具類別。
基本資料型別的外包類別所建立的內容和字串一樣具有永不改變的特性，所以物件在heap中的內容將不允許變更，除非重新再new一次

基本資料型別            外包類別
char                    Character
byte                    Byte
short                   Short
int                     Integer
long                    Long
float                   Float
double                  Double
boolean                 Boolean
*/


public class Wrapper1 {

    public static void main(String[] args) {
        //字串轉數字
        String x = "100";
        String y = "200";
        System.out.println("x + y = " + (x+y));
        System.out.println("字串轉數字…");
        int new_x = Integer.parseInt(x);
        int new_y = Integer.parseInt(y);
        System.out.println("new_x + new_y = " + (new_x + new_y));
        System.out.println("------------------------------------");
        
        //數字轉字串
        int a = 100;
        int b = 200;
        System.out.println("a + b = " + (a+b));
        System.out.println("數字轉字串…");
        String new_a = String.valueOf(a);
        String new_b = String.valueOf(b);
        System.out.println("new_a + new_b = " + (new_a + new_b));
        
    }
    
}
