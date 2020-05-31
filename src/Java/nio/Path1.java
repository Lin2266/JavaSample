
package Java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
java7提供新的檔案系統NIO.2 API(nio.file)來取代老舊的io.file，除了簡化io的操作，也將程式辜寫加以標準化
任何檔案皆會被配置在所屬路徑之下，NIO.2的檔案操作是以Path起頭，Path/Paths用來定義檔案與目錄
*/

public class Path1 {

    public static void main(String[] args) {
      //透過Paths來取得預設檔案系統實體，Paths是Path的協助類別用來簡化操作程序
        Path path = Paths.get("E:/LIN/").normalize();//normalize()去除路徑中含.或..的冗餘路徑
        Path path2 = Paths.get("Lin.java");
        
        path = path2.resolve(path2);//resolve解析，把兩個路徑做結合
        System.out.println("getFileName:" + path.getFileName());
        System.out.println("getParent:" + path.getParent());
        System.out.println("getRoot:" + path.getRoot());
        System.out.println("getNameCount:" + path.getNameCount());
        //取得索引0(LIN)至2的元素資料，但不包含2
        System.out.println("subpath(0,2):" + path.subpath(0, 2));
        System.out.println("isAbsolute:" + path.isAbsolute());
        System.out.println("toAbsolutePath:" + path.toAbsolutePath());
        System.out.println("toUri:" + path.toUri());
        System.out.println("getName:" + path.getName(0));//0(LIN)
        System.out.println("----------------------------------------");
        //relativize路徑切換
        Path path3 = Paths.get("java練習");
        Path path4 = Paths.get("java練習/課程/OCPJP");
        Path path3_to_path4 = path3.relativize(path4);
        System.out.println("切換路徑:" + path3_to_path4);
        System.out.println("-----------------------------------");
        //比較頭尾路徑是否相同startsWith()/endsWith()
        Path path5 = Paths.get("E:/LIN/Lin.java");
        Path root = Paths.get("E:/");
        Path file = Paths.get("Lin.java");
        System.out.println(path5.startsWith(root));
        System.out.println(path5.endsWith(file));
    }
    
}
