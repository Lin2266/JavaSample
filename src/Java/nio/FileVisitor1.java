
package Java.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
/*
遞迴尋訪目錄樹:
利用DirectoryStream與FileVisitor介面接口來遞迴尋訪目錄樹
FileVisitResult(檔案走訪結果)類別
常數                                說明
FileVisitResult.CONTINUE            繼續尋訪下一個節點
FileVisitResult.SKIP_SIBLINGS       跳過同層的其他目錄結構
FileVisitResult.SKIP_SUBTREE        跳過目前的目錄結構
FileVisitResult.TERMINATE           中斷
*/

//實作FileVisitor(檔案走訪)介面:各方法間呼叫有順序
//java7有提供繼承SimpleFileVisitor類別，可覆寫方法來替代實作FileVisitor介面上的繁冗
public class FileVisitor1 implements FileVisitor<Path>{
    //preVisitDirectory(預走訪目錄)每一次走訪檔案或目錄"前"要做的事
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        
        return FileVisitResult.CONTINUE;
    }
    //visitFile(走訪檔案)每一次走訪檔案或目錄"時"做的事
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //每次尋訪到檔案就要調用printFile(file)方法
        printFile(file);
        //尋訪完畢後回傳，表示繼續遞迴進行尋訪下一個節點(檔案或目錄)
        return FileVisitResult.CONTINUE;//繼續尋訪下一個節點
    }
    //visitFileFailed(走訪檔案失敗)每一次走訪檔案或目錄"失敗時"要做的事
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        throw new IOException("Faild");//Faild失敗
    }
    //postVisitDirectory(郵寄走訪目錄)每一次走訪完檔案或目錄"後"要做的事
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
    //打印檔案
    private void printFile(Path file){
        System.out.println(file);
    }
    
    public static void main(String[] args) throws IOException {
        //walkFileTree(行走檔案樹)走訪目錄全部的檔案
        Files.walkFileTree(Paths.get("E:/Lin"), new FileVisitor1());
    }
    
}
