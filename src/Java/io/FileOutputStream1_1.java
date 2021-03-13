
package Java.io;

//7.0新寫法，try(){}自動關閉，不用finally區塊用close

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1_1 {

    public static void main(String[] args) {
        String s = "Java 輸入與輸出 ( java.io 函式庫 )";
        byte[] data = s.getBytes();//將字串s轉換成byte[]
        System.out.println("將字串\"" + s + "\"寫到檔案");
        System.out.println("資料長度:" + data.length + "bytes.");
        
        //建立物件實體並開啟NewFile2.txt(檔案不存在會自動建立)
        //true會將要加入的新文字接續在原始檔案文字之後，false會將原始文字清除，新增加的文字取代
        //fos = new FileOutputStream("src/Java/io/NewFile2.txt");如果改成這樣，第二個參數的預設是false
        try (FileOutputStream fos = new FileOutputStream("src/Java/io/NewFile2.txt", false);){
            fos.write(data);//直接將byte[]寫入檔案
        } catch (IOException e) {//clos會拋出IOIOException，所以看是把例外加大還是另外在寫一個
        }
    }
    
}
