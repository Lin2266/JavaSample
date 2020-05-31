
package Java.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.nio.file.attribute.DosFileAttributes;

//傳統的DOS的文件屬性
public class DosFileAttributes1 {
    /*
    DosFileAttributes在與檔案相關聯的文件系統中將支持傳統的DOS的文件屬性，
    並透過單一的方法調用取得DosFileAttributes實體，例如:
    DosFileAttributes attrs = Files.readAttibutes(path,DosFileAttributes.class);
    
    四個新增的主要方法:
    方法名稱                說明
    boolean isArchive()     是否是一個檔案，Archive存檔
    boolean isHidden()      是否已隱藏
    boolean isReadOnly()    是否是唯讀
    boolean isSystem()      是否是一個操作系統
    
    */
    public static void main(String[] args) throws IOException {
        //失敗
//       File file = new File("quarter1.txt");
//       file.createNewFile();
       Path source = Paths.get("quarter1.txt");
       Path target = Paths.get("consolidate.txt");
       Files.copy(source, target, REPLACE_EXISTING);
       DosFileAttributes attr = Files.readAttributes(target, DosFileAttributes.class);
        System.out.println(attr.isHidden());
    }
    
}
