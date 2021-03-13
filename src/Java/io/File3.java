package Java.io;

import java.io.File;

public class File3 {

    public static void main(String[] args) {
        //指定檔案
        File file = new File("src/Java/io/NewFile.txt");
        File file2 = new File("src/Java/io/NewFile1.txt");
        //指定目錄
        File file3 = new File("src/Java/io/LIN");
        //另一個File實體，檔名字串
        File file4 = new File(file3,"NewFile12.txt");
        //是不是目錄
        System.out.println("file3isDirectory: " + file3.isDirectory());
        //把file改成file2的檔名
        boolean rename = file.renameTo(file2);
        System.out.println("rename:" + rename);
        System.out.println("NewFileRenameTo: " + file);
        //指定目錄裡的檔名
        System.out.println("NewFile4: " + file4);
        System.out.println("NewFile3: " + file3.getName());
        
    }
    
}
