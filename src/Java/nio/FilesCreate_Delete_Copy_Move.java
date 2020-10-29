package Java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/*
 利用Files類別來建立、檢查、刪除、複製與移動檔案或目錄

 建立檔案: Files.createFile(Path dir)
 建立目錄: Files.createDirectory(Path dir)
 Files.deleteIfExists(Path dir)
 刪除檔案/目錄: Files.delete(Path dir)
 Files.deleteIfExists(Path dir)
 複製檔案/目錄: Files.copy(Path source, Path dest, CopyOption(複製選項)...options)
 Files.copy(InputStream in, Path dest, CopyOption...options)
 移動檔案/目錄: Files.move(Path source, Path dest, CopyOption...options)

 常見的CopyOption(複製選項)介面實作Enum型別參數:
 StandardCopyOption.REPLACE_EXISTING: 目的端有相同的檔案存在則取代
 StandardCopyOption.COPY_ATTRIBUTES:  複製屬性
 LinkOption.NOFOLLOW_LINKs:           不會跟隨符號連結(符號連結:創建NTFS檔案系統中檔或目錄的連結)
 StandardCopyOption.ATOMIC_MOVE:      原子移動
 */

public class FilesCreate_Delete_Copy_Move {

    //建立檔案
    public static void createFile() throws IOException {
        Path target = Paths.get("src/Java/nio/study-copy.txt");
//        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw");
//        FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);
        Files.createFile(target);
    }

    //刪除檔案
    public static void deleteFile() throws IOException {
        Path target = Paths.get("src/Java/nio/study-copy.txt");
        Files.delete(target);
    }

    //複製檔案
    public static void copyFile() throws IOException {
        Path source = Paths.get("src/Java/nio/study-copy.txt");
        Path target = Paths.get("src/Java/nio/study-copy2.txt");
        Files.copy(source, target, REPLACE_EXISTING);
    }

    //移動檔案
    public static void moveFile() throws IOException {
        Path source = Paths.get("src/Java/nio/study-copy.txt");//來源
        Path target = Paths.get("src/Java/io/study-copy.txt");//目的

        Files.move(source, target, REPLACE_EXISTING);//替換現有，屬性會一起
    }

    public static void main(String[] args) {
        //簡易新增、複製、刪除、移動
         Path source = Paths.get("src/Lin.java");
         Path dest = Paths.get("src/Lin.java");
         try {
            //Files.createFile(source);
            //Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);//目的端有相同的檔案存在則取代
            //Files.delete(dest);
            Files.move(source, dest,REPLACE_EXISTING);
         } catch (IOException e) {
         e.printStackTrace(System.out);
         }
         
        /*
        try {
            long start = System.currentTimeMillis();
            //createFile();
            //deleteFile();
            //copyFile();
            moveFile();

            long end = System.currentTimeMillis();
            System.out.println("consume -> " + (end - start));//consume消耗
        } catch (IOException e) {
            e.printStackTrace();
        }
                */
    }
}


