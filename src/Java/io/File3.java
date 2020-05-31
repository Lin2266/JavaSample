package Java.io;

import java.io.File;

public class File3 {

    public static void main(String[] args) {
        //指定檔案
        File file = new File("E:\\LIN\\Lin.java");
        File file2 = new File("E:\\LIN\\Lin5.java");
        //指定目錄
        File file3 = new File("E:\\LIN");
        //另一個File實體，檔名字串
        File file4 = new File(file3,"Lin1.java");
        //是不是目錄
        System.out.println(file3.isDirectory());
        //把file改成file2的檔名
        file.renameTo(file2);
        //指定目錄裡的檔名
        System.out.println(file4);
        System.out.println(file3.getName());
        
    }
    
}
