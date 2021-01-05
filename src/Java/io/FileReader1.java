
package Java.io;

import java.io.FileReader;

/*
是InputStreamReader的子類別

*/
public class FileReader1 {

    public static void main(String[] args) {
       char[] buffer = new char[1];//一次讀一個char,中文、英文、半形 空格都佔用一個char
       FileReader fr = null;
       
        try {
            fr = new FileReader("src/LIN/NewFile.txt");
            System.out.println("讀取到 NewFile.txt 檔案內容");
            System.out.println("-------------------------------");
            //這種寫法是一邊將檔案資料寫入buffer，一邊判斷是否已到檔尾
            while (fr.read(buffer) != -1) {//-1表示已到檔尾或沒有資料                
                //一個英文字母與一個中文都是char
                System.out.print(new String(buffer));
            }
            System.out.println();
        } catch (Exception e) {
        }
        finally{
            try {
                fr.close();
            } catch (Exception e) {
            }
        }
           
       
    }
    
}
