
package Java.lang.String1;

/*
String.format字串格式化

String.format是一個靜態函數，可以直接使用，將字串依設定的位置或格式回傳出來。

如需顯示三位數的字串數字，前方補零，則可利用以下方法：
 */
public class StringFormat4 {

    public static void main(String[] args) {
        String formatStr = "%03d";//3個數字0
        String formatAns = String.format(formatStr, 12);
        System.out.println("數字補零:"+formatAns);
        //數字補零:012
    }
    
}
