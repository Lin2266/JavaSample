
package Java.io;

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
public class SystemSetOut1_1 {

    public static void main(String[] args) {
        try(InputStreamReader in = new InputStreamReader(System.in);//讀字符
            BufferedReader br = new BufferedReader(in);
            //更改IO介面用Stream處理，必須使用下面三個類別來作檔案的輸出處理
            FileOutputStream fos = new FileOutputStream("src/LIN/OutputFile.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream out = new PrintStream(bos, true)) {
            //更改輸出裝置，將輸出裝置從原本的螢幕輸出更改成檔案輸出，把輸入的資料寫到OutputFile.txt檔中
            System.setOut(out);
            String s;
            //下面的字串全部都會寫在檔案裡，Console看不到，直接輸入即可
            while((s = br.readLine()).length() !=0){
                System.out.println("請輸入任意的字串(quit離開)");
                if(s.equals("quit")){
                	System.out.println("離開中...");
                	break;//字串s輸入的是quit就立刻離開break
                }
                System.out.println("您所輸入的字串是 = " + s);
                
            }
            out.flush();//將緩衝區內容清出
            
        } catch (IOException e) {
        }
        
    }
    
}
