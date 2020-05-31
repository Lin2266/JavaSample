
package Java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



//7.0 try-with-resources自動關閉
public class FileRW2 {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("E:\\LIN\\Lin.java");
             FileWriter fw = new FileWriter("E:\\LIN\\Lin3.java")){
            //將"Hello Java 7"字串寫入E:\\LIN\\Lin3.java
            fw.write("Hello Java 7");
            //flush() 輸出緩衝區的內容
            fw.flush();
            
            char[] data = new char[1];
            //將檔案讀出來
            while(fr.read(data) !=-1){
                
                System.out.print(new String(data));
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
