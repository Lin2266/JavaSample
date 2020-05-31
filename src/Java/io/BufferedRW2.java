package Java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//加編號
public class BufferedRW2 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\LIN\\Lin2.java"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\LIN\\Lin6.java"))) {
            String s, space ="";
            int num = 0;
            while ((s=br.readLine()) !=null) {
                System.out.println(s);
                num++;
                //行數編號
                bw.write(String.valueOf(num));
                //行數編號完空格
                bw.write(space);
                //寫檔
                bw.write(s + "\n");//換行bw.newLine();都一樣      
            }
        } catch (IOException e) {
            System.out.println("無檔");
        }
    }
}
