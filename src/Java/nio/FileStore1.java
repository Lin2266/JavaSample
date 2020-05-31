
package Java.nio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.text.DecimalFormat;

//檔案儲存裝置
public class FileStore1 {
//java7可透過Files.getFileStores(path)方法來取得指定path的檔案儲存裝置實體，若要取得本機上所有的儲存裝置實體
    //可以調用FileSystem物件下的getFileStores()方法來取得
    public static void main(String[] args) throws IOException {
       //取得作業系統預設檔案系統
        FileSystem fileSystem = FileSystems.getDefault();
       //取得本機上所有的儲存裝置實體並回傳一個Iterable<FileStore>
        Iterable<FileStore> fileStores = fileSystem.getFileStores();
       DecimalFormat format = new DecimalFormat("###,###");
       for(FileStore store:fileStores){
           //
           System.out.println(store + "\t容量:" + format.format(store.getTotalSpace()) + " bytes");
           System.out.println(store + "未使用容量" + format.format(store.getUnallocatedSpace()) + " bytes");
       }
    }
    
}
