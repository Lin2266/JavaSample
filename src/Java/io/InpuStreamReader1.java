
package Java.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
資料編碼轉換:(InpuStreamReader在資料轉換上與OutputStreamWriter相反)
InpuStreamReader是將byte streams的資料轉換為character streams的橋樑，
可利用指定的字元集將byte解碼(decode)至character中讀取

建構子                                                      說明
InpuStreamReader(InputStream in, String charsetName)        in是資料來源端，charsetName是字元集名稱   
*/
public class InpuStreamReader1 {

    public static void main(String[] args) {
        //資料輸入解碼
        //Block of code...
        try (   //socket(插座)建立網路連接時使用
                Socket so = new Socket("localhost", 8080);
             InputStream is = so.getInputStream();
                //利用ISO8859_1來解碼input的資料
             InputStreamReader ir = new InputStreamReader(is,"ISO8859_1")){
        	
            
        } catch (IOException ex) {
           
        }
    }
    
}
