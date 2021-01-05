package Java.io;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedRW1 {

    public static void main(String[] args) {
        //7.0以後的寫法，會自動close,就不需要加finally去執行close
        try (BufferedReader br = new BufferedReader(new FileReader("src/LIN/Lin1.java"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/LIN/Lin.java"))){
            String c;
            
            while ((c = br.readLine()) != null) {
               System.out.println(c);
                bw.write(c + "\n"); //換行同bw.newLine();                
            }            
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        }
        
        /*
        FileReader reader = null;
        BufferedReader br = null;
        //檔案輸出
        FileWriter writer = null;
        BufferedWriter bw = null;
        
        File rfile = new File("E:\\java練習題\\Lin.java");
        File wfile = new File("E:\\java練習題\\Lin2.java");
        
        try {
            //new FileReader把檔案讀進來
            reader = new FileReader(rfile);
            br = new BufferedReader(reader);
            //會把檔案輸出會用文字檔寫在指定的地方裡，檔名自取
            writer = new FileWriter(wfile);
            bw = new BufferedWriter(writer);
            //readLine()一次讀取一行字
            String s = br.readLine();
            //跑一次印出一行字
            while (s != null) {
                bw.write(s);
                s = br.readLine();
                
                System.out.println(s);
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
            if (br != null) {
              try {
                //一定要記得加，輸入關閉
                br.close();
                }
              
              catch (IOException e) {
                System.out.println("Error");
                }
            }
            
            if (bw != null) {
              try {
                //一定要記得加，輸入關閉
                bw.close();
                }
              
              catch (IOException e) {
                System.out.println("Error");
                }
            }
            
        }
         */
    }
    
}
