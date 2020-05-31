
package Java.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//串流複製
//Files.copy(InputStream in, Path dest, CopyOption...options)
public class FilesStreamCopy1 {

    public static void main(String[] args) {
        String url = "http://www.oracle.com/technetwork/java/javadev-15-165770.jpg";
        //建立URI實體內含URL
        URI uri = URI.create(url);
        Path dest = Paths.get("E:/LIN/javadev.jpg");//複製存放的目的路徑
        
        Path path1 = Paths.get("E:/LIN/Lin1.java");
        Path path2 = Paths.get("E:/java練習題");
       
        try(InputStream in = uri.toURL().openStream()) {
            Files.copy(in, dest, StandardCopyOption.REPLACE_EXISTING);//把in(url)串流複製到dest目錄裡
            //移動檔案或目錄
            Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.ATOMIC_MOVE );
            
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
