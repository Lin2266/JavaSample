
package Java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
三種標準I/O模式:

System.in:標準輸入裝置(standard input)是一個InputStream物件，但System.in不可單獨使用，必須內含於某個InputStream物件中

System.out:標準輸出裝置(standard output)是一個可以單獨使用的PrintStream物件

System.err:標準顯示錯誤裝置(standard error)也是一個可以單獨使用的PrintStream物件

System.in預設資料來源裝置是鍵盤，System.out、System.err預設的輸出裝置是螢幕

讓程式可以直接擷取到使用者輸入(System.in)的資料，並利用PrintWriter()物件將取得的資料輸出(System.out)至螢幕上
*/
public class SystemInOut1_1 {

    public static void main(String[] args) {
        try (
             //System.in傳進來一個Stream型態資料(Bytes),利用InputStreamReader將資料轉換為Unicode character  
             InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in);
             //true時會讓緩衝區內的資料自動清除，否則所輸入的資料會暫留緩衝區內，導致無法即時看見輸出的結果
             PrintWriter pw = new PrintWriter(System.out, true)){
            String s;
            while(true){
                //println()將資料輸出至螢幕
                pw.println("請輸入任意的字串(quit離開)");
                s = br.readLine();
                if(s.equals("quit")) break;
                pw.println("\n您所輸入的字串是 = " + s);
            }
        } catch (IOException e) {
        }
    }
    
}
