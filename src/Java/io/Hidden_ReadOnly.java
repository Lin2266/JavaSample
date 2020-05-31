
package Java.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//把檔案設定隱藏跟唯讀
public class Hidden_ReadOnly {

    public static void main(String[] args) {
        Path file = Paths.get("E:\\LIN\\Lin2");
        
        try {
            Files.createFile(file);
            Files.setAttribute(file,"hidden",false);
            Files.setAttribute(file,"readonly",true);
        //C:\>java Test"C:/temp/test.txt"
        } catch (IOException e) {
        }
    }
    
}
