
package Java.io;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriter1_1 {

    public static void main(String[] args) {
        //跟FileOutputStream寫法一樣 
       String data = "Java 輸入與輸出 ( java.io 函式庫 )";
       System.out.println("將字串\"" + data + "\"寫到檔案");
       System.out.println("資料長度:" + data.length() + "bytes.");
        //建立物件實體並開啟NewFile.txt(檔案不存在會自動建立)
        //true會將要加入的新文字接續在原始檔案文字之後，false會將原始文字清除，新增加的文字取代
        try(FileWriter fw = new FileWriter("src/LIN/NewFile2.txt", true)) {
            fw.write(data);//直接將String寫入檔案
        } catch (IOException e) {
        }
    }
    
}
