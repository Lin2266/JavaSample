
package Java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;

//ACL(Access Control List)存取控制列表屬性
public class AclFileAttributeView1 {
/*
    java7提供了AclFileAttributeView類別，可透過getAcl()與setAcl(List<AclEntry acl>來維護，ACL進一步讓
    AttributeView能夠獲取文件檔的系統資料，例如我們要得到該檔案的擁有者，就可透過AclFileAttributeView呼叫
    FileOwnerAttributeView介面中所定義的getOwner()以取得檔案擁有者
    */
    public static void main(String[] args) throws IOException {
       //取得檔案擁有者
        Path path = Paths.get("C:/Users/desktop.ini");
        AclFileAttributeView attr = Files.getFileAttributeView(path,AclFileAttributeView.class);
        System.out.println(attr.getOwner());//Owner擁有者
                                                                                                                     
    }
    
}
