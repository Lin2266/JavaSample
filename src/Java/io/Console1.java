
package Java.io;

import java.io.Console;

/*
Java SE 6新增的類，主要可以在程式中輕易取得標準輸入輸出裝置的Console物件，以字元導向為基礙的主控台裝置，
被設計用來處理字元模式下之主控台標準文字輸入輸出，也提供format()與printf()用來格式化輸出的資訊，
也提供reader()與writer()方法藉以取得Reader、Writer物件以進行其它IO處理

Java提供三種標準I/O模式:
1.System.in:標準輸入裝置，是一個InputStream物件(預設資料來源裝置是鍵盤)
2.System.out:標準輸出裝置，是一個可以單獨使用的PrintStream物件(預設輸出裝置是螢幕)
3.System.err:標準顯示錯誤裝置，也是一個可以單獨使用的PrintStream物件(預設輸出裝置是螢幕)

IO介面輸出輸入關係圖:
                                    (PrintStream) ---> Sink
Source (InputStream) ---> 〇 ---> 〇
                                    (PrintStream) ---> Sink
*/
public class Console1 {

    public static void main(String[] args) {
        //簡易輸入輸出
        Console console = System.console();
        
        String name = console.readLine("請輸入名稱:");
        
        char[] password = console.readPassword("請輸入密碼:");
        System.out.println();
        System.out.println("您輸入的名稱 ==> " + name);
        System.out.println("您輸入的密碼 ==> " + new String(password));
    }
    
}
