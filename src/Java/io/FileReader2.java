package Java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {

    public static void main(String[] args) {
        //7.0以後的寫法，會自動close,就不需要加finally去執行close
        try (FileReader reader = new FileReader("src/LIN/NewFile.txt")) {
            int c;
            //跑一次印出一個字，-1代表輸出結束(位元)
            while ((c = reader.read()) != -1) {
                //println,不要加ln換行,轉成char輸出
                System.out.print((char) c);                
            }            
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        }
        
        /*
        //讀一個字
        //把檔案內容讀進來顯示 
        FileReader reader = null;
        try {
            //new FileReader就是把檔案開起來
            reader = new FileReader("C:\\Lin.java");
            int c = reader.read();
            //跑一次印出一個字，-1代表輸出結束
            while (c != -1) {
                //println,不要加ln換行
                System.out.print((char) c);
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

        }
        */          
    }

}
