
package Java.io;

import java.io.File;

//isDirectory()判斷是否為目錄，可判斷目前所指的目錄下到底是子目錄還是檔案
public class File2 {

    public static void main(String[] args) {
        //C:\\Program Files\\Java\\jdk1.7.0_80\\
        String path = "C:/Program Files/Java/jdk1.7.0_80/";
        File f1 = new File(path);
        String[] fileList = f1.list();//用字串陣列來接收f1.list()傳回來的資料
        for(int i =0; i<fileList.length; i++){//將每個陣列元素取出，有可能是一個File或Directory
            //所取得的陣列元素內容上原始路徑再次建立File物件並指派給f2
            File f2 = new File(path + fileList[i]);
            //判斷是目錄還是檔案，也可改成isFile()來判斷是否為檔案
            if(f2.isDirectory())
                System.out.println(fileList[i] + " : 是目錄");
            else
                System.out.println(fileList[i] + " : 是檔案");
        }
    }
    
}
