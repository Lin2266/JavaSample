
package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
讓程式可以直接擷取到使用者輸入(System.in)的資料，並利用PrintWriter()物件將取得的資料輸出(System.out)至螢幕上
*/
public class SystemInOut1 {

    public static void main(String[] args) {
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in);
             PrintWriter pw = new PrintWriter(System.out, true)){
            String s;
            while(true){
                pw.println("請輸入任意的字串(quit離開)");
                s = br.readLine();
                if(s.equals("quit")) break;
                pw.println("\n您所輸入的字串是 = " + s);
            }
        } catch (IOException e) {
        }
    }
    
}
