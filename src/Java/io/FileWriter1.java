
package Java.io;

import java.io.FileWriter;
import java.io.IOException;

/*
是OutputStreamWriter的子類別
建構子                          說明
FileWriter(File file)           建立一個FileWriter物件，並指定一個File類別物件file

FileWriter(FileDescriptor fd)   建立一個FileWriter物件，並指定一個FileDescriptor(檔案目錄)類別物件fd

FileWriter(String fileName)     建立一個FileWriter物件，並給定檔案名稱

FileWriter(String fileName,     建立一個FileWriter物件，並指定一個File類別物件與boolean append，若append(附加)
           boolean append)      變數設定為true，表示可以將新增資料加在原始資料後面，若false，則表示新增的資料將
                                覆蓋取代原始資料
*/
public class FileWriter1 {

    public static void main(String[] args) {
       
       //跟FileOutputStream寫法一樣 
       String data = "Java 輸入與輸出 ( java.io 函式庫 )";
       System.out.println("將字串\"" + data + "\"寫到檔案");
       System.out.println("資料長度:" + data.length() + "bytes.");
       
       FileWriter fw = null;
        try {
            //建立物件實體並開啟NewFile.txt(檔案不存在會自動建立)
            //true會將要加入的新文字接續在原始檔案文字之後，false會將原始文字清除，新增加的文字取代
            fw = new FileWriter("src/Java/io/NewFile2.txt", true);
            fw.write(data);//直接將String寫入檔案
        } catch (IOException e) {
        }
        finally{
            try{
                fw.close();//關閉檔案，資源沒關閉會沒辦法寫入
            } catch (IOException e) {
                    }
        }
    }
    
}
