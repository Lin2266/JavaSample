
package Java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//7.0新寫法，try(){}自動關閉，不用finally區塊用close
public class BufferedWriter1_1 {

    public static void main(String[] args) {
            String[] data = new String[2];
            data[0] = "\n1z0-803";
            data[1] = "1z0-804";
            //true會將要加入的新文字接續在原始檔案文字之後，false會將原始文字清除，新增加的文字取代
        try(FileWriter fw = new FileWriter("src/IO/NewFile2.txt", false);
            BufferedWriter bw = new BufferedWriter(fw) ) {
            for(int i=0;i<data.length;i++){
                bw.write(data[i] + "\n");//這樣也可以換行
               //bw.newLine();//加入新的一行空格，換行
            }
            /*加強行迴圈
            for(String s:data){
                bw.write(s + "\n");
                bw.newLine();
            }
            */
             
        } catch (IOException e) {
        }
    }
    
}
