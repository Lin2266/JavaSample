
package Java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

//基礎檔案屬性
public class BasicFileAttributes1 {
/*
基礎檔案屬性可以取得在各種檔案系統下都支援的屬性，提供的方法有
    方法                回傳值      說明
    size()              long        取得指定檔案的容量大小(bytes)
    isDirectory()       boolean     是否是目錄
    isRegularFile()     Boolean     是否是RegularFile(常規檔案)
    isSymbolicLink()    Boolean     是否是符號連結
    isOther()           boolean     是否是非目錄、RegularFile或符號連結
    lastAccessTime()    FileTime    最後存取時間   
    lastModifiedTime()  FileTime    最後修改時間
*/
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:/employee.xls");
       //取得基本檔案屬性的實體
        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(path);
        System.out.println("size:" + attr.size() +" bytes");
        System.out.println("isDirectory:" + attr.isDirectory());
        System.out.println("isRegularFile:" + attr.isRegularFile());
        System.out.println("isSymbolicLink:" + attr.isSymbolicLink());
        System.out.println("isOther:" + attr.isOther());
        //這兩個會得到一個FileTime物件，用來表示檔案時間屬性的值
        System.out.println("lastAccessTime:" + attr.lastAccessTime());
        System.out.println("lastModifiedTime:" + attr.lastModifiedTime());
        //取得最後修改時間
        System.out.println("lastModifiedTime;" + Files.getLastModifiedTime(path));
    }
    
}
