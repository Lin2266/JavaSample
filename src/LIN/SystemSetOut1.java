
package IO;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
利用System.setIn、System.setOut、System.setErr可更改輸出與輸入介面
若想將所輸出的結果寫入檔案中而非輸出到螢幕上，可利用System.setOut來變更輸出裝置
*/
public class SystemSetOut1 {

    public static void main(String[] args) {
        try(InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            FileOutputStream fos = new FileOutputStream("src/IO/OutputFile.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream out = new PrintStream(bos, true)) {
            System.setOut(out);
            String s;
            while((s = br.readLine()).length() !=0){
                System.out.println("請輸入任意的字串(quit離開");
                if(s.equals("quit")) break;
                System.out.println("您所輸入的字串是 = " + s);
                
            }
            out.flush();//將緩衝區內容清出
            
        } catch (IOException e) {
        }
        
    }
    
}
