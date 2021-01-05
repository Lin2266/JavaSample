
package Java.io;
import java.io.FileReader;
import java.io.IOException;

//7.0新寫法，try(){}自動關閉，不用finally區塊用close
public class FileReader1_1 {

    public static void main(String[] args) {
        char[] buffer = new char[1];//一次讀一個char,中文、英文、半形 空格都佔用一個char         
        try(FileReader fr = new FileReader("src/LIN/NewFile.txt");) {
            System.out.println("讀取到 NewFile.txt 檔案內容");
            System.out.println("-------------------------------");
            while (fr.read(buffer) != -1) {                
                //一個英文字母與一個中文都是char
                System.out.print(new String(buffer));
            }
            System.out.println();
        } catch (IOException e) {
        }
    }
    
}
