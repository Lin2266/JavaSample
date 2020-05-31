
package Java.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


/*
繼承SimpleFileVisitor(簡單檔案走訪)與PathMatcher(路徑匹配器)過濾器的使用
java7有提供繼承SimpleFileVisitor類別，可覆寫方法來替代實作FileVisitor介面上的繁冗，
透過PathMatcher過濾器與Glob(水珠)參數的搭配讓協尋目錄檔案更加方便與快速

Glob(水珠)符號      說明
*                   比對0~多個字元
**                  跨目錄比對0~多個字元
?                   比對1個字元
{}                  集合比對，例如:{jpg,gif}比對jpg或gif
[]                  比對任一字元，例如:[0~9]比對0~9任一字元
\                   跳脫字元

*/
public class SimpleFileVisitor1 extends SimpleFileVisitor<Path>{
    private final PathMatcher matcher;//定義尋找指定的匹配檔案
    
    SimpleFileVisitor1(){
        //取得PathMatcher實體並設定glob，在指定目錄下檔案的副檔名是設定的這些，全部都要取出
        matcher = FileSystems.getDefault().getPathMatcher("glob:*.{htm,txt,xml}");
    }
    //搜尋
    private void search(Path file){
        Path name = file.getFileName();
        //進行檔名匹配
        if(name != null && matcher.matches(name)){
            System.out.print("比對成功: " + name + "\t");
            System.out.println("完整路徑: " + file);
        }
    }
    //走訪檔案
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //每次走訪到檔案就調用
        search(file);
        //走訪完畢就回傳，表示繼續遞迴進行尋訪下一個節點(檔案或目錄)
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        //搜尋檔案跟完整路徑
        Files.walkFileTree(Paths.get("E:/LIN"), new SimpleFileVisitor1());
    }
    
}
