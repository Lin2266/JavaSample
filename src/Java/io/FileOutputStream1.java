
package Java.io;

import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream(只輸出byte)，繼承Output stream
*/
public class FileOutputStream1 {

    public static void main(String[] args) {
        String s = "Java 輸入與輸出 ( java.io 函式庫 )";
        byte[] data = s.getBytes();//將字串s轉換成byte[]
        System.out.println("將字串\"" + s + "\"寫到檔案");
        System.out.println("資料長度:" + data.length + "bytes.");
        
        FileOutputStream fos = null;
        try {
            //建立物件實體並開啟NewFile2.txt(檔案不存在會自動建立)
            //true會將要加入的新文字接續在原始檔案文字之後，false會將原始文字清除，新增加的文字取代
        	//如果檔案是空的會發生java.lang.NullPointerException
            fos = new FileOutputStream("src/LIN/NewFile2.txt",true);
      //fos = new FileOutputStream("src/LIN/NewFile2.txt");如果改成這樣，第二個參數的預設是false
            fos.write(data);//直接將byte[]寫入指定的檔案裡
        } catch (IOException e) {
        }
        finally{
            try{
                fos.close();
            } catch (IOException e) {
                    }
        }
        
    }
    
}
