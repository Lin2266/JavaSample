
package Java.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


//遞迴尋訪目錄樹:
//利用DirectoryStream與FileVisitor介面接口來遞迴尋訪目錄樹
//目錄資源列表:類別可協助走訪指定目錄下的資源檔案，並可過濾(filter)要查詢走訪的資料
public class DirectoryStream1 {

    public static void main(String[] args) {
        Path dir = Paths.get("E:/LIN");
        //要走訪查找的副檔名,{java,htm,dat}之間要用","隔間，不可加入空白{java, htm, dat}
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir,"*.{java,htm,dat}")){
            for(Path entry:stream){//entry項目
                System.out.println(entry.getFileName());
            }
            
        } catch (IOException e) {
            System.out.println("Caught IOException:" + e.getMessage());//Caught捕捉，Message訊息
        }
    }
    
}
