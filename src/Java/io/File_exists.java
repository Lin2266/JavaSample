
package Java.io;

import java.io.File;
import java.io.IOException;

/*
File類別並不是一個檔準的I/O類別，在io類別函式庫中它是唯一的non-stream(非串流)，既不能讀取檔案內容，也不能改變檔案
內容，主要作用是收集檔案(或目錄)的相關資訊，例如:
建立檔案、修改檔名、設定檔案屬性、測試或檢查檔案、建立目錄、顯示某目錄中一組的檔案名稱等...

建立File類別(new File(XXX))並不會在實體檔案系統中建立一個真實的檔案，因為new File(XXX)只是在記憶體Heap區塊中建立
一個類別物件的實例(instance)，必須搭配creatnNewFile()方法才可以在指定的檔案系統中建立真實檔案，xxx表示欲建立的檔名
例如:NewFile.txt，目錄分隔檔記:/(除號)或\\(反斜線)

File有四個常數:
pathSeparator(路徑分隔符)、pathSeparatorChar(路徑分隔符字符)、Separator(分隔符)、SeparatorChar(分隔符字符)

單獨使用File物件類別不能直接存取檔案內容，必須配合FileReader或FileWriter物件類別的使用

File建構子				說明
File(File parent, String child)		parent(父母親):另一個File instance; child(兒童):檔名字串

File(String pathname)			pathname:可以是一個路徑字串，檔案夾名稱或檔名字串

File(String parent, String child)	parent:路徑字串;child:檔名字串

*/
public class File_exists {

    public static void main(String[] args) {
        //f是目前所在目錄下的NewFile.txt
        File f = new File("src/Java/io/NewFile3.txt");//src為MyJava裡的目錄，路徑有套件時.要換/
        System.out.println("檔案是否存在？" + f.exists());//exists()判斷檔案或目錄是否存在
        //如果檔案不存在
        if(!f.exists()){
            System.out.println("利用 createNewFile() 建立新檔案，是否建立成功？");
            try {
                System.out.println(f.createNewFile());//指定目錄下建立新檔
                System.out.println("檢查新建檔案是否存在？" + f.exists());
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        
    }
    
}
