
package Java.io;

import java.io.BufferedReader;
import java.io.FileReader;
//7.0新寫法，try(){}自動關閉，不用finally區塊用close
public class BufferedReader1_1 {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/LIN/NewFile.txt");
            BufferedReader br = new BufferedReader(fr) ) {
            String data;
            while((data = br.readLine()) !=null){
                System.out.println(data);
            }
        } catch (Exception e) {
        }
    }
    
}
