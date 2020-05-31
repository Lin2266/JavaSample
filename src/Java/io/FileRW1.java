package Java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileRW1 {
    
    public static void main(String[] args) {
         //7.0以後的寫法，會自動close,就不需要加finally去執行close
        try (FileReader reader = new FileReader("E:\\LIN\\Lin.java");
             FileWriter writer = new FileWriter("E:\\LIN\\Lin5.java")) {
            int c;
            //跑一次印出一個字，-1代表輸出結束
            while ((c = reader.read()) != -1) {
                //println,不要加ln換行
                System.out.print((char) c);
                writer.write(c);
               
            }
            
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        }

        /*
        //讀一個字輸出一個字
        //把檔案內容讀進來顯示 
        FileReader reader = null;
        //檔案輸出
        FileWriter writer = null;
        
        try {
            //new FileReader把檔案讀進來
            reader = new FileReader("C:\\Lin.java");
            //會把檔案輸出會用文字檔寫在指定的地方裡，檔名自取
            writer = new FileWriter("C:\\Lin2.java");
            //read()一次讀取一個字
            int c = reader.read();
            //跑一次印出一個字，-1代表輸出結束
            while (c != -1) {
                //read讀入一個字writer就寫出一個字，會寫一個一模一樣的文字檔出來
                writer.write(c);
                c = reader.read();
            }

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        } //一定會執行，一定要做的工作放這裡，才不會例外發生被跳過
        finally {
            //因為呼叫close有問題還是要做例外處理
            
            if (reader != null) {
              try {
                //一定要記得加，輸入關閉
                reader.close();
                }
              
              catch (IOException e) {
                System.out.println("Error");
                }
            }
            
            if (writer != null) {
                try {
                    writer.close();
                }
                    catch (IOException e) {
                System.out.println("Error");
                }
            }
                    

        }
        */        
    }

}

      

    

